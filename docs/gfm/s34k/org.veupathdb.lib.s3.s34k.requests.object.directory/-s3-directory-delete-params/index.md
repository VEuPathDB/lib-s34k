//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.object.directory](../index.md)/[S3DirectoryDeleteParams](index.md)

# S3DirectoryDeleteParams

[jvm]\
interface [S3DirectoryDeleteParams](index.md) : [S3ObjectRequestParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-request-params/index.md)

Directory deletion request parameters.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Properties

| Name | Summary |
|---|---|
| [callback](callback.md) | [jvm]<br>abstract var [callback](callback.md): (deleted: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Optional callback that will be executed on successful completion of the S3 operation. |
| [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.md) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.md): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.md)<br>Additional/custom headers to send with the S3 operation request. |
| [path](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-request-params/path.md) | [jvm]<br>abstract var [path](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-request-params/path.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>*Required* path to the object target of this request. |
| [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.md) | [jvm]<br>abstract val [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.md): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.md)<br>Additional/custom query parameters to send with the S3 operation request. |
| [recursive](recursive.md) | [jvm]<br>abstract var [recursive](recursive.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether to delete this directory recursively (including all contents) |
| [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.md) | [jvm]<br>abstract var [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
