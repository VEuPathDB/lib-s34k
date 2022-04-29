//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.fields.query_params](../index.md)/[S3QueryParamsMutable](index.md)/[addQueryParams](add-query-params.md)

# addQueryParams

[jvm]\
abstract fun [addQueryParams](add-query-params.md)(params: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;)

Adds the query params in the given map to this query param map.

If there exists any key in the input [params](add-query-params.md) map that already exists in this query parameter map, the values in the supplied iterator will be appended to the param values already in this map.

## Parameters

jvm

| | |
|---|---|
| params | Map of query parameters to values that will be appended to this map. |

[jvm]\
abstract fun [addQueryParams](add-query-params.md)(vararg params: [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)

Adds the query params in the given set of pairs to this query param map.

If there exists any key in the input [params](add-query-params.md) pairs that already exists in this map, the value in the supplied pair will be appended to the values already in this map.

## Parameters

jvm

| | |
|---|---|
| params | Collection of pairs of query parameters to values that will be appended to this header map. |
