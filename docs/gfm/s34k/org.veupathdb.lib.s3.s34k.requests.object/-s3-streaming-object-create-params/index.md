//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.object](../index.md)/[S3StreamingObjectCreateParams](index.md)

# S3StreamingObjectCreateParams

[jvm]\
interface [S3StreamingObjectCreateParams](index.md) : [S3ObjectCreateParams](../-s3-object-create-params/index.md)

Object put via [InputStream](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html) operation parameters.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Properties

| Name | Summary |
|---|---|
| [callback](../-s3-object-create-params/callback.md) | [jvm]<br>abstract var [callback](../-s3-object-create-params/callback.md): ([S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Optional callback that will be executed upon successful completion of the S3 operation. |
| [contentType](../-s3-object-create-params/content-type.md) | [jvm]<br>abstract var [contentType](../-s3-object-create-params/content-type.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Optional content type for the S3 object being created. |
| [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.md) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.md): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.md)<br>Additional/custom headers to send with the S3 operation request. |
| [length](length.md) | [jvm]<br>abstract var [length](length.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>Size of the object being written to the S3 store. |
| [partSize](part-size.md) | [jvm]<br>abstract var [partSize](part-size.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Max chunk size to send in a single request to the S3 store. |
| [path](../-s3-object-request-params/path.md) | [jvm]<br>abstract var [path](../-s3-object-request-params/path.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>*Required* path to the object target of this request. |
| [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.md) | [jvm]<br>abstract val [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.md): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.md) | [jvm]<br>abstract var [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [stream](stream.md) | [jvm]<br>abstract var [stream](stream.md): [InputStream](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)?<br>*Required*[InputStream](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html) over the data that will be written to the object in the S3 store. |
| [tags](../../org.veupathdb.lib.s3.s34k.requests/-s3-tag-create-params/tags.md) | [jvm]<br>abstract val [tags](../../org.veupathdb.lib.s3.s34k.requests/-s3-tag-create-params/tags.md): [S3MutableTagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-mutable-tag-map/index.md)<br>Tags that will be attached to the target object. |
