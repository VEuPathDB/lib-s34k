---
title: S3BucketRequestParams
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests.bucket](../index.html)/[S3BucketRequestParams](index.html)



# S3BucketRequestParams



[jvm]\
interface [S3BucketRequestParams](index.html) : [S3RegionRequestParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/index.html)

S3 Bucket Request



Base type for S3 bucket operation param sets.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Properties


| Name | Summary |
|---|---|
| [bucketName](bucket-name.html) | [jvm]<br>abstract var [bucketName](bucket-name.html): [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.html)?<br>*Required* name of the target S3 bucket. |
| [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.html) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.html): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.html)<br>Additional/custom headers to send with the S3 operation request. |
| [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.html) | [jvm]<br>abstract val [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.html): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.html)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.html) | [jvm]<br>abstract var [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |


## Inheritors


| Name |
|---|
| [S3BucketTagGetParams](../-s3-bucket-tag-get-params/index.html) |
| [S3BucketWriteRequestParams](../-s3-bucket-write-request-params/index.html) |
| [S3BucketDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-delete-params/index.html) |
| [S3BucketExistsParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-exists-params/index.html) |
| [S3BucketGetParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-get-params/index.html) |

