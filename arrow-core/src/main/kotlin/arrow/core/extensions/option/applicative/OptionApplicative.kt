package arrow.core.extensions.option.applicative

import arrow.Kind
import arrow.core.ForOption
import arrow.core.Option
import arrow.core.Option.Companion
import arrow.core.extensions.OptionApplicative
import arrow.typeclasses.Monoid
import kotlin.Deprecated
import kotlin.Function1
import kotlin.Int
import kotlin.PublishedApi
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * cached extension
 */
@PublishedApi()
internal val applicative_singleton: OptionApplicative = object :
    arrow.core.extensions.OptionApplicative {}

@JvmName("just1")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "just()",
  "arrow.core.just"
  ),
  DeprecationLevel.WARNING
)
fun <A> A.just(): Option<A> = arrow.core.Option.applicative().run {
  this@just.just<A>() as arrow.core.Option<A>
}

@JvmName("unit")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "unit()",
  "arrow.core.Option.unit"
  ),
  DeprecationLevel.WARNING
)
fun unit(): Option<Unit> = arrow.core.Option
   .applicative()
   .unit() as arrow.core.Option<kotlin.Unit>

@JvmName("map")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "map(arg1)",
  "arrow.core.map"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> Kind<ForOption, A>.map(arg1: Function1<A, B>): Option<B> =
    arrow.core.Option.applicative().run {
  this@map.map<A, B>(arg1) as arrow.core.Option<B>
}

@JvmName("replicate")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "replicate(arg1)",
  "arrow.core.replicate"
  ),
  DeprecationLevel.WARNING
)
fun <A> Kind<ForOption, A>.replicate(arg1: Int): Option<List<A>> =
    arrow.core.Option.applicative().run {
  this@replicate.replicate<A>(arg1) as arrow.core.Option<kotlin.collections.List<A>>
}

@JvmName("replicate")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "replicate(arg1, arg2)",
  "arrow.core.replicate"
  ),
  DeprecationLevel.WARNING
)
fun <A> Kind<ForOption, A>.replicate(arg1: Int, arg2: Monoid<A>): Option<A> =
    arrow.core.Option.applicative().run {
  this@replicate.replicate<A>(arg1, arg2) as arrow.core.Option<A>
}

@Suppress(
  "UNCHECKED_CAST",
  "NOTHING_TO_INLINE"
)
inline fun Companion.applicative(): OptionApplicative = applicative_singleton
