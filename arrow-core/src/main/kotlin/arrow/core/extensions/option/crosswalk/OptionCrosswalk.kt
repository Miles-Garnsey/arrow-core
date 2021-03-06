package arrow.core.extensions.option.crosswalk

import arrow.Kind
import arrow.core.ForOption
import arrow.core.Option.Companion
import arrow.core.extensions.OptionCrosswalk
import arrow.typeclasses.Align
import kotlin.Deprecated
import kotlin.Function1
import kotlin.PublishedApi
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * cached extension
 */
@PublishedApi()
internal val crosswalk_singleton: OptionCrosswalk = object : arrow.core.extensions.OptionCrosswalk
    {}

@JvmName("crosswalk")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "crosswalk(arg0, arg1, arg2)",
  "arrow.core.Option.crosswalk"
  ),
  DeprecationLevel.WARNING
)
fun <F, A, B> crosswalk(
  arg0: Align<F>,
  arg1: Kind<ForOption, A>,
  arg2: Function1<A, Kind<F, B>>
): Kind<F, Kind<ForOption, B>> = arrow.core.Option
   .crosswalk()
   .crosswalk<F, A, B>(arg0, arg1, arg2) as arrow.Kind<F, arrow.Kind<arrow.core.ForOption, B>>

@JvmName("sequenceL")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "sequenceL(arg0, arg1)",
  "arrow.core.Option.sequenceL"
  ),
  DeprecationLevel.WARNING
)
fun <F, A> sequenceL(arg0: Align<F>, arg1: Kind<ForOption, Kind<F, A>>): Kind<F, Kind<ForOption, A>> =
  arrow.core.Option
    .crosswalk()
    .sequenceL<F, A>(arg0, arg1) as arrow.Kind<F, arrow.Kind<arrow.core.ForOption, A>>

@Suppress(
  "UNCHECKED_CAST",
  "NOTHING_TO_INLINE"
)
inline fun Companion.crosswalk(): OptionCrosswalk = crosswalk_singleton
