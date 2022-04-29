---
title: S3PathSet
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.fields](../index.html)/[S3PathSet](index.html)



# S3PathSet



[jvm]\
interface [S3PathSet](index.html) : [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; 

Set of object names.



## Functions


| Name | Summary |
|---|---|
| [contains](contains.html) | [jvm]<br>abstract operator fun [contains](contains.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [forEach](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-set/index.html#1332756827%2FFunctions%2F863300109) | [jvm]<br>open fun [forEach](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-set/index.html#1332756827%2FFunctions%2F863300109)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) |
| [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-858216167%2FFunctions%2F863300109) | [jvm]<br>abstract operator fun [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-858216167%2FFunctions%2F863300109)(): [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-1387152138%2FFunctions%2F863300109) | [jvm]<br>open fun [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-1387152138%2FFunctions%2F863300109)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [toList](to-list.html) | [jvm]<br>abstract fun [toList](to-list.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [toSet](to-set.html) | [jvm]<br>abstract fun [toSet](to-set.html)(): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Returns a read only set containing the paths in this [S3PathSet](index.html). |


## Properties


| Name | Summary |
|---|---|
| [isEmpty](is-empty.html) | [jvm]<br>abstract val [isEmpty](is-empty.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3PathSet](index.html) is empty. |
| [isNotEmpty](is-not-empty.html) | [jvm]<br>abstract val [isNotEmpty](is-not-empty.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3PathSet](index.html) is not empty. |
| [size](size.html) | [jvm]<br>abstract val [size](size.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Number of paths currently in this [S3PathSet](index.html) |


## Inheritors


| Name |
|---|
| [S3MutablePathSet](../-s3-mutable-path-set/index.html) |

