//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.object](../index.md)/[S3ObjectRequestParams](index.md)

# S3ObjectRequestParams

[jvm]\
interface [S3ObjectRequestParams](index.md) : [S3RegionRequestParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/index.md)

Base parameters for operations relating to a target S3 object.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Properties

| Name | Summary |
|---|---|
| [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.md) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.md): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.md)<br>Additional/custom headers to send with the S3 operation request. |
| [path](path.md) | [jvm]<br>abstract var [path](path.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>*Required* path to the object target of this request. |
| [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.md) | [jvm]<br>abstract val [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.md): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.md) | [jvm]<br>abstract var [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |

## Inheritors

| Name |
|---|
| [S3ObjectDeleteParams](../-s3-object-delete-params/index.md) |
| [S3ObjectDownloadParams](../-s3-object-download-params/index.md) |
| [S3ObjectExistsParams](../-s3-object-exists-params/index.md) |
| [S3ObjectGetParams](../-s3-object-get-params/index.md) |
| [S3ObjectStatParams](../-s3-object-stat-params/index.md) |
| [S3ObjectTagDeleteParams](../-s3-object-tag-delete-params/index.md) |
| [S3ObjectTagGetParams](../-s3-object-tag-get-params/index.md) |
| [S3ObjectWriteParams](../-s3-object-write-params/index.md) |
| [S3DirectoryDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-s3-directory-delete-params/index.md) |
