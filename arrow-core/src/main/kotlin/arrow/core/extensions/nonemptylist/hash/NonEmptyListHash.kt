package arrow.core.extensions.nonemptylist.hash

import arrow.core.NonEmptyList
import arrow.core.NonEmptyList.Companion
import arrow.core.extensions.NonEmptyListHash
import arrow.typeclasses.Hash

@JvmName("hash")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "hash(HA)",
    "arrow.core.hash"
  ),
  DeprecationLevel.WARNING
)
fun <A> NonEmptyList<A>.hash(HA: Hash<A>): Int = arrow.core.NonEmptyList.hash<A>(HA).run {
  this@hash.hash() as kotlin.Int
}

@Suppress(
  "UNCHECKED_CAST",
  "NOTHING_TO_INLINE"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "Hash.nonEmptyList(HA)",
    "arrow.core.nonEmptyList", "arrow.typeclasses.Hash"
  ),
  DeprecationLevel.WARNING
)
inline fun <A> Companion.hash(HA: Hash<A>): NonEmptyListHash<A> = object :
    arrow.core.extensions.NonEmptyListHash<A> { override fun HA(): arrow.typeclasses.Hash<A> = HA }
