//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.fields.tags](../index.md)/[S3TagSet](index.md)

# S3TagSet

[jvm]\
interface [S3TagSet](index.md) : [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; 

Set of tag names.

Generally used for tag delete requests, but may be used for other operations as well.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## See also

jvm

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.fields.tags.S3MutableTagSet](../-s3-mutable-tag-set/index.md) |  |

## Functions

| Name | Summary |
|---|---|
| [contains](contains.md) | [jvm]<br>abstract operator fun [contains](contains.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [forEach](index.md#1332756827%2FFunctions%2F-1216412040) | [jvm]<br>open fun [forEach](index.md#1332756827%2FFunctions%2F-1216412040)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) |
| [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-858216167%2FFunctions%2F-1216412040) | [jvm]<br>abstract operator fun [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-858216167%2FFunctions%2F-1216412040)(): [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-1387152138%2FFunctions%2F-1216412040) | [jvm]<br>open fun [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-1387152138%2FFunctions%2F-1216412040)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [toList](to-list.md) | [jvm]<br>abstract fun [toList](to-list.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Returns a read only list containing the tag names in this [S3TagSet](index.md). |
| [toSet](to-set.md) | [jvm]<br>abstract fun [toSet](to-set.md)(): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Returns a read only set containing the tag names in this [S3TagSet](index.md). |

## Properties

| Name | Summary |
|---|---|
| [isEmpty](is-empty.md) | [jvm]<br>abstract val [isEmpty](is-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3TagSet](index.md) is empty. |
| [isNotEmpty](is-not-empty.md) | [jvm]<br>abstract val [isNotEmpty](is-not-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3TagSet](index.md) is not empty. |
| [size](size.md) | [jvm]<br>abstract val [size](size.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Number of tags currently in this [S3TagSet](index.md) |

## Inheritors

| Name |
|---|
| [S3MutableTagSet](../-s3-mutable-tag-set/index.md) |
