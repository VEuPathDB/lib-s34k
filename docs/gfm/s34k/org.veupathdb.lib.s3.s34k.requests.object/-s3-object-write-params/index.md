//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.object](../index.md)/[S3ObjectWriteParams](index.md)

# S3ObjectWriteParams

[jvm]\
interface [S3ObjectWriteParams](index.md) : [S3TagCreateParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-tag-create-params/index.md), [S3ObjectRequestParams](../-s3-object-request-params/index.md)

Parameter base for S3 object write operations.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Properties

| Name | Summary |
|---|---|
| [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.md) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.md): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.md)<br>Additional/custom headers to send with the S3 operation request. |
| [path](../-s3-object-request-params/path.md) | [jvm]<br>abstract var [path](../-s3-object-request-params/path.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>*Required* path to the object target of this request. |
| [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.md) | [jvm]<br>abstract val [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.md): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.md) | [jvm]<br>abstract var [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [tags](../../org.veupathdb.lib.s3.s34k.requests/-s3-tag-create-params/tags.md) | [jvm]<br>abstract val [tags](../../org.veupathdb.lib.s3.s34k.requests/-s3-tag-create-params/tags.md): [S3MutableTagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-mutable-tag-map/index.md)<br>Tags that will be attached to the target object. |

## Inheritors

| Name |
|---|
| [S3FileUploadParams](../-s3-file-upload-params/index.md) |
| [S3ObjectCreateParams](../-s3-object-create-params/index.md) |
| [S3ObjectTagCreateParams](../-s3-object-tag-create-params/index.md) |
| [S3ObjectTouchParams](../-s3-object-touch-params/index.md) |
| [S3DirectoryCreateParams](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-s3-directory-create-params/index.md) |
