package arrow.core.extensions.sequencek.alternative

import arrow.Kind
import arrow.core.ForSequenceK
import arrow.core.Option
import arrow.core.SequenceK
import arrow.core.SequenceK.Companion
import arrow.core.extensions.SequenceKAlternative
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Function0
import kotlin.PublishedApi
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * cached extension
 */
@PublishedApi()
internal val alternative_singleton: SequenceKAlternative = object :
    arrow.core.extensions.SequenceKAlternative {}

@JvmName("some")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "some()",
  "arrow.core.some"
  ),
  DeprecationLevel.WARNING
)
fun <A> Kind<ForSequenceK, A>.some(): SequenceK<SequenceK<A>> =
    arrow.core.SequenceK.alternative().run {
  this@some.some<A>() as arrow.core.SequenceK<arrow.core.SequenceK<A>>
}

@JvmName("many")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "many()",
  "arrow.core.many"
  ),
  DeprecationLevel.WARNING
)
fun <A> Kind<ForSequenceK, A>.many(): SequenceK<SequenceK<A>> =
    arrow.core.SequenceK.alternative().run {
  this@many.many<A>() as arrow.core.SequenceK<arrow.core.SequenceK<A>>
}

@JvmName("alt")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "alt(arg1)",
  "arrow.core.alt"
  ),
  DeprecationLevel.WARNING
)
infix fun <A> Kind<ForSequenceK, A>.alt(arg1: Kind<ForSequenceK, A>): SequenceK<A> =
    arrow.core.SequenceK.alternative().run {
  this@alt.alt<A>(arg1) as arrow.core.SequenceK<A>
}

@JvmName("orElse")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "orElse(arg1)",
  "arrow.core.orElse"
  ),
  DeprecationLevel.WARNING
)
fun <A> Kind<ForSequenceK, A>.orElse(arg1: Kind<ForSequenceK, A>): SequenceK<A> =
    arrow.core.SequenceK.alternative().run {
  this@orElse.orElse<A>(arg1) as arrow.core.SequenceK<A>
}

@JvmName("combineK")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "combineK(arg1)",
  "arrow.core.combineK"
  ),
  DeprecationLevel.WARNING
)
fun <A> Kind<ForSequenceK, A>.combineK(arg1: Kind<ForSequenceK, A>): SequenceK<A> =
    arrow.core.SequenceK.alternative().run {
  this@combineK.combineK<A>(arg1) as arrow.core.SequenceK<A>
}

@JvmName("optional")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "optional()",
  "arrow.core.optional"
  ),
  DeprecationLevel.WARNING
)
fun <A> Kind<ForSequenceK, A>.optional(): SequenceK<Option<A>> =
    arrow.core.SequenceK.alternative().run {
  this@optional.optional<A>() as arrow.core.SequenceK<arrow.core.Option<A>>
}

@JvmName("guard")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "guard(arg0)",
  "arrow.core.SequenceK.guard"
  ),
  DeprecationLevel.WARNING
)
fun guard(arg0: Boolean): SequenceK<Unit> = arrow.core.SequenceK
   .alternative()
   .guard(arg0) as arrow.core.SequenceK<kotlin.Unit>

@JvmName("lazyOrElse")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "lazyOrElse(arg1)",
  "arrow.core.lazyOrElse"
  ),
  DeprecationLevel.WARNING
)
fun <A> Kind<ForSequenceK, A>.lazyOrElse(arg1: Function0<Kind<ForSequenceK, A>>): SequenceK<A> =
    arrow.core.SequenceK.alternative().run {
  this@lazyOrElse.lazyOrElse<A>(arg1) as arrow.core.SequenceK<A>
}

@Suppress(
  "UNCHECKED_CAST",
  "NOTHING_TO_INLINE"
)
inline fun Companion.alternative(): SequenceKAlternative = alternative_singleton
