//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.fields.headers](../index.md)/[S3HeadersMutable](index.md)

# S3HeadersMutable

[jvm]\
interface [S3HeadersMutable](index.md) : [S3Headers](../-s3-headers/index.md)

Mutable map of headers being sent as part of an S3 operation request.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Functions

| Name | Summary |
|---|---|
| [addHeader](add-header.md) | [jvm]<br>abstract fun [addHeader](add-header.md)(header: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), vararg values: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>abstract fun [addHeader](add-header.md)(header: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), values: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>Adds the given header and values to this header map. |
| [addHeaders](add-headers.md) | [jvm]<br>abstract fun [addHeaders](add-headers.md)(vararg headers: [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>Adds the headers in the given set of pairs to this header map.<br>[jvm]<br>abstract fun [addHeaders](add-headers.md)(headers: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;)<br>Adds the headers in the given map to this header map. |
| [forEach](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md#1230498850%2FFunctions%2F-1216412040) | [jvm]<br>open fun [forEach](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md#1230498850%2FFunctions%2F-1216412040)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;&gt;) |
| [get](../-s3-headers/get.md) | [jvm]<br>abstract operator fun [get](../-s3-headers/get.md)(header: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;?<br>Returns a list of header values stored under the given header key. |
| [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-858216167%2FFunctions%2F-1216412040) | [jvm]<br>abstract operator fun [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-858216167%2FFunctions%2F-1216412040)(): [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)&lt;[Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;&gt; |
| [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-1387152138%2FFunctions%2F-1216412040) | [jvm]<br>open fun [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-1387152138%2FFunctions%2F-1216412040)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;&gt; |
| [stream](../-s3-headers/stream.md) | [jvm]<br>abstract fun [stream](../-s3-headers/stream.md)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)&lt;[Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;&gt;<br>Returns a stream over the contents of this [S3Headers](../-s3-headers/index.md) map. |
| [toMap](../-s3-headers/to-map.md) | [jvm]<br>abstract fun [toMap](../-s3-headers/to-map.md)(): [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;<br>Converts this [S3Headers](../-s3-headers/index.md) instance into a standard map of headers to value lists. |

## Properties

| Name | Summary |
|---|---|
| [isEmpty](../-s3-headers/is-empty.md) | [jvm]<br>abstract val [isEmpty](../-s3-headers/is-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this header map is empty. |
| [isNotEmpty](../-s3-headers/is-not-empty.md) | [jvm]<br>abstract val [isNotEmpty](../-s3-headers/is-not-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this header map is not empty. |
| [size](../-s3-headers/size.md) | [jvm]<br>abstract val [size](../-s3-headers/size.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Number of header entries in this [S3Headers](../-s3-headers/index.md) map. |
