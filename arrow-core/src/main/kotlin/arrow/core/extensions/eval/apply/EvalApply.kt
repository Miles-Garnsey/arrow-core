package arrow.core.extensions.eval.apply

import arrow.Kind
import arrow.core.Eval
import arrow.core.Eval.Companion
import arrow.core.ForEval
import arrow.core.Tuple10
import arrow.core.Tuple2
import arrow.core.Tuple3
import arrow.core.Tuple4
import arrow.core.Tuple5
import arrow.core.Tuple6
import arrow.core.Tuple7
import arrow.core.Tuple8
import arrow.core.Tuple9
import arrow.core.extensions.EvalApply
import kotlin.Deprecated
import kotlin.Function1
import kotlin.PublishedApi
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * cached extension
 */
@PublishedApi()
internal val apply_singleton: EvalApply = object : arrow.core.extensions.EvalApply {}

@JvmName("ap")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "ap(arg1)",
  "arrow.core.ap"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> Kind<ForEval, A>.ap(arg1: Kind<ForEval, Function1<A, B>>): Eval<B> =
    arrow.core.Eval.apply().run {
  this@ap.ap<A, B>(arg1) as arrow.core.Eval<B>
}

@JvmName("apEval")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "apEval(arg1)",
  "arrow.core.apEval"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> Kind<ForEval, A>.apEval(arg1: Eval<Kind<ForEval, Function1<A, B>>>): Eval<Kind<ForEval,
    B>> = arrow.core.Eval.apply().run {
  this@apEval.apEval<A, B>(arg1) as arrow.core.Eval<arrow.Kind<arrow.core.ForEval, B>>
}

@JvmName("map2Eval")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "map2Eval(arg1, arg2)",
  "arrow.core.map2Eval"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, Z> Kind<ForEval, A>.map2Eval(
  arg1: Eval<Kind<ForEval, B>>,
  arg2: Function1<Tuple2<A, B>, Z>
): Eval<Kind<ForEval, Z>> = arrow.core.Eval.apply().run {
  this@map2Eval.map2Eval<A, B, Z>(arg1, arg2) as arrow.core.Eval<arrow.Kind<arrow.core.ForEval, Z>>
}

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
  "map(arg0, arg1, arg2)",
  "arrow.core.Eval.map"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, Z> map(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Function1<Tuple2<A, B>, Z>
): Eval<Z> = arrow.core.Eval
   .apply()
   .map<A, B, Z>(arg0, arg1, arg2) as arrow.core.Eval<Z>

