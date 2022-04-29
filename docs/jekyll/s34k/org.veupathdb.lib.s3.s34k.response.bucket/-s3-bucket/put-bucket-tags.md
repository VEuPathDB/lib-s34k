---
title: putBucketTags
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.html)/[S3Bucket](index.html)/[putBucketTags](put-bucket-tags.html)



# putBucketTags



[jvm]\
abstract fun [putBucketTags](put-bucket-tags.html)(vararg tags: [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)



Attaches the given tags to this S3 bucket.



If the given array of tag pairs is empty, this method does nothing.



## Parameters


jvm

| | |
|---|---|
| tags | Array of key -> value pairs to assign to this bucket as tags. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [putBucketTags](put-bucket-tags.html)(vararg tags: [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html))



Attaches the given tags to this S3 bucket.



If the given array of tags is empty, this method does nothing.



## Parameters


jvm

| | |
|---|---|
| tags | Array of tags to assign to this bucket as tags. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [putBucketTags](put-bucket-tags.html)(tags: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)



Attaches the given tags to this S3 bucket.



If the given map of tags is empty, this method does nothing.



## Parameters


jvm

| | |
|---|---|
| tags | Tags to attach to this bucket. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [putBucketTags](put-bucket-tags.html)(tags: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html)&gt;)



Attaches the given tags to this S3 bucket.



If the given collection of tags is empty, this method does nothing.



## Parameters


jvm

| | |
|---|---|
| tags | Tags to attach to this bucket. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [putBucketTags](put-bucket-tags.html)(action: [S3BlankTagCreateParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-create-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))



Attaches the tags from the given operation parameters to this bucket.



## Parameters


jvm

| | |
|---|---|
| action | Action used to configure the S3 operation parameters. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [putBucketTags](put-bucket-tags.html)(params: [S3BlankTagCreateParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-create-params/index.html))



Attaches the tags from the given operation parameters to this bucket.



If the configured collection of tags is empty, this method does nothing.



## Parameters


jvm

| | |
|---|---|
| params | Parameters for the S3 operation. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |



