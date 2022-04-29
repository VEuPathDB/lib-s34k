---
title: S3Client
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k](../index.html)/[S3Client](index.html)



# S3Client



[jvm]\
interface [S3Client](index.html)

S3 API Wrapper



Wraps a specific S3 API implementation with a general wrapper so as not to tie the code in this library to any one implementation.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Functions


| Name | Summary |
|---|---|
| [bucketExists](bucket-exists.html) | [jvm]<br>abstract fun [bucketExists](bucket-exists.html)(action: [S3BucketExistsParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-exists-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Tests for the existence of a bucket with the operation configured by the given [action](bucket-exists.html).<br>[jvm]<br>abstract fun [bucketExists](bucket-exists.html)(params: [S3BucketExistsParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-exists-params/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Tests for the existence of a bucket with the operation configured by the given [params](bucket-exists.html).<br>[jvm]<br>abstract fun [bucketExists](bucket-exists.html)(name: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.html), region: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Tests for the existence of a bucket with the given name. |
| [createBucket](create-bucket.html) | [jvm]<br>abstract fun [createBucket](create-bucket.html)(action: [S3BucketCreateParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-create-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html)<br>Attempts to create a bucket with the given name with the operation configured by the given [action](create-bucket.html).<br>[jvm]<br>abstract fun [createBucket](create-bucket.html)(params: [S3BucketCreateParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-create-params/index.html)): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html)<br>Attempts to create a bucket with the given name with the operation configured by the given [params](create-bucket.html).<br>[jvm]<br>abstract fun [createBucket](create-bucket.html)(name: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.html), region: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html)<br>Attempts to create a bucket with the given name. |
| [createBucketIfNotExists](create-bucket-if-not-exists.html) | [jvm]<br>abstract fun [createBucketIfNotExists](create-bucket-if-not-exists.html)(action: [S3BucketCreateParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-create-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html)<br>abstract fun [createBucketIfNotExists](create-bucket-if-not-exists.html)(params: [S3BucketCreateParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-create-params/index.html)): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html)<br>abstract fun [createBucketIfNotExists](create-bucket-if-not-exists.html)(name: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.html), region: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html)<br>Attempts to create a bucket with the given name if it does not already exist in the S3 instance. |
| [deleteBucket](delete-bucket.html) | [jvm]<br>abstract fun [deleteBucket](delete-bucket.html)(action: [S3BucketDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-delete-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>abstract fun [deleteBucket](delete-bucket.html)(params: [S3BucketDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-delete-params/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>abstract fun [deleteBucket](delete-bucket.html)(name: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.html), region: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Deletes the target bucket from the S3 instance. |
| [deleteBucketRecursive](delete-bucket-recursive.html) | [jvm]<br>abstract fun [deleteBucketRecursive](delete-bucket-recursive.html)(action: [S3ClientRecursiveBucketDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-s3-client-recursive-bucket-delete-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>abstract fun [deleteBucketRecursive](delete-bucket-recursive.html)(params: [S3ClientRecursiveBucketDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-s3-client-recursive-bucket-delete-params/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>abstract fun [deleteBucketRecursive](delete-bucket-recursive.html)(name: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.html), region: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [getBucket](get-bucket.html) | [jvm]<br>abstract fun [getBucket](get-bucket.html)(action: [S3BucketGetParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-get-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html)<br>abstract fun [getBucket](get-bucket.html)(params: [S3BucketGetParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-get-params/index.html)): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html)<br>abstract fun [getBucket](get-bucket.html)(name: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.html), region: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html)<br>Creates a new [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html) instance wrapping the target S3 bucket. |
| [listBuckets](list-buckets.html) | [jvm]<br>abstract fun [listBuckets](list-buckets.html)(): [S3BucketList](../../org.veupathdb.lib.s3.s34k.response/-s3-bucket-list/index.html)<br>abstract fun [listBuckets](list-buckets.html)(action: [S3BucketListParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-list-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3BucketList](../../org.veupathdb.lib.s3.s34k.response/-s3-bucket-list/index.html)<br>abstract fun [listBuckets](list-buckets.html)(params: [S3BucketListParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-list-params/index.html)): [S3BucketList](../../org.veupathdb.lib.s3.s34k.response/-s3-bucket-list/index.html)<br>Fetches a list of all buckets available on the target S3 instance. |


## Properties


| Name | Summary |
|---|---|
| [defaultRegion](default-region.html) | [jvm]<br>abstract val [defaultRegion](default-region.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |

