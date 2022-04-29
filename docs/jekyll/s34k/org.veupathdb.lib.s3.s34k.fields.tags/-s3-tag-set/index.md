---
title: S3TagSet
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.fields.tags](../index.html)/[S3TagSet](index.html)



# S3TagSet



[jvm]\
interface [S3TagSet](index.html) : [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; 

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
| [org.veupathdb.lib.s3.s34k.fields.tags.S3MutableTagSet](../-s3-mutable-tag-set/index.html) |  |



## Functions


| Name | Summary |
|---|---|
| [contains](contains.html) | [jvm]<br>abstract operator fun [contains](contains.html)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [forEach](index.html#1332756827%2FFunctions%2F863300109) | [jvm]<br>open fun [forEach](index.html#1332756827%2FFunctions%2F863300109)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) |
| [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-858216167%2FFunctions%2F863300109) | [jvm]<br>abstract operator fun [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-858216167%2FFunctions%2F863300109)(): [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-1387152138%2FFunctions%2F863300109) | [jvm]<br>open fun [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-1387152138%2FFunctions%2F863300109)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [toList](to-list.html) | [jvm]<br>abstract fun [toList](to-list.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Returns a read only list containing the tag names in this [S3TagSet](index.html). |
| [toSet](to-set.html) | [jvm]<br>abstract fun [toSet](to-set.html)(): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Returns a read only set containing the tag names in this [S3TagSet](index.html). |


## Properties


| Name | Summary |
|---|---|
| [isEmpty](is-empty.html) | [jvm]<br>abstract val [isEmpty](is-empty.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3TagSet](index.html) is empty. |
| [isNotEmpty](is-not-empty.html) | [jvm]<br>abstract val [isNotEmpty](is-not-empty.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3TagSet](index.html) is not empty. |
| [size](size.html) | [jvm]<br>abstract val [size](size.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Number of tags currently in this [S3TagSet](index.html) |


## Inheritors


| Name |
|---|
| [S3MutableTagSet](../-s3-mutable-tag-set/index.html) |

