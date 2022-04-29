//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.object](../index.md)/[S3ObjectCreateParams](index.md)

# S3ObjectCreateParams

[jvm]\
interface [S3ObjectCreateParams](index.md) : [S3ObjectWriteParams](../-s3-object-write-params/index.md)

## Properties

| Name | Summary |
|---|---|
| [callback](callback.md) | [jvm]<br>abstract var [callback](callback.md): ([S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Optional callback that will be executed upon successful completion of the S3 operation. |
| [contentType](content-type.md) | [jvm]<br>abstract var [contentType](content-type.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Optional content type for the S3 object being created. |
| [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.md) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.md): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.md)<br>Additional/custom headers to send with the S3 operation request. |
| [path](../-s3-object-request-params/path.md) | [jvm]<br>abstract var [path](../-s3-object-request-params/path.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>*Required* path to the object target of this request. |
| [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.md) | [jvm]<br>abstract val [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.md): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.md) | [jvm]<br>abstract var [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [tags](../../org.veupathdb.lib.s3.s34k.requests/-s3-tag-create-params/tags.md) | [jvm]<br>abstract val [tags](../../org.veupathdb.lib.s3.s34k.requests/-s3-tag-create-params/tags.md): [S3MutableTagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-mutable-tag-map/index.md)<br>Tags that will be attached to the target object. |

## Inheritors

| Name |
|---|
| [S3StreamingObjectCreateParams](../-s3-streaming-object-create-params/index.md) |
