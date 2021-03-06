package arrow.core.extensions.ior.hash

import arrow.core.Ior
import arrow.core.Ior.Companion
import arrow.core.extensions.IorHash
import arrow.typeclasses.Hash
import kotlin.Deprecated
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmName

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
  "hash(HL, HR)",
  "arrow.core.hash"
  ),
  DeprecationLevel.WARNING
)
fun <L, R> Ior<L, R>.hash(HL: Hash<L>, HR: Hash<R>): Int = arrow.core.Ior.hash<L, R>(HL, HR).run {
  this@hash.hash() as kotlin.Int
}

@Suppress(
  "UNCHECKED_CAST",
  "NOTHING_TO_INLINE"
)
inline fun <L, R> Companion.hash(HL: Hash<L>, HR: Hash<R>): IorHash<L, R> = object :
    arrow.core.extensions.IorHash<L, R> { override fun HL(): arrow.typeclasses.Hash<L> = HL

  override fun HR(): arrow.typeclasses.Hash<R> = HR }
