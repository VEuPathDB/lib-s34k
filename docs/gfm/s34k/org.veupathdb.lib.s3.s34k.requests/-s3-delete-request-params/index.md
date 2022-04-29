//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests](../index.md)/[S3DeleteRequestParams](index.md)

# S3DeleteRequestParams

[jvm]\
interface [S3DeleteRequestParams](index.md) : [S3RegionRequestParams](../-s3-region-request-params/index.md)

Generalized delete operation parameters.

This type can be configured in the context of a method that provides the S3 type specific fields, then converted to the actual required type upon method execution.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Functions

| Name | Summary |
|---|---|
| [toBucketDeleteParams](to-bucket-delete-params.md) | [jvm]<br>abstract fun [toBucketDeleteParams](to-bucket-delete-params.md)(name: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.md)): [S3BucketDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-delete-params/index.md)<br>Converts this generalized delete request into a bucket delete request. |
| [toObjectDeleteParams](to-object-delete-params.md) | [jvm]<br>abstract fun [toObjectDeleteParams](to-object-delete-params.md)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3ObjectDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-delete-params/index.md)<br>Converts this generalized delete request into an object delete request. |

## Properties

| Name | Summary |
|---|---|
| [callback](callback.md) | [jvm]<br>abstract var [callback](callback.md): ([Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Callback that will be executed on successful completion of the S3 operation. |
| [headers](../-s3-request-params/headers.md) | [jvm]<br>abstract val [headers](../-s3-request-params/headers.md): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.md)<br>Additional/custom headers to send with the S3 operation request. |
| [queryParams](../-s3-request-params/query-params.md) | [jvm]<br>abstract val [queryParams](../-s3-request-params/query-params.md): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../-s3-region-request-params/region.md) | [jvm]<br>abstract var [region](../-s3-region-request-params/region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
