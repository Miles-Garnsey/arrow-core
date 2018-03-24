package arrow.free

import arrow.Kind
import arrow.core.Eval
import arrow.core.ForEval
import arrow.core.applicative
import arrow.core.fix
import arrow.higherkind
import arrow.typeclasses.FunctionK
import arrow.typeclasses.Functor
import arrow.typeclasses.Monad
import arrow.typeclasses.Traverse

typealias CofreeEval<S, A> = Kind<S, Cofree<S, A>>

@higherkind
data class Cofree<S, A>(val FS: Functor<S>, val head: A, val tail: Eval<CofreeEval<S, A>>) : CofreeOf<S, A>, CofreeKindedJ<S, A>, Functor<S> by FS {

    fun tailForced(): CofreeEval<S, A> = tail.value()

    inline fun <B> transform(f: (A) -> B, noinline g: (Cofree<S, A>) -> Cofree<S, B>): Cofree<S, B> = Cofree(FS, f(head), tail.map { map(it, g) })

    fun <B> map(f: (A) -> B): Cofree<S, B> = transform(f, { it.map(f) })

    fun mapBranchingRoot(fk: FunctionK<S, S>): Cofree<S, A> = Cofree(FS, head, tail.map { fk(it) })

    // Due to the recursive nature of this function, it cannot be reified for FT to use functor<T>()
    fun <T> mapBranchingS(fk: FunctionK<S, T>, FT: Functor<T>): Cofree<T, A> = Cofree(FT, head, tail.map { ce -> fk(map(ce, { it.mapBranchingS(fk, FT) })) })

    // Due to the recursive nature of this function, it cannot be reified for FT to use functor<T>()
    fun <T> mapBranchingT(fk: FunctionK<S, T>, FT: Functor<T>): Cofree<T, A> = FT.run {
        Cofree(this, head, tail.map { ce -> map(fk(ce), { it.mapBranchingT(fk, this) }) })
    }

    fun <B> coflatMap(f: (Cofree<S, A>) -> B): Cofree<S, B> = Cofree(FS, f(this), tail.map { map(it, { coflatMap(f) }) })

    fun duplicate(): Cofree<S, Cofree<S, A>> = Cofree(FS, this, tail.map { map(it, { duplicate() }) })

    fun runTail(): Cofree<S, A> = Cofree(FS, head, Eval.now(tail.value()))

    fun run(): Cofree<S, A> = Cofree(FS, head, Eval.now(tail.map { map(it, { it.run() }) }.value()))

    fun extract(): A = head

    fun <B> cata(folder: (A, Kind<S, B>) -> Eval<B>, TF: Traverse<S>): Eval<B> {
        val ev: Eval<Kind<S, B>> = TF.run { Eval.applicative().traverse(tailForced(), { it.cata(folder, TF) }).fix() }
        return ev.flatMap { folder(extract(), it) }
    }

    fun <F, M, A, B> Cofree<F, A>.cataM(folder: (A, Kind<F, B>) -> Kind<M, B>, inclusion: FunctionK<ForEval, M>, TF: Traverse<F>, MM: Monad<M>): Kind<M, B> = MM.run {
        fun loop(ev: Cofree<F, A>): Eval<Kind<M, B>> {
            val looped: Kind<M, Kind<F, B>> = TF.run { traverse(ev.tailForced(), { inclusion(Eval.defer { loop(it) }).flatten() }) }
            val folded: Kind<M, B> = looped.flatMap { fb -> folder(ev.head, fb) }
            return Eval.now(folded)
        }
        inclusion(loop(this@cataM)).flatten()
    }

    companion object {
        fun <S, A> unfold(FS: Functor<S>, a: A, f: (A) -> Kind<S, A>): Cofree<S, A> = create(a, f, FS)

        fun <S, A> create(a: A, f: (A) -> Kind<S, A>, FS: Functor<S>): Cofree<S, A> = FS.run {
            Cofree(this, a, Eval.later { map(f(a), { create(it, f, this) }) })
        }

    }
}
