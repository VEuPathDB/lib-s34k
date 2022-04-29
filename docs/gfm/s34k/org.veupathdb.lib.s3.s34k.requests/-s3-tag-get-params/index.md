//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests](../index.md)/[S3TagGetParams](index.md)

# S3TagGetParams

[jvm]\
interface [S3TagGetParams](index.md) : [S3RegionRequestParams](../-s3-region-request-params/index.md)

## Properties

| Name | Summary |
|---|---|
| [callback](callback.md) | [jvm]<br>abstract var [callback](callback.md): ([S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Callback that will be executed on successful completion of the S3 operation. |
| [headers](../-s3-request-params/headers.md) | [jvm]<br>abstract val [headers](../-s3-request-params/headers.md): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.md)<br>Additional/custom headers to send with the S3 operation request. |
| [queryParams](../-s3-request-params/query-params.md) | [jvm]<br>abstract val [queryParams](../-s3-request-params/query-params.md): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../-s3-region-request-params/region.md) | [jvm]<br>abstract var [region](../-s3-region-request-params/region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |

## Inheritors

| Name |
|---|
| [S3BlankTagGetParams](../-s3-blank-tag-get-params/index.md) |
| [S3BucketTagGetParams](../../org.veupathdb.lib.s3.s34k.requests.bucket/-s3-bucket-tag-get-params/index.md) |
| [S3ObjectTagGetParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-tag-get-params/index.md) |
