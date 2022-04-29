//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.bucket](../index.md)/[S3BucketWriteRequestParams](index.md)

# S3BucketWriteRequestParams

[jvm]\
interface [S3BucketWriteRequestParams](index.md) : [S3BucketRequestParams](../-s3-bucket-request-params/index.md)

S3 Bucket Write Request

Base type for S3 operations that create or otherwise write to a bucket.

This type includes optional tags that may be attached to the bucket during the operation.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Properties

| Name | Summary |
|---|---|
| [bucketName](../-s3-bucket-request-params/bucket-name.md) | [jvm]<br>abstract var [bucketName](../-s3-bucket-request-params/bucket-name.md): [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.md)?<br>*Required* name of the target S3 bucket. |
| [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.md) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.md): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.md)<br>Additional/custom headers to send with the S3 operation request. |
| [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.md) | [jvm]<br>abstract val [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.md): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.md) | [jvm]<br>abstract var [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [tags](tags.md) | [jvm]<br>abstract val [tags](tags.md): [S3MutableTagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-mutable-tag-map/index.md)<br>Tags that may be attached to the target bucket during the execution of this S3 operation. |

## Inheritors

| Name |
|---|
| [S3BucketCreateParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-create-params/index.md) |
