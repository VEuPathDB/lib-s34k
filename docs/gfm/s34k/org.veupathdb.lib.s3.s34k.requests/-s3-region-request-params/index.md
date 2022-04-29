//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests](../index.md)/[S3RegionRequestParams](index.md)

# S3RegionRequestParams

[jvm]\
interface [S3RegionRequestParams](index.md) : [S3RequestParams](../-s3-request-params/index.md)

Represents an S3 request with a 'region' parameter.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Properties

| Name | Summary |
|---|---|
| [headers](../-s3-request-params/headers.md) | [jvm]<br>abstract val [headers](../-s3-request-params/headers.md): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.md)<br>Additional/custom headers to send with the S3 operation request. |
| [queryParams](../-s3-request-params/query-params.md) | [jvm]<br>abstract val [queryParams](../-s3-request-params/query-params.md): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](region.md) | [jvm]<br>abstract var [region](region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |

## Inheritors

| Name |
|---|
| [S3BlankExistsParams](../-s3-blank-exists-params/index.md) |
| [S3BlankStatParams](../-s3-blank-stat-params/index.md) |
| [S3DeleteRequestParams](../-s3-delete-request-params/index.md) |
| [S3TagCreateParams](../-s3-tag-create-params/index.md) |
| [S3TagDeleteParams](../-s3-tag-delete-params/index.md) |
| [S3TagGetParams](../-s3-tag-get-params/index.md) |
| [S3BucketRequestParams](../../org.veupathdb.lib.s3.s34k.requests.bucket/-s3-bucket-request-params/index.md) |
| [S3RecursiveBucketDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-s3-recursive-bucket-delete-params/index.md) |
| [S3MultiObjectDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-multi-object-delete-params/index.md) |
| [S3ObjectListParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-list-params/index.md) |
| [S3ObjectRequestParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-request-params/index.md) |
