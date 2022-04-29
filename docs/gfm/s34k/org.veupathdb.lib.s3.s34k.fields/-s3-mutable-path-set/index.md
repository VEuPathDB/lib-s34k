//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.fields](../index.md)/[S3MutablePathSet](index.md)

# S3MutablePathSet

[jvm]\
interface [S3MutablePathSet](index.md) : [S3PathSet](../-s3-path-set/index.md)

## Functions

| Name | Summary |
|---|---|
| [add](add.md) | [jvm]<br>abstract fun [add](add.md)(vararg paths: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Adds the given tags to this [S3PathSet](../-s3-path-set/index.md).<br>[jvm]<br>abstract fun [add](add.md)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>[jvm]<br>abstract fun [add](add.md)(paths: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>Adds the tags from the [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) value to this [S3PathSet](../-s3-path-set/index.md). |
| [contains](../-s3-path-set/contains.md) | [jvm]<br>abstract operator fun [contains](../-s3-path-set/contains.md)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [forEach](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-set/index.md#1332756827%2FFunctions%2F-1216412040) | [jvm]<br>open fun [forEach](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-set/index.md#1332756827%2FFunctions%2F-1216412040)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) |
| [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-858216167%2FFunctions%2F-1216412040) | [jvm]<br>abstract operator fun [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-858216167%2FFunctions%2F-1216412040)(): [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [plusAssign](plus-assign.md) | [jvm]<br>abstract operator fun [plusAssign](plus-assign.md)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-1387152138%2FFunctions%2F-1216412040) | [jvm]<br>open fun [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-1387152138%2FFunctions%2F-1216412040)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [toList](../-s3-path-set/to-list.md) | [jvm]<br>abstract fun [toList](../-s3-path-set/to-list.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [toSet](../-s3-path-set/to-set.md) | [jvm]<br>abstract fun [toSet](../-s3-path-set/to-set.md)(): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Returns a read only set containing the paths in this [S3PathSet](../-s3-path-set/index.md). |

## Properties

| Name | Summary |
|---|---|
| [isEmpty](../-s3-path-set/is-empty.md) | [jvm]<br>abstract val [isEmpty](../-s3-path-set/is-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3PathSet](../-s3-path-set/index.md) is empty. |
| [isNotEmpty](../-s3-path-set/is-not-empty.md) | [jvm]<br>abstract val [isNotEmpty](../-s3-path-set/is-not-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether this [S3PathSet](../-s3-path-set/index.md) is not empty. |
| [size](../-s3-path-set/size.md) | [jvm]<br>abstract val [size](../-s3-path-set/size.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Number of paths currently in this [S3PathSet](../-s3-path-set/index.md) |
