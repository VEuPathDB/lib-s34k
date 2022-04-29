//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.response](../index.md)/[S3BucketList](index.md)

# S3BucketList

[jvm]\
interface [S3BucketList](index.md) : [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md)&gt;

## Functions

| Name | Summary |
|---|---|
| [forEach](index.md#548353293%2FFunctions%2F-1216412040) | [jvm]<br>open fun [forEach](index.md#548353293%2FFunctions%2F-1216412040)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md)&gt;) |
| [get](get.md) | [jvm]<br>abstract operator fun [get](get.md)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md)<br>abstract operator fun [get](get.md)(name: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.md)): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md)? |
| [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-858216167%2FFunctions%2F-1216412040) | [jvm]<br>abstract operator fun [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-858216167%2FFunctions%2F-1216412040)(): [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)&lt;[S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md)&gt; |
| [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-1387152138%2FFunctions%2F-1216412040) | [jvm]<br>open fun [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.md#-1387152138%2FFunctions%2F-1216412040)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md)&gt; |
| [stream](stream.md) | [jvm]<br>abstract fun [stream](stream.md)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)&lt;[S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md)&gt; |
| [toList](to-list.md) | [jvm]<br>abstract fun [toList](to-list.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md)&gt; |
| [toMap](to-map.md) | [jvm]<br>abstract fun [toMap](to-map.md)(): [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.md), [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md)&gt; |

## Properties

| Name | Summary |
|---|---|
| [isEmpty](is-empty.md) | [jvm]<br>abstract val [isEmpty](is-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isNotEmpty](is-not-empty.md) | [jvm]<br>abstract val [isNotEmpty](is-not-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [size](size.md) | [jvm]<br>abstract val [size](size.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
