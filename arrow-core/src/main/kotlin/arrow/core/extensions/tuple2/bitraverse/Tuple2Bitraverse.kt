package arrow.core.extensions.tuple2.bitraverse

import arrow.Kind
import arrow.core.ForTuple2
import arrow.core.Tuple2
import arrow.core.Tuple2.Companion
import arrow.core.extensions.Tuple2Bitraverse
import arrow.typeclasses.Applicative
import kotlin.Deprecated
import kotlin.Function1
import kotlin.PublishedApi
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * cached extension
 */
@PublishedApi()
internal val bitraverse_singleton: Tuple2Bitraverse = object :
    arrow.core.extensions.Tuple2Bitraverse {}

@JvmName("bitraverse")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "bitraverse(arg1, arg2, arg3)",
  "arrow.core.bitraverse"
  ),
  DeprecationLevel.WARNING
)
fun <G, A, B, C, D> Kind<Kind<ForTuple2, A>, B>.bitraverse(
  arg1: Applicative<G>,
  arg2: Function1<A, Kind<G, C>>,
  arg3: Function1<B, Kind<G, D>>
): Kind<G, Kind<Kind<ForTuple2, C>, D>> = arrow.core.Tuple2.bitraverse().run {
  this@bitraverse.bitraverse<G, A, B, C, D>(arg1, arg2, arg3) as arrow.Kind<G,
    arrow.Kind<arrow.Kind<arrow.core.ForTuple2, C>, D>>
}

@JvmName("bisequence")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "bisequence(arg1)",
  "arrow.core.bisequence"
  ),
  DeprecationLevel.WARNING
)
fun <G, A, B> Kind<Kind<ForTuple2, Kind<G, A>>, Kind<G, B>>.bisequence(arg1: Applicative<G>):
    Kind<G, Kind<Kind<ForTuple2, A>, B>> = arrow.core.Tuple2.bitraverse().run {
  this@bisequence.bisequence<G, A, B>(arg1) as arrow.Kind<G,
    arrow.Kind<arrow.Kind<arrow.core.ForTuple2, A>, B>>
}

@JvmName("bimap")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "bimap(arg1, arg2)",
  "arrow.core.bimap"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D> Kind<Kind<ForTuple2, A>, B>.bimap(arg1: Function1<A, C>, arg2: Function1<B, D>):
    Tuple2<C, D> = arrow.core.Tuple2.bitraverse().run {
  this@bimap.bimap<A, B, C, D>(arg1, arg2) as arrow.core.Tuple2<C, D>
}

/**
 *  ank_macro_hierarchy(arrow.typeclasses.Bitraverse)
 *
 *  The type class `Bitraverse` defines the behaviour of two separetes `Traverse` over a data type.
 *
 *  Every instance of `Bitraverse<F>` must contains the next functions:
 *
 *  ## Bitraverse
 *
 *  `Bitraverse` perfoms a`Traverse` over both side of the Data type which is `Bifoldable`.
 *
 *  ```kotlin:ank:playground
 *  import arrow.core.*
 *  import arrow.core.extensions.option.applicative.applicative
 *  import arrow.core.extensions.*
 *  import arrow.core.extensions.tuple2.bitraverse.bitraverse
 *  fun main() {
 *  //sampleStart
 *  val f: (Int) -> Option<Int> = { Some(it + 1) }
 * 3) }
 *
 *  val tuple = Tuple2(1, 2)
 *  val bitraverseResult = tuple.bitraverse(Option.applicative(), f, g)
 *  //sampleEnd
 *  println(bitraverseResult)
 *  }
 *  ```
 *
 *  ## Bisequence
 *
 *  `Bisequence` invert the original structure `F<G<A,B>>` to `G<F<A>,F<B>>`
 *  ```kotlin:ank:playground
 *  import arrow.core.*
 *  import arrow.core.extensions.*
 *  import arrow.core.extensions.option.applicative.applicative
 *  import arrow.core.extensions.tuple2.bitraverse.bisequence
 *  fun main() {
 *  //sampleStart
 *  val tuple = Tuple2(Some(1), Some(2))
 *  val sequenceResult = tuple.bisequence(Option.applicative())
 *  //sampleEnd
 *  println(sequenceResult)
 *  }
 *  ```
 */
@Suppress(
  "UNCHECKED_CAST",
  "NOTHING_TO_INLINE"
)
inline fun Companion.bitraverse(): Tuple2Bitraverse = bitraverse_singleton