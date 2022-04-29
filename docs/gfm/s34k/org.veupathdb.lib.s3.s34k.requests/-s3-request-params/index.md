//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests](../index.md)/[S3RequestParams](index.md)

# S3RequestParams

[jvm]\
interface [S3RequestParams](index.md)

Represents a basic S3 request.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Properties

| Name | Summary |
|---|---|
| [headers](headers.md) | [jvm]<br>abstract val [headers](headers.md): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.md)<br>Additional/custom headers to send with the S3 operation request. |
| [queryParams](query-params.md) | [jvm]<br>abstract val [queryParams](query-params.md): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md)<br>Additional/custom query parameters to send with the S3 operation request. |

## Inheritors

| Name |
|---|
| [S3RegionRequestParams](../-s3-region-request-params/index.md) |
| [S3RBDBucketDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-s3-r-b-d-bucket-delete-params/index.md) |
| [S3RBDObjectDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-s3-r-b-d-object-delete-params/index.md) |
| [S3RBDObjectListParams](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-s3-r-b-d-object-list-params/index.md) |
| [S3BucketListParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-list-params/index.md) |
