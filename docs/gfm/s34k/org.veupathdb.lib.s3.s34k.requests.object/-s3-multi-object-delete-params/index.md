//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.object](../index.md)/[S3MultiObjectDeleteParams](index.md)

# S3MultiObjectDeleteParams

[jvm]\
interface [S3MultiObjectDeleteParams](index.md) : [S3RegionRequestParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/index.md)

Multi-Object delete request parameters.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Properties

| Name | Summary |
|---|---|
| [callback](callback.md) | [jvm]<br>abstract val [callback](callback.md): () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Optional callback that will be executed on successful completion of the S3 operation. |
| [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.md) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.md): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.md)<br>Additional/custom headers to send with the S3 operation request. |
| [paths](paths.md) | [jvm]<br>abstract val [paths](paths.md): [S3MutablePathSet](../../org.veupathdb.lib.s3.s34k.fields/-s3-mutable-path-set/index.md)<br>Collection of paths to the target objects that will be deleted. |
| [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.md) | [jvm]<br>abstract val [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.md): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.md) | [jvm]<br>abstract var [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
