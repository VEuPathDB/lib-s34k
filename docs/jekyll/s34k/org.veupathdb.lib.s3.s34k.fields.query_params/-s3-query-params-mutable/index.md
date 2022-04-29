---
title: S3QueryParamsMutable
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.fields.query_params](../index.html)/[S3QueryParamsMutable](index.html)



# S3QueryParamsMutable



[jvm]\
interface [S3QueryParamsMutable](index.html) : [S3QueryParams](../-s3-query-params/index.html)

Mutable map of query params being sent as part of an S3 operation request.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Functions


| Name | Summary |
|---|---|
| [addQueryParam](add-query-param.html) | [jvm]<br>abstract fun [addQueryParam](add-query-param.html)(param: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), vararg values: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>abstract fun [addQueryParam](add-query-param.html)(param: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), values: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>Adds the given header and values to this query param map. |
| [addQueryParams](add-query-params.html) | [jvm]<br>abstract fun [addQueryParams](add-query-params.html)(vararg params: [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>Adds the query params in the given set of pairs to this query param map.<br>[jvm]<br>abstract fun [addQueryParams](add-query-params.html)(params: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;)<br>Adds the query params in the given map to this query param map. |
| [forEach](index.html#1230498850%2FFunctions%2F863300109) | [jvm]<br>open fun [forEach](index.html#1230498850%2FFunctions%2F863300109)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;&gt;) |
| [get](../-s3-query-params/get.html) | [jvm]<br>abstract operator fun [get](../-s3-query-params/get.html)(queryParam: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;?<br>Returns a list of header values stored under the given header key. |
| [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-858216167%2FFunctions%2F863300109) | [jvm]<br>abstract operator fun [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-858216167%2FFunctions%2F863300109)(): [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)&lt;[Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;&gt; |
| [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-1387152138%2FFunctions%2F863300109) | [jvm]<br>open fun [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-1387152138%2FFunctions%2F863300109)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;&gt; |
| [stream](../-s3-query-params/stream.html) | [jvm]<br>abstract fun [stream](../-s3-query-params/stream.html)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)&lt;[Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;&gt;<br>Returns a stream over the contents of this [S3QueryParams](../-s3-query-params/index.html) map. |
| [toMap](../-s3-query-params/to-map.html) | [jvm]<br>abstract fun [toMap](../-s3-query-params/to-map.html)(): [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt; |


## Properties


| Name | Summary |
|---|---|
| [isEmpty](../-s3-query-params/is-empty.html) | [jvm]<br>abstract val [isEmpty](../-s3-query-params/is-empty.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this query param map is empty. |
| [isNotEmpty](../-s3-query-params/is-not-empty.html) | [jvm]<br>abstract val [isNotEmpty](../-s3-query-params/is-not-empty.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Converts this [S3QueryParams](../-s3-query-params/index.html) instance into a standard map of headers to value lists. |
| [size](../-s3-query-params/size.html) | [jvm]<br>abstract val [size](../-s3-query-params/size.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Number of header entries in this [S3QueryParams](../-s3-query-params/index.html) map. |