@JvmName("mapN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "mapN(arg0, arg1, arg2)",
  "arrow.core.Eval.mapN"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, Z> mapN(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Function1<Tuple2<A, B>, Z>
): Eval<Z> = arrow.core.Eval
   .apply()
   .mapN<A, B, Z>(arg0, arg1, arg2) as arrow.core.Eval<Z>

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
  "map(arg0, arg1, arg2, arg3)",
  "arrow.core.Eval.map"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, Z> map(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Function1<Tuple3<A, B, C>, Z>
): Eval<Z> = arrow.core.Eval
   .apply()
   .map<A, B, C, Z>(arg0, arg1, arg2, arg3) as arrow.core.Eval<Z>

@JvmName("mapN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "mapN(arg0, arg1, arg2, arg3)",
  "arrow.core.Eval.mapN"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, Z> mapN(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Function1<Tuple3<A, B, C>, Z>
): Eval<Z> = arrow.core.Eval
   .apply()
   .mapN<A, B, C, Z>(arg0, arg1, arg2, arg3) as arrow.core.Eval<Z>

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
  "map(arg0, arg1, arg2, arg3, arg4)",
  "arrow.core.Eval.map"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, Z> map(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Function1<Tuple4<A, B, C, D>, Z>
): Eval<Z> = arrow.core.Eval
   .apply()
   .map<A, B, C, D, Z>(arg0, arg1, arg2, arg3, arg4) as arrow.core.Eval<Z>

@JvmName("mapN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "mapN(arg0, arg1, arg2, arg3, arg4)",
  "arrow.core.Eval.mapN"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, Z> mapN(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Function1<Tuple4<A, B, C, D>, Z>
): Eval<Z> = arrow.core.Eval
   .apply()
   .mapN<A, B, C, D, Z>(arg0, arg1, arg2, arg3, arg4) as arrow.core.Eval<Z>

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
  "map(arg0, arg1, arg2, arg3, arg4, arg5)",
  "arrow.core.Eval.map"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, Z> map(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Function1<Tuple5<A, B, C, D, E>, Z>
): Eval<Z> = arrow.core.Eval
   .apply()
   .map<A, B, C, D, E, Z>(arg0, arg1, arg2, arg3, arg4, arg5) as arrow.core.Eval<Z>

@JvmName("mapN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "mapN(arg0, arg1, arg2, arg3, arg4, arg5)",
  "arrow.core.Eval.mapN"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, Z> mapN(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Function1<Tuple5<A, B, C, D, E>, Z>
): Eval<Z> = arrow.core.Eval
   .apply()
   .mapN<A, B, C, D, E, Z>(arg0, arg1, arg2, arg3, arg4, arg5) as arrow.core.Eval<Z>

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
  "map(arg0, arg1, arg2, arg3, arg4, arg5, arg6)",
  "arrow.core.Eval.map"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, Z> map(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Kind<ForEval, FF>,
  arg6: Function1<Tuple6<A, B, C, D, E, FF>, Z>
): Eval<Z> = arrow.core.Eval
   .apply()
   .map<A, B, C, D, E, FF, Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as arrow.core.Eval<Z>

@JvmName("mapN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "mapN(arg0, arg1, arg2, arg3, arg4, arg5, arg6)",
  "arrow.core.Eval.mapN"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, Z> mapN(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Kind<ForEval, FF>,
  arg6: Function1<Tuple6<A, B, C, D, E, FF>, Z>
): Eval<Z> = arrow.core.Eval
   .apply()
   .mapN<A, B, C, D, E, FF, Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as arrow.core.Eval<Z>

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
  "map(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)",
  "arrow.core.Eval.map"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, Z> map(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Kind<ForEval, FF>,
  arg6: Kind<ForEval, G>,
  arg7: Function1<Tuple7<A, B, C, D, E, FF, G>, Z>
): Eval<Z> = arrow.core.Eval
   .apply()
   .map<A, B, C, D, E, FF, G, Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as
    arrow.core.Eval<Z>

@JvmName("mapN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "mapN(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)",
  "arrow.core.Eval.mapN"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, Z> mapN(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Kind<ForEval, FF>,
  arg6: Kind<ForEval, G>,
  arg7: Function1<Tuple7<A, B, C, D, E, FF, G>, Z>
): Eval<Z> = arrow.core.Eval
   .apply()
   .mapN<A, B, C, D, E, FF, G, Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as
    arrow.core.Eval<Z>

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
  "map(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)",
  "arrow.core.Eval.map"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, Z> map(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Kind<ForEval, FF>,
  arg6: Kind<ForEval, G>,
  arg7: Kind<ForEval, H>,
  arg8: Function1<Tuple8<A, B, C, D, E, FF, G, H>, Z>
): Eval<Z> = arrow.core.Eval
   .apply()
   .map<A, B, C, D, E, FF, G, H, Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) as
    arrow.core.Eval<Z>

@JvmName("mapN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "mapN(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)",
  "arrow.core.Eval.mapN"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, Z> mapN(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Kind<ForEval, FF>,
  arg6: Kind<ForEval, G>,
  arg7: Kind<ForEval, H>,
  arg8: Function1<Tuple8<A, B, C, D, E, FF, G, H>, Z>
): Eval<Z> = arrow.core.Eval
   .apply()
   .mapN<A, B, C, D, E, FF, G, H, Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) as
    arrow.core.Eval<Z>

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
  "map(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)",
  "arrow.core.Eval.map"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, I, Z> map(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Kind<ForEval, FF>,
  arg6: Kind<ForEval, G>,
  arg7: Kind<ForEval, H>,
  arg8: Kind<ForEval, I>,
  arg9: Function1<Tuple9<A, B, C, D, E, FF, G, H, I>, Z>
): Eval<Z> = arrow.core.Eval
   .apply()
   .map<A, B, C, D, E, FF, G, H, I, Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
    as arrow.core.Eval<Z>

@JvmName("mapN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "mapN(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)",
  "arrow.core.Eval.mapN"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, I, Z> mapN(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Kind<ForEval, FF>,
  arg6: Kind<ForEval, G>,
  arg7: Kind<ForEval, H>,
  arg8: Kind<ForEval, I>,
  arg9: Function1<Tuple9<A, B, C, D, E, FF, G, H, I>, Z>
): Eval<Z> = arrow.core.Eval
   .apply()
   .mapN<A, B, C, D, E, FF, G, H, I, Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
    as arrow.core.Eval<Z>

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
  "map(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10)",
  "arrow.core.Eval.map"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, I, J, Z> map(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Kind<ForEval, FF>,
  arg6: Kind<ForEval, G>,
  arg7: Kind<ForEval, H>,
  arg8: Kind<ForEval, I>,
  arg9: Kind<ForEval, J>,
  arg10: Function1<Tuple10<A, B, C, D, E, FF, G, H, I, J>, Z>
): Eval<Z> = arrow.core.Eval
   .apply()
   .map<A, B, C, D, E, FF, G, H, I, J,
    Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10) as arrow.core.Eval<Z>

@JvmName("mapN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "mapN(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10)",
  "arrow.core.Eval.mapN"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, I, J, Z> mapN(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Kind<ForEval, FF>,
  arg6: Kind<ForEval, G>,
  arg7: Kind<ForEval, H>,
  arg8: Kind<ForEval, I>,
  arg9: Kind<ForEval, J>,
  arg10: Function1<Tuple10<A, B, C, D, E, FF, G, H, I, J>, Z>
): Eval<Z> = arrow.core.Eval
   .apply()
   .mapN<A, B, C, D, E, FF, G, H, I, J,
    Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10) as arrow.core.Eval<Z>

@JvmName("map2")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "map2(arg1, arg2)",
  "arrow.core.map2"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, Z> Kind<ForEval, A>.map2(arg1: Kind<ForEval, B>, arg2: Function1<Tuple2<A, B>, Z>):
    Eval<Z> = arrow.core.Eval.apply().run {
  this@map2.map2<A, B, Z>(arg1, arg2) as arrow.core.Eval<Z>
}

@JvmName("product")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "product(arg1)",
  "arrow.core.product"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> Kind<ForEval, A>.product(arg1: Kind<ForEval, B>): Eval<Tuple2<A, B>> =
    arrow.core.Eval.apply().run {
  this@product.product<A, B>(arg1) as arrow.core.Eval<arrow.core.Tuple2<A, B>>
}

@JvmName("product1")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "product(arg1)",
  "arrow.core.product"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, Z> Kind<ForEval, Tuple2<A, B>>.product(arg1: Kind<ForEval, Z>): Eval<Tuple3<A, B, Z>> =
    arrow.core.Eval.apply().run {
  this@product.product<A, B, Z>(arg1) as arrow.core.Eval<arrow.core.Tuple3<A, B, Z>>
}

@JvmName("product2")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "product(arg1)",
  "arrow.core.product"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, Z> Kind<ForEval, Tuple3<A, B, C>>.product(arg1: Kind<ForEval, Z>): Eval<Tuple4<A, B,
    C, Z>> = arrow.core.Eval.apply().run {
  this@product.product<A, B, C, Z>(arg1) as arrow.core.Eval<arrow.core.Tuple4<A, B, C, Z>>
}

@JvmName("product3")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "product(arg1)",
  "arrow.core.product"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, Z> Kind<ForEval, Tuple4<A, B, C, D>>.product(arg1: Kind<ForEval, Z>):
    Eval<Tuple5<A, B, C, D, Z>> = arrow.core.Eval.apply().run {
  this@product.product<A, B, C, D, Z>(arg1) as arrow.core.Eval<arrow.core.Tuple5<A, B, C, D, Z>>
}

@JvmName("product4")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "product(arg1)",
  "arrow.core.product"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, Z> Kind<ForEval, Tuple5<A, B, C, D, E>>.product(arg1: Kind<ForEval, Z>):
    Eval<Tuple6<A, B, C, D, E, Z>> = arrow.core.Eval.apply().run {
  this@product.product<A, B, C, D, E, Z>(arg1) as arrow.core.Eval<arrow.core.Tuple6<A, B, C, D, E,
    Z>>
}

@JvmName("product5")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "product(arg1)",
  "arrow.core.product"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, Z> Kind<ForEval, Tuple6<A, B, C, D, E, FF>>.product(arg1: Kind<ForEval, Z>):
    Eval<Tuple7<A, B, C, D, E, FF, Z>> = arrow.core.Eval.apply().run {
  this@product.product<A, B, C, D, E, FF, Z>(arg1) as arrow.core.Eval<arrow.core.Tuple7<A, B, C, D,
    E, FF, Z>>
}

@JvmName("product6")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "product(arg1)",
  "arrow.core.product"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, Z> Kind<ForEval, Tuple7<A, B, C, D, E, FF,
    G>>.product(arg1: Kind<ForEval, Z>): Eval<Tuple8<A, B, C, D, E, FF, G, Z>> =
    arrow.core.Eval.apply().run {
  this@product.product<A, B, C, D, E, FF, G, Z>(arg1) as arrow.core.Eval<arrow.core.Tuple8<A, B, C,
    D, E, FF, G, Z>>
}

@JvmName("product7")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "product(arg1)",
  "arrow.core.product"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, Z> Kind<ForEval, Tuple8<A, B, C, D, E, FF, G,
    H>>.product(arg1: Kind<ForEval, Z>): Eval<Tuple9<A, B, C, D, E, FF, G, H, Z>> =
    arrow.core.Eval.apply().run {
  this@product.product<A, B, C, D, E, FF, G, H, Z>(arg1) as arrow.core.Eval<arrow.core.Tuple9<A, B,
    C, D, E, FF, G, H, Z>>
}

@JvmName("product8")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "product(arg1)",
  "arrow.core.product"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, I, Z> Kind<ForEval, Tuple9<A, B, C, D, E, FF, G, H,
    I>>.product(arg1: Kind<ForEval, Z>): Eval<Tuple10<A, B, C, D, E, FF, G, H, I, Z>> =
    arrow.core.Eval.apply().run {
  this@product.product<A, B, C, D, E, FF, G, H, I, Z>(arg1) as arrow.core.Eval<arrow.core.Tuple10<A,
    B, C, D, E, FF, G, H, I, Z>>
}

@JvmName("tupled")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "tupled(arg0, arg1)",
  "arrow.core.Eval.tupled"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> tupled(arg0: Kind<ForEval, A>, arg1: Kind<ForEval, B>): Eval<Tuple2<A, B>> =
    arrow.core.Eval
   .apply()
   .tupled<A, B>(arg0, arg1) as arrow.core.Eval<arrow.core.Tuple2<A, B>>

@JvmName("tupledN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "tupledN(arg0, arg1)",
  "arrow.core.Eval.tupledN"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> tupledN(arg0: Kind<ForEval, A>, arg1: Kind<ForEval, B>): Eval<Tuple2<A, B>> =
    arrow.core.Eval
   .apply()
   .tupledN<A, B>(arg0, arg1) as arrow.core.Eval<arrow.core.Tuple2<A, B>>

@JvmName("tupled")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "tupled(arg0, arg1, arg2)",
  "arrow.core.Eval.tupled"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C> tupled(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>
): Eval<Tuple3<A, B, C>> = arrow.core.Eval
   .apply()
   .tupled<A, B, C>(arg0, arg1, arg2) as arrow.core.Eval<arrow.core.Tuple3<A, B, C>>

@JvmName("tupledN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "tupledN(arg0, arg1, arg2)",
  "arrow.core.Eval.tupledN"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C> tupledN(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>
): Eval<Tuple3<A, B, C>> = arrow.core.Eval
   .apply()
   .tupledN<A, B, C>(arg0, arg1, arg2) as arrow.core.Eval<arrow.core.Tuple3<A, B, C>>

@JvmName("tupled")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "tupled(arg0, arg1, arg2, arg3)",
  "arrow.core.Eval.tupled"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D> tupled(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>
): Eval<Tuple4<A, B, C, D>> = arrow.core.Eval
   .apply()
   .tupled<A, B, C, D>(arg0, arg1, arg2, arg3) as arrow.core.Eval<arrow.core.Tuple4<A, B, C, D>>

@JvmName("tupledN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "tupledN(arg0, arg1, arg2, arg3)",
  "arrow.core.Eval.tupledN"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D> tupledN(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>
): Eval<Tuple4<A, B, C, D>> = arrow.core.Eval
   .apply()
   .tupledN<A, B, C, D>(arg0, arg1, arg2, arg3) as arrow.core.Eval<arrow.core.Tuple4<A, B, C, D>>

@JvmName("tupled")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "tupled(arg0, arg1, arg2, arg3, arg4)",
  "arrow.core.Eval.tupled"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E> tupled(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>
): Eval<Tuple5<A, B, C, D, E>> = arrow.core.Eval
   .apply()
   .tupled<A, B, C, D, E>(arg0, arg1, arg2, arg3, arg4) as arrow.core.Eval<arrow.core.Tuple5<A, B,
    C, D, E>>

@JvmName("tupledN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "tupledN(arg0, arg1, arg2, arg3, arg4)",
  "arrow.core.Eval.tupledN"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E> tupledN(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>
): Eval<Tuple5<A, B, C, D, E>> = arrow.core.Eval
   .apply()
   .tupledN<A, B, C, D, E>(arg0, arg1, arg2, arg3, arg4) as arrow.core.Eval<arrow.core.Tuple5<A, B,
    C, D, E>>

@JvmName("tupled")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "tupled(arg0, arg1, arg2, arg3, arg4, arg5)",
  "arrow.core.Eval.tupled"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF> tupled(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Kind<ForEval, FF>
): Eval<Tuple6<A, B, C, D, E, FF>> = arrow.core.Eval
   .apply()
   .tupled<A, B, C, D, E, FF>(arg0, arg1, arg2, arg3, arg4, arg5) as
    arrow.core.Eval<arrow.core.Tuple6<A, B, C, D, E, FF>>

@JvmName("tupledN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "tupledN(arg0, arg1, arg2, arg3, arg4, arg5)",
  "arrow.core.Eval.tupledN"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF> tupledN(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Kind<ForEval, FF>
): Eval<Tuple6<A, B, C, D, E, FF>> = arrow.core.Eval
   .apply()
   .tupledN<A, B, C, D, E, FF>(arg0, arg1, arg2, arg3, arg4, arg5) as
    arrow.core.Eval<arrow.core.Tuple6<A, B, C, D, E, FF>>

@JvmName("tupled")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "tupled(arg0, arg1, arg2, arg3, arg4, arg5, arg6)",
  "arrow.core.Eval.tupled"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G> tupled(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Kind<ForEval, FF>,
  arg6: Kind<ForEval, G>
): Eval<Tuple7<A, B, C, D, E, FF, G>> = arrow.core.Eval
   .apply()
   .tupled<A, B, C, D, E, FF, G>(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as
    arrow.core.Eval<arrow.core.Tuple7<A, B, C, D, E, FF, G>>

@JvmName("tupledN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "tupledN(arg0, arg1, arg2, arg3, arg4, arg5, arg6)",
  "arrow.core.Eval.tupledN"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G> tupledN(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Kind<ForEval, FF>,
  arg6: Kind<ForEval, G>
): Eval<Tuple7<A, B, C, D, E, FF, G>> = arrow.core.Eval
   .apply()
   .tupledN<A, B, C, D, E, FF, G>(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as
    arrow.core.Eval<arrow.core.Tuple7<A, B, C, D, E, FF, G>>

@JvmName("tupled")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "tupled(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)",
  "arrow.core.Eval.tupled"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H> tupled(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Kind<ForEval, FF>,
  arg6: Kind<ForEval, G>,
  arg7: Kind<ForEval, H>
): Eval<Tuple8<A, B, C, D, E, FF, G, H>> = arrow.core.Eval
   .apply()
   .tupled<A, B, C, D, E, FF, G, H>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as
    arrow.core.Eval<arrow.core.Tuple8<A, B, C, D, E, FF, G, H>>

@JvmName("tupledN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "tupledN(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)",
  "arrow.core.Eval.tupledN"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H> tupledN(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Kind<ForEval, FF>,
  arg6: Kind<ForEval, G>,
  arg7: Kind<ForEval, H>
): Eval<Tuple8<A, B, C, D, E, FF, G, H>> = arrow.core.Eval
   .apply()
   .tupledN<A, B, C, D, E, FF, G, H>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as
    arrow.core.Eval<arrow.core.Tuple8<A, B, C, D, E, FF, G, H>>

@JvmName("tupled")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "tupled(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)",
  "arrow.core.Eval.tupled"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, I> tupled(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Kind<ForEval, FF>,
  arg6: Kind<ForEval, G>,
  arg7: Kind<ForEval, H>,
  arg8: Kind<ForEval, I>
): Eval<Tuple9<A, B, C, D, E, FF, G, H, I>> = arrow.core.Eval
   .apply()
   .tupled<A, B, C, D, E, FF, G, H, I>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) as
    arrow.core.Eval<arrow.core.Tuple9<A, B, C, D, E, FF, G, H, I>>

@JvmName("tupledN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "tupledN(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)",
  "arrow.core.Eval.tupledN"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, I> tupledN(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Kind<ForEval, FF>,
  arg6: Kind<ForEval, G>,
  arg7: Kind<ForEval, H>,
  arg8: Kind<ForEval, I>
): Eval<Tuple9<A, B, C, D, E, FF, G, H, I>> = arrow.core.Eval
   .apply()
   .tupledN<A, B, C, D, E, FF, G, H, I>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) as
    arrow.core.Eval<arrow.core.Tuple9<A, B, C, D, E, FF, G, H, I>>

@JvmName("tupled")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "tupled(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)",
  "arrow.core.Eval.tupled"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, I, J> tupled(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Kind<ForEval, FF>,
  arg6: Kind<ForEval, G>,
  arg7: Kind<ForEval, H>,
  arg8: Kind<ForEval, I>,
  arg9: Kind<ForEval, J>
): Eval<Tuple10<A, B, C, D, E, FF, G, H, I, J>> = arrow.core.Eval
   .apply()
   .tupled<A, B, C, D, E, FF, G, H, I,
    J>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9) as
    arrow.core.Eval<arrow.core.Tuple10<A, B, C, D, E, FF, G, H, I, J>>

@JvmName("tupledN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "tupledN(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)",
  "arrow.core.Eval.tupledN"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, I, J> tupledN(
  arg0: Kind<ForEval, A>,
  arg1: Kind<ForEval, B>,
  arg2: Kind<ForEval, C>,
  arg3: Kind<ForEval, D>,
  arg4: Kind<ForEval, E>,
  arg5: Kind<ForEval, FF>,
  arg6: Kind<ForEval, G>,
  arg7: Kind<ForEval, H>,
  arg8: Kind<ForEval, I>,
  arg9: Kind<ForEval, J>
): Eval<Tuple10<A, B, C, D, E, FF, G, H, I, J>> = arrow.core.Eval
   .apply()
   .tupledN<A, B, C, D, E, FF, G, H, I,
    J>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9) as
    arrow.core.Eval<arrow.core.Tuple10<A, B, C, D, E, FF, G, H, I, J>>

@JvmName("followedBy")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "followedBy(arg1)",
  "arrow.core.followedBy"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> Kind<ForEval, A>.followedBy(arg1: Kind<ForEval, B>): Eval<B> =
    arrow.core.Eval.apply().run {
  this@followedBy.followedBy<A, B>(arg1) as arrow.core.Eval<B>
}

@JvmName("apTap")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "apTap(arg1)",
  "arrow.core.apTap"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> Kind<ForEval, A>.apTap(arg1: Kind<ForEval, B>): Eval<A> = arrow.core.Eval.apply().run {
  this@apTap.apTap<A, B>(arg1) as arrow.core.Eval<A>
}

@Suppress(
  "UNCHECKED_CAST",
  "NOTHING_TO_INLINE"
)
inline fun Companion.apply(): EvalApply = apply_singleton
