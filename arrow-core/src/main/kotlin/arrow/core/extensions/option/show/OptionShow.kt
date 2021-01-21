package arrow.core.extensions.option.show

import arrow.core.Option.Companion
import arrow.core.extensions.OptionShow
import arrow.typeclasses.Show

@Suppress(
  "UNCHECKED_CAST",
  "NOTHING_TO_INLINE"
)
@Deprecated(
  "@extension projected functions are deprecated",
  ReplaceWith(
    "Show.option(SA)",
    "arrow.core.option", "arrow.core.Show"
  ),
  DeprecationLevel.WARNING
)
inline fun <A> Companion.show(SA: Show<A>): OptionShow<A> = object :
    arrow.core.extensions.OptionShow<A> { override fun SA(): arrow.typeclasses.Show<A> = SA }