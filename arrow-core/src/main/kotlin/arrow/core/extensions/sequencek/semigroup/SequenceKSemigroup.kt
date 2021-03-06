package arrow.core.extensions.sequencek.semigroup

import arrow.core.SequenceK
import arrow.core.SequenceK.Companion
import arrow.core.extensions.SequenceKSemigroup
import kotlin.Any
import kotlin.Deprecated
import kotlin.PublishedApi
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * cached extension
 */
@PublishedApi()
internal val semigroup_singleton: SequenceKSemigroup<Any?> = object : SequenceKSemigroup<Any?> {}

@JvmName("plus")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "plus(arg1)",
  "arrow.core.plus"
  ),
  DeprecationLevel.WARNING
)
operator fun <A> SequenceK<A>.plus(arg1: SequenceK<A>): SequenceK<A> =
    arrow.core.SequenceK.semigroup<A>().run {
  this@plus.plus(arg1) as arrow.core.SequenceK<A>
}

@JvmName("maybeCombine")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "maybeCombine(arg1)",
  "arrow.core.maybeCombine"
  ),
  DeprecationLevel.WARNING
)
fun <A> SequenceK<A>.maybeCombine(arg1: SequenceK<A>): SequenceK<A> =
    arrow.core.SequenceK.semigroup<A>().run {
  this@maybeCombine.maybeCombine(arg1) as arrow.core.SequenceK<A>
}

@Suppress(
  "UNCHECKED_CAST",
  "NOTHING_TO_INLINE"
)
inline fun <A> Companion.semigroup(): SequenceKSemigroup<A> = semigroup_singleton as
    arrow.core.extensions.SequenceKSemigroup<A>
