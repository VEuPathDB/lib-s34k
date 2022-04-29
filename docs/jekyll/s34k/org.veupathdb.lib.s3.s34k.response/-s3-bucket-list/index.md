---
title: S3BucketList
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.response](../index.html)/[S3BucketList](index.html)



# S3BucketList



[jvm]\
interface [S3BucketList](index.html) : [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html)&gt;



## Functions


| Name | Summary |
|---|---|
| [forEach](index.html#548353293%2FFunctions%2F863300109) | [jvm]<br>open fun [forEach](index.html#548353293%2FFunctions%2F863300109)(p0: [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)&lt;in [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html)&gt;) |
| [get](get.html) | [jvm]<br>abstract operator fun [get](get.html)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html)<br>abstract operator fun [get](get.html)(name: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.html)): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html)? |
| [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-858216167%2FFunctions%2F863300109) | [jvm]<br>abstract operator fun [iterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-858216167%2FFunctions%2F863300109)(): [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)&lt;[S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html)&gt; |
| [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-1387152138%2FFunctions%2F863300109) | [jvm]<br>open fun [spliterator](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html#-1387152138%2FFunctions%2F863300109)(): [Spliterator](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)&lt;[S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html)&gt; |
| [stream](stream.html) | [jvm]<br>abstract fun [stream](stream.html)(): [Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)&lt;[S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html)&gt; |
| [toList](to-list.html) | [jvm]<br>abstract fun [toList](to-list.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html)&gt; |
| [toMap](to-map.html) | [jvm]<br>abstract fun [toMap](to-map.html)(): [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.html), [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html)&gt; |


## Properties


| Name | Summary |
|---|---|
| [isEmpty](is-empty.html) | [jvm]<br>abstract val [isEmpty](is-empty.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isNotEmpty](is-not-empty.html) | [jvm]<br>abstract val [isNotEmpty](is-not-empty.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [size](size.html) | [jvm]<br>abstract val [size](size.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

