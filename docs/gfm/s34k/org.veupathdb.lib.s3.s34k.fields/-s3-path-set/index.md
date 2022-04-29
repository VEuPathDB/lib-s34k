//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.fields](../index.md)/[S3PathSet](index.md)

# S3PathSet

[jvm]\
interface [S3PathSet](index.md) : [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; 

Set of object names.

## Functions

| Name | Summary |
|---|---|
| [contains](contains.md) | [jvm]<br>abstract operator fun [contains](contains.md)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [forEach](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-set/index.md#1332756827%2FFunctions%2F-1216412040) | [jvm]<br>open fun [forEach](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-set/index.md#1332756827%2FFunctions%2F-1216412040)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) |
| [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-858216167%2FFunctions%2F-1216412040) | [jvm]<br>abstract operator fun [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-858216167%2FFunctions%2F-1216412040)(): [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-1387152138%2FFunctions%2F-1216412040) | [jvm]<br>open fun [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-1387152138%2FFunctions%2F-1216412040)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [toList](to-list.md) | [jvm]<br>abstract fun [toList](to-list.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [toSet](to-set.md) | [jvm]<br>abstract fun [toSet](to-set.md)(): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Returns a read only set containing the paths in this [S3PathSet](index.md). |

## Properties

| Name | Summary |
|---|---|
| [isEmpty](is-empty.md) | [jvm]<br>abstract val [isEmpty](is-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3PathSet](index.md) is empty. |
| [isNotEmpty](is-not-empty.md) | [jvm]<br>abstract val [isNotEmpty](is-not-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3PathSet](index.md) is not empty. |
| [size](size.md) | [jvm]<br>abstract val [size](size.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Number of paths currently in this [S3PathSet](index.md) |

## Inheritors

| Name |
|---|
| [S3MutablePathSet](../-s3-mutable-path-set/index.md) |
