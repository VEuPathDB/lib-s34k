---
title: S3MutableTagMap
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.fields.tags](../index.html)/[S3MutableTagMap](index.html)



# S3MutableTagMap



[jvm]\
interface [S3MutableTagMap](index.html) : [S3TagMap](../-s3-tag-map/index.html)

Mutable map of [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html) instances.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Functions


| Name | Summary |
|---|---|
| [add](add.html) | [jvm]<br>abstract fun [add](add.html)(vararg tags: [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>abstract fun [add](add.html)(vararg tags: [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html))<br>abstract fun [add](add.html)(tags: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html)&gt;)<br>abstract fun [add](add.html)(tags: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>Adds the given tags to this map.<br>[jvm]<br>abstract fun [add](add.html)(tag: [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html))<br>Adds the single given tag to this map. |
| [forEach](../-s3-tag-map/index.html#1002228854%2FFunctions%2F863300109) | [jvm]<br>open fun [forEach](../-s3-tag-map/index.html#1002228854%2FFunctions%2F863300109)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html)&gt;) |
| [get](../-s3-tag-map/get.html) | [jvm]<br>abstract operator fun [get](../-s3-tag-map/get.html)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Gets the value for the tag with the given name ([key](../-s3-tag-map/get.html)). |
| [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-858216167%2FFunctions%2F863300109) | [jvm]<br>abstract operator fun [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-858216167%2FFunctions%2F863300109)(): [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html)&gt; |
| [plusAssign](plus-assign.html) | [jvm]<br>abstract operator fun [plusAssign](plus-assign.html)(tag: [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>abstract operator fun [plusAssign](plus-assign.html)(tag: [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html))<br>Appends the given value to this map.<br>[jvm]<br>abstract operator fun [plusAssign](plus-assign.html)(tags: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>Appends the given values to this map. |
| [set](set.html) | [jvm]<br>abstract operator fun [set](set.html)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Sets the given values as a tag in this map. |
| [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-1387152138%2FFunctions%2F863300109) | [jvm]<br>open fun [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-1387152138%2FFunctions%2F863300109)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html)&gt; |
| [stream](../-s3-tag-map/stream.html) | [jvm]<br>abstract fun [stream](../-s3-tag-map/stream.html)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html)&gt;<br>Returns a stream over the contents of this [S3TagMap](../-s3-tag-map/index.html). |
| [toList](../-s3-tag-map/to-list.html) | [jvm]<br>abstract fun [toList](../-s3-tag-map/to-list.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html)&gt;<br>Returns the contents of this [S3TagMap](../-s3-tag-map/index.html) as a list of [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html) instances. |
| [toMap](../-s3-tag-map/to-map.html) | [jvm]<br>abstract fun [toMap](../-s3-tag-map/to-map.html)(): [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Returns the contents of this [S3TagMap](../-s3-tag-map/index.html) as a map of string key to string value. |
| [toSet](../-s3-tag-map/to-set.html) | [jvm]<br>abstract fun [toSet](../-s3-tag-map/to-set.html)(): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html)&gt;<br>Returns the contents of this [S3TagMap](../-s3-tag-map/index.html) as a set of [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html) instances. |


## Properties


| Name | Summary |
|---|---|
| [isEmpty](../-s3-tag-map/is-empty.html) | [jvm]<br>abstract val [isEmpty](../-s3-tag-map/is-empty.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3MutableTagMap](index.html) is empty. |
| [isNotEmpty](../-s3-tag-map/is-not-empty.html) | [jvm]<br>abstract val [isNotEmpty](../-s3-tag-map/is-not-empty.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3MutableTagMap](index.html) is not empty. |
| [size](../-s3-tag-map/size.html) | [jvm]<br>abstract val [size](../-s3-tag-map/size.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Number of tag pairs currently in this [S3MutableTagMap](index.html) |

