//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.client](../index.md)/[S3BucketListParams](index.md)

# S3BucketListParams

[jvm]\
interface [S3BucketListParams](index.md) : [S3RequestParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/index.md)

Fetch bucket list request parameters.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Properties

| Name | Summary |
|---|---|
| [callback](callback.md) | [jvm]<br>abstract var [callback](callback.md): (buckets: [S3BucketList](../../org.veupathdb.lib.s3.s34k.response/-s3-bucket-list/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Optional callback that will be executed on successful completion of the S3 operation. |
| [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.md) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.md): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.md)<br>Additional/custom headers to send with the S3 operation request. |
| [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.md) | [jvm]<br>abstract val [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.md): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md)<br>Additional/custom query parameters to send with the S3 operation request. |
