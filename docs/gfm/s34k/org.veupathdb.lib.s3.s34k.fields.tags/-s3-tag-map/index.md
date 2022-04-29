//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.fields.tags](../index.md)/[S3TagMap](index.md)

# S3TagMap

[jvm]\
interface [S3TagMap](index.md) : [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md)&gt; 

Immutable map of [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md) instances.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Functions

| Name | Summary |
|---|---|
| [forEach](index.md#1002228854%2FFunctions%2F-1216412040) | [jvm]<br>open fun [forEach](index.md#1002228854%2FFunctions%2F-1216412040)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md)&gt;) |
| [get](get.md) | [jvm]<br>abstract operator fun [get](get.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Gets the value for the tag with the given name ([key](get.md)). |
| [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-858216167%2FFunctions%2F-1216412040) | [jvm]<br>abstract operator fun [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-858216167%2FFunctions%2F-1216412040)(): [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md)&gt; |
| [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-1387152138%2FFunctions%2F-1216412040) | [jvm]<br>open fun [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-1387152138%2FFunctions%2F-1216412040)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md)&gt; |
| [stream](stream.md) | [jvm]<br>abstract fun [stream](stream.md)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md)&gt;<br>Returns a stream over the contents of this [S3TagMap](index.md). |
| [toList](to-list.md) | [jvm]<br>abstract fun [toList](to-list.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md)&gt;<br>Returns the contents of this [S3TagMap](index.md) as a list of [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md) instances. |
| [toMap](to-map.md) | [jvm]<br>abstract fun [toMap](to-map.md)(): [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Returns the contents of this [S3TagMap](index.md) as a map of string key to string value. |
| [toSet](to-set.md) | [jvm]<br>abstract fun [toSet](to-set.md)(): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md)&gt;<br>Returns the contents of this [S3TagMap](index.md) as a set of [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md) instances. |

## Properties

| Name | Summary |
|---|---|
| [isEmpty](is-empty.md) | [jvm]<br>abstract val [isEmpty](is-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3MutableTagMap](../-s3-mutable-tag-map/index.md) is empty. |
| [isNotEmpty](is-not-empty.md) | [jvm]<br>abstract val [isNotEmpty](is-not-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3MutableTagMap](../-s3-mutable-tag-map/index.md) is not empty. |
| [size](size.md) | [jvm]<br>abstract val [size](size.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Number of tag pairs currently in this [S3MutableTagMap](../-s3-mutable-tag-map/index.md) |

## Inheritors

| Name |
|---|
| [S3MutableTagMap](../-s3-mutable-tag-map/index.md) |
