//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.response.object](../index.md)/[S3ObjectList](index.md)

# S3ObjectList

[jvm]\
interface [S3ObjectList](index.md) : [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[S3Object](../-s3-object/index.md)&gt;

## Functions

| Name | Summary |
|---|---|
| [forEach](index.md#1358496941%2FFunctions%2F-1216412040) | [jvm]<br>open fun [forEach](index.md#1358496941%2FFunctions%2F-1216412040)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [S3Object](../-s3-object/index.md)&gt;) |
| [get](get.md) | [jvm]<br>abstract operator fun [get](get.md)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [S3Object](../-s3-object/index.md)<br>abstract operator fun [get](get.md)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3Object](../-s3-object/index.md)? |
| [iterator](index.md#-858216167%2FFunctions%2F-1216412040) | [jvm]<br>abstract operator fun [iterator](index.md#-858216167%2FFunctions%2F-1216412040)(): [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)&lt;[S3Object](../-s3-object/index.md)&gt; |
| [spliterator](index.md#-1387152138%2FFunctions%2F-1216412040) | [jvm]<br>open fun [spliterator](index.md#-1387152138%2FFunctions%2F-1216412040)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[S3Object](../-s3-object/index.md)&gt; |
| [stream](stream.md) | [jvm]<br>abstract fun [stream](stream.md)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)&lt;[S3Object](../-s3-object/index.md)&gt; |
| [toList](to-list.md) | [jvm]<br>abstract fun [toList](to-list.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[S3Object](../-s3-object/index.md)&gt; |
| [toMap](to-map.md) | [jvm]<br>abstract fun [toMap](to-map.md)(): [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [S3Object](../-s3-object/index.md)&gt; |

## Properties

| Name | Summary |
|---|---|
| [isEmpty](is-empty.md) | [jvm]<br>abstract val [isEmpty](is-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isNotEmpty](is-not-empty.md) | [jvm]<br>abstract val [isNotEmpty](is-not-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [size](size.md) | [jvm]<br>abstract val [size](size.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
