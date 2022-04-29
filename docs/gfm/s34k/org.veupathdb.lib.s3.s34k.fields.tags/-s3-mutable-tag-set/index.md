//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.fields.tags](../index.md)/[S3MutableTagSet](index.md)

# S3MutableTagSet

[jvm]\
interface [S3MutableTagSet](index.md) : [S3TagSet](../-s3-tag-set/index.md)

Mutable set of tag names.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Functions

| Name | Summary |
|---|---|
| [add](add.md) | [jvm]<br>abstract fun [add](add.md)(vararg tags: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Adds the given tags to this [S3MutableTagSet](index.md).<br>[jvm]<br>abstract fun [add](add.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Adds the given tag to this [S3MutableTagSet](index.md).<br>[jvm]<br>abstract fun [add](add.md)(tags: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>Adds the tags from the [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) value to this [S3MutableTagSet](index.md). |
| [contains](../-s3-tag-set/contains.md) | [jvm]<br>abstract operator fun [contains](../-s3-tag-set/contains.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [forEach](../-s3-tag-set/index.md#1332756827%2FFunctions%2F-1216412040) | [jvm]<br>open fun [forEach](../-s3-tag-set/index.md#1332756827%2FFunctions%2F-1216412040)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) |
| [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-858216167%2FFunctions%2F-1216412040) | [jvm]<br>abstract operator fun [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-858216167%2FFunctions%2F-1216412040)(): [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [plusAssign](plus-assign.md) | [jvm]<br>abstract operator fun [plusAssign](plus-assign.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Adds the given tag to this [S3MutableTagSet](index.md). |
| [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-1387152138%2FFunctions%2F-1216412040) | [jvm]<br>open fun [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-1387152138%2FFunctions%2F-1216412040)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [toList](../-s3-tag-set/to-list.md) | [jvm]<br>abstract fun [toList](../-s3-tag-set/to-list.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Returns a read only list containing the tag names in this [S3TagSet](../-s3-tag-set/index.md). |
| [toSet](../-s3-tag-set/to-set.md) | [jvm]<br>abstract fun [toSet](../-s3-tag-set/to-set.md)(): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Returns a read only set containing the tag names in this [S3TagSet](../-s3-tag-set/index.md). |

## Properties

| Name | Summary |
|---|---|
| [isEmpty](../-s3-tag-set/is-empty.md) | [jvm]<br>abstract val [isEmpty](../-s3-tag-set/is-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3TagSet](../-s3-tag-set/index.md) is empty. |
| [isNotEmpty](../-s3-tag-set/is-not-empty.md) | [jvm]<br>abstract val [isNotEmpty](../-s3-tag-set/is-not-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3TagSet](../-s3-tag-set/index.md) is not empty. |
| [size](../-s3-tag-set/size.md) | [jvm]<br>abstract val [size](../-s3-tag-set/size.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Number of tags currently in this [S3TagSet](../-s3-tag-set/index.md) |
