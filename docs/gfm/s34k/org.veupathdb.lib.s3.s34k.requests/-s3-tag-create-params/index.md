//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests](../index.md)/[S3TagCreateParams](index.md)

# S3TagCreateParams

[jvm]\
interface [S3TagCreateParams](index.md) : [S3RegionRequestParams](../-s3-region-request-params/index.md)

Base interface for S3 operation configurations that can send tags to the S3 server along with the put operation.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Properties

| Name | Summary |
|---|---|
| [headers](../-s3-request-params/headers.md) | [jvm]<br>abstract val [headers](../-s3-request-params/headers.md): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.md)<br>Additional/custom headers to send with the S3 operation request. |
| [queryParams](../-s3-request-params/query-params.md) | [jvm]<br>abstract val [queryParams](../-s3-request-params/query-params.md): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../-s3-region-request-params/region.md) | [jvm]<br>abstract var [region](../-s3-region-request-params/region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [tags](tags.md) | [jvm]<br>abstract val [tags](tags.md): [S3MutableTagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-mutable-tag-map/index.md)<br>Tags that will be attached to the target object. |

## Inheritors

| Name |
|---|
| [S3BlankTagCreateParams](../-s3-blank-tag-create-params/index.md) |
| [S3BucketTagCreateParams](../../org.veupathdb.lib.s3.s34k.requests.bucket/-s3-bucket-tag-create-params/index.md) |
| [S3ObjectWriteParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-write-params/index.md) |
