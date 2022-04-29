---
title: S3MutableTagSet
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.fields.tags](../index.html)/[S3MutableTagSet](index.html)



# S3MutableTagSet



[jvm]\
interface [S3MutableTagSet](index.html) : [S3TagSet](../-s3-tag-set/index.html)

Mutable set of tag names.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Functions


| Name | Summary |
|---|---|
| [add](add.html) | [jvm]<br>abstract fun [add](add.html)(vararg tags: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Adds the given tags to this [S3MutableTagSet](index.html).<br>[jvm]<br>abstract fun [add](add.html)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Adds the given tag to this [S3MutableTagSet](index.html).<br>[jvm]<br>abstract fun [add](add.html)(tags: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>Adds the tags from the [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) value to this [S3MutableTagSet](index.html). |
| [contains](../-s3-tag-set/contains.html) | [jvm]<br>abstract operator fun [contains](../-s3-tag-set/contains.html)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [forEach](../-s3-tag-set/index.html#1332756827%2FFunctions%2F863300109) | [jvm]<br>open fun [forEach](../-s3-tag-set/index.html#1332756827%2FFunctions%2F863300109)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) |
| [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-858216167%2FFunctions%2F863300109) | [jvm]<br>abstract operator fun [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-858216167%2FFunctions%2F863300109)(): [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [plusAssign](plus-assign.html) | [jvm]<br>abstract operator fun [plusAssign](plus-assign.html)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Adds the given tag to this [S3MutableTagSet](index.html). |
| [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-1387152138%2FFunctions%2F863300109) | [jvm]<br>open fun [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-1387152138%2FFunctions%2F863300109)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [toList](../-s3-tag-set/to-list.html) | [jvm]<br>abstract fun [toList](../-s3-tag-set/to-list.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Returns a read only list containing the tag names in this [S3TagSet](../-s3-tag-set/index.html). |
| [toSet](../-s3-tag-set/to-set.html) | [jvm]<br>abstract fun [toSet](../-s3-tag-set/to-set.html)(): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Returns a read only set containing the tag names in this [S3TagSet](../-s3-tag-set/index.html). |


## Properties


| Name | Summary |
|---|---|
| [isEmpty](../-s3-tag-set/is-empty.html) | [jvm]<br>abstract val [isEmpty](../-s3-tag-set/is-empty.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3TagSet](../-s3-tag-set/index.html) is empty. |
| [isNotEmpty](../-s3-tag-set/is-not-empty.html) | [jvm]<br>abstract val [isNotEmpty](../-s3-tag-set/is-not-empty.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3TagSet](../-s3-tag-set/index.html) is not empty. |
| [size](../-s3-tag-set/size.html) | [jvm]<br>abstract val [size](../-s3-tag-set/size.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Number of tags currently in this [S3TagSet](../-s3-tag-set/index.html) |

