//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.fields.tags](../index.md)/[S3MutableTagMap](index.md)

# S3MutableTagMap

[jvm]\
interface [S3MutableTagMap](index.md) : [S3TagMap](../-s3-tag-map/index.md)

Mutable map of [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md) instances.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Functions

| Name | Summary |
|---|---|
| [add](add.md) | [jvm]<br>abstract fun [add](add.md)(vararg tags: [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>abstract fun [add](add.md)(vararg tags: [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md))<br>abstract fun [add](add.md)(tags: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md)&gt;)<br>abstract fun [add](add.md)(tags: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>Adds the given tags to this map.<br>[jvm]<br>abstract fun [add](add.md)(tag: [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md))<br>Adds the single given tag to this map. |
| [forEach](../-s3-tag-map/index.md#1002228854%2FFunctions%2F-1216412040) | [jvm]<br>open fun [forEach](../-s3-tag-map/index.md#1002228854%2FFunctions%2F-1216412040)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md)&gt;) |
| [get](../-s3-tag-map/get.md) | [jvm]<br>abstract operator fun [get](../-s3-tag-map/get.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Gets the value for the tag with the given name ([key](../-s3-tag-map/get.md)). |
| [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-858216167%2FFunctions%2F-1216412040) | [jvm]<br>abstract operator fun [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-858216167%2FFunctions%2F-1216412040)(): [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md)&gt; |
| [plusAssign](plus-assign.md) | [jvm]<br>abstract operator fun [plusAssign](plus-assign.md)(tag: [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>abstract operator fun [plusAssign](plus-assign.md)(tag: [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md))<br>Appends the given value to this map.<br>[jvm]<br>abstract operator fun [plusAssign](plus-assign.md)(tags: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>Appends the given values to this map. |
| [set](set.md) | [jvm]<br>abstract operator fun [set](set.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Sets the given values as a tag in this map. |
| [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-1387152138%2FFunctions%2F-1216412040) | [jvm]<br>open fun [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-1387152138%2FFunctions%2F-1216412040)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md)&gt; |
| [stream](../-s3-tag-map/stream.md) | [jvm]<br>abstract fun [stream](../-s3-tag-map/stream.md)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md)&gt;<br>Returns a stream over the contents of this [S3TagMap](../-s3-tag-map/index.md). |
| [toList](../-s3-tag-map/to-list.md) | [jvm]<br>abstract fun [toList](../-s3-tag-map/to-list.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md)&gt;<br>Returns the contents of this [S3TagMap](../-s3-tag-map/index.md) as a list of [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md) instances. |
| [toMap](../-s3-tag-map/to-map.md) | [jvm]<br>abstract fun [toMap](../-s3-tag-map/to-map.md)(): [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Returns the contents of this [S3TagMap](../-s3-tag-map/index.md) as a map of string key to string value. |
| [toSet](../-s3-tag-map/to-set.md) | [jvm]<br>abstract fun [toSet](../-s3-tag-map/to-set.md)(): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md)&gt;<br>Returns the contents of this [S3TagMap](../-s3-tag-map/index.md) as a set of [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md) instances. |

## Properties

| Name | Summary |
|---|---|
| [isEmpty](../-s3-tag-map/is-empty.md) | [jvm]<br>abstract val [isEmpty](../-s3-tag-map/is-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3MutableTagMap](index.md) is empty. |
| [isNotEmpty](../-s3-tag-map/is-not-empty.md) | [jvm]<br>abstract val [isNotEmpty](../-s3-tag-map/is-not-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3MutableTagMap](index.md) is not empty. |
| [size](../-s3-tag-map/size.md) | [jvm]<br>abstract val [size](../-s3-tag-map/size.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Number of tag pairs currently in this [S3MutableTagMap](index.md) |
