---
title: S3TagMap
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.fields.tags](../index.html)/[S3TagMap](index.html)



# S3TagMap



[jvm]\
interface [S3TagMap](index.html) : [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html)&gt; 

Immutable map of [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html) instances.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Functions


| Name | Summary |
|---|---|
| [forEach](index.html#1002228854%2FFunctions%2F863300109) | [jvm]<br>open fun [forEach](index.html#1002228854%2FFunctions%2F863300109)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html)&gt;) |
| [get](get.html) | [jvm]<br>abstract operator fun [get](get.html)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Gets the value for the tag with the given name ([key](get.html)). |
| [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-858216167%2FFunctions%2F863300109) | [jvm]<br>abstract operator fun [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-858216167%2FFunctions%2F863300109)(): [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html)&gt; |
| [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-1387152138%2FFunctions%2F863300109) | [jvm]<br>open fun [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-1387152138%2FFunctions%2F863300109)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html)&gt; |
| [stream](stream.html) | [jvm]<br>abstract fun [stream](stream.html)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html)&gt;<br>Returns a stream over the contents of this [S3TagMap](index.html). |
| [toList](to-list.html) | [jvm]<br>abstract fun [toList](to-list.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html)&gt;<br>Returns the contents of this [S3TagMap](index.html) as a list of [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html) instances. |
| [toMap](to-map.html) | [jvm]<br>abstract fun [toMap](to-map.html)(): [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Returns the contents of this [S3TagMap](index.html) as a map of string key to string value. |
| [toSet](to-set.html) | [jvm]<br>abstract fun [toSet](to-set.html)(): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html)&gt;<br>Returns the contents of this [S3TagMap](index.html) as a set of [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html) instances. |


## Properties


| Name | Summary |
|---|---|
| [isEmpty](is-empty.html) | [jvm]<br>abstract val [isEmpty](is-empty.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3MutableTagMap](../-s3-mutable-tag-map/index.html) is empty. |
| [isNotEmpty](is-not-empty.html) | [jvm]<br>abstract val [isNotEmpty](is-not-empty.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3MutableTagMap](../-s3-mutable-tag-map/index.html) is not empty. |
| [size](size.html) | [jvm]<br>abstract val [size](size.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Number of tag pairs currently in this [S3MutableTagMap](../-s3-mutable-tag-map/index.html) |


## Inheritors


| Name |
|---|
| [S3MutableTagMap](../-s3-mutable-tag-map/index.html) |

