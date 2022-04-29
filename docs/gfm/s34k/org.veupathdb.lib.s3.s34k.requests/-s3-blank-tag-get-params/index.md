//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests](../index.md)/[S3BlankTagGetParams](index.md)

# S3BlankTagGetParams

[jvm]\
interface [S3BlankTagGetParams](index.md) : [S3TagGetParams](../-s3-tag-get-params/index.md)

## Functions

| Name | Summary |
|---|---|
| [toBucketTagGetParams](to-bucket-tag-get-params.md) | [jvm]<br>abstract fun [toBucketTagGetParams](to-bucket-tag-get-params.md)(bucket: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.md)): [S3BucketTagGetParams](../../org.veupathdb.lib.s3.s34k.requests.bucket/-s3-bucket-tag-get-params/index.md) |
| [toObjectTagGetParams](to-object-tag-get-params.md) | [jvm]<br>abstract fun [toObjectTagGetParams](to-object-tag-get-params.md)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3ObjectTagGetParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-tag-get-params/index.md) |

## Properties

| Name | Summary |
|---|---|
| [callback](../-s3-tag-get-params/callback.md) | [jvm]<br>abstract var [callback](../-s3-tag-get-params/callback.md): ([S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Callback that will be executed on successful completion of the S3 operation. |
| [headers](../-s3-request-params/headers.md) | [jvm]<br>abstract val [headers](../-s3-request-params/headers.md): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.md)<br>Additional/custom headers to send with the S3 operation request. |
| [queryParams](../-s3-request-params/query-params.md) | [jvm]<br>abstract val [queryParams](../-s3-request-params/query-params.md): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../-s3-region-request-params/region.md) | [jvm]<br>abstract var [region](../-s3-region-request-params/region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
