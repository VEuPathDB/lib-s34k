---
title: S3MutablePathSet
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.fields](../index.html)/[S3MutablePathSet](index.html)



# S3MutablePathSet



[jvm]\
interface [S3MutablePathSet](index.html) : [S3PathSet](../-s3-path-set/index.html)



## Functions


| Name | Summary |
|---|---|
| [add](add.html) | [jvm]<br>abstract fun [add](add.html)(vararg paths: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Adds the given tags to this [S3PathSet](../-s3-path-set/index.html).<br>[jvm]<br>abstract fun [add](add.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>[jvm]<br>abstract fun [add](add.html)(paths: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>Adds the tags from the [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) value to this [S3PathSet](../-s3-path-set/index.html). |
| [contains](../-s3-path-set/contains.html) | [jvm]<br>abstract operator fun [contains](../-s3-path-set/contains.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [forEach](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-set/index.html#1332756827%2FFunctions%2F863300109) | [jvm]<br>open fun [forEach](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-set/index.html#1332756827%2FFunctions%2F863300109)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) |
| [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-858216167%2FFunctions%2F863300109) | [jvm]<br>abstract operator fun [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-858216167%2FFunctions%2F863300109)(): [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [plusAssign](plus-assign.html) | [jvm]<br>abstract operator fun [plusAssign](plus-assign.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-1387152138%2FFunctions%2F863300109) | [jvm]<br>open fun [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-1387152138%2FFunctions%2F863300109)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [toList](../-s3-path-set/to-list.html) | [jvm]<br>abstract fun [toList](../-s3-path-set/to-list.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [toSet](../-s3-path-set/to-set.html) | [jvm]<br>abstract fun [toSet](../-s3-path-set/to-set.html)(): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Returns a read only set containing the paths in this [S3PathSet](../-s3-path-set/index.html). |


## Properties


| Name | Summary |
|---|---|
| [isEmpty](../-s3-path-set/is-empty.html) | [jvm]<br>abstract val [isEmpty](../-s3-path-set/is-empty.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3PathSet](../-s3-path-set/index.html) is empty. |
| [isNotEmpty](../-s3-path-set/is-not-empty.html) | [jvm]<br>abstract val [isNotEmpty](../-s3-path-set/is-not-empty.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3PathSet](../-s3-path-set/index.html) is not empty. |
| [size](../-s3-path-set/size.html) | [jvm]<br>abstract val [size](../-s3-path-set/size.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Number of paths currently in this [S3PathSet](../-s3-path-set/index.html) |

