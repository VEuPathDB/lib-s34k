//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests](../index.md)/[S3BlankStatParams](index.md)

# S3BlankStatParams

[jvm]\
interface [S3BlankStatParams](index.md) : [S3RegionRequestParams](../-s3-region-request-params/index.md)

## Functions

| Name | Summary |
|---|---|
| [toObjectStatParams](to-object-stat-params.md) | [jvm]<br>abstract fun [toObjectStatParams](to-object-stat-params.md)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3ObjectStatParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-stat-params/index.md) |

## Properties

| Name | Summary |
|---|---|
| [callback](callback.md) | [jvm]<br>abstract var [callback](callback.md): ([S3ObjectMeta](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-meta/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? |
| [headers](../-s3-request-params/headers.md) | [jvm]<br>abstract val [headers](../-s3-request-params/headers.md): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.md)<br>Additional/custom headers to send with the S3 operation request. |
| [queryParams](../-s3-request-params/query-params.md) | [jvm]<br>abstract val [queryParams](../-s3-request-params/query-params.md): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../-s3-region-request-params/region.md) | [jvm]<br>abstract var [region](../-s3-region-request-params/region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
