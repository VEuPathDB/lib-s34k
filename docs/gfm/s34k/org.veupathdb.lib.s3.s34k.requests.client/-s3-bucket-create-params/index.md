//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.client](../index.md)/[S3BucketCreateParams](index.md)

# S3BucketCreateParams

[jvm]\
interface [S3BucketCreateParams](index.md) : [S3BucketWriteRequestParams](../../org.veupathdb.lib.s3.s34k.requests.bucket/-s3-bucket-write-request-params/index.md)

Bucket create request parameters.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Properties

| Name | Summary |
|---|---|
| [bucketName](../../org.veupathdb.lib.s3.s34k.requests.bucket/-s3-bucket-request-params/bucket-name.md) | [jvm]<br>abstract var [bucketName](../../org.veupathdb.lib.s3.s34k.requests.bucket/-s3-bucket-request-params/bucket-name.md): [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.md)?<br>*Required* name of the target S3 bucket. |
| [callback](callback.md) | [jvm]<br>abstract var [callback](callback.md): (bucket: [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Optional callback that will be executed on successful completion of the S3 operation. |
| [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.md) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.md): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.md)<br>Additional/custom headers to send with the S3 operation request. |
| [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.md) | [jvm]<br>abstract val [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.md): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.md) | [jvm]<br>abstract var [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [tags](../../org.veupathdb.lib.s3.s34k.requests.bucket/-s3-bucket-write-request-params/tags.md) | [jvm]<br>abstract val [tags](../../org.veupathdb.lib.s3.s34k.requests.bucket/-s3-bucket-write-request-params/tags.md): [S3MutableTagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-mutable-tag-map/index.md)<br>Tags that may be attached to the target bucket during the execution of this S3 operation. |
