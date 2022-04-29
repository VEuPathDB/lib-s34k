---
title: deleteBucketTags
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.html)/[S3Bucket](index.html)/[deleteBucketTags](delete-bucket-tags.html)



# deleteBucketTags



[jvm]\
abstract fun [deleteBucketTags](delete-bucket-tags.html)(): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)



Deletes all the tags from this bucket.



#### Return



Set of the tags that were deleted.



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [deleteBucketTags](delete-bucket-tags.html)(vararg tags: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)



Deletes the listed tags from this bucket.



#### Return



Set of the tags that were deleted.



## Parameters


jvm

| | |
|---|---|
| tags | Tags to delete. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [deleteBucketTags](delete-bucket-tags.html)(tags: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)



Deletes the listed tags from this bucket.



#### Return



Set of the tags that were deleted.



## Parameters


jvm

| | |
|---|---|
| tags | Iterable over tags to delete. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [deleteBucketTags](delete-bucket-tags.html)(action: [S3BucketTagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.bucket/-s3-bucket-tag-delete-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)



Deletes the target tags from this bucket.



#### Return



Set of the tags that were deleted.



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
abstract fun [deleteBucketTags](delete-bucket-tags.html)(params: [S3BucketTagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.bucket/-s3-bucket-tag-delete-params/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)



Deletes the target tags from this bucket.



#### Return



Set of the tags that were deleted.



## Parameters


jvm

| | |
|---|---|
| params | S3 operation parameters. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |



