---
title: S3DirectoryDeleteParams
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests.object.directory](../index.html)/[S3DirectoryDeleteParams](index.html)



# S3DirectoryDeleteParams



[jvm]\
interface [S3DirectoryDeleteParams](index.html) : [S3ObjectRequestParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-request-params/index.html)

Directory deletion request parameters.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Properties


| Name | Summary |
|---|---|
| [callback](callback.html) | [jvm]<br>abstract var [callback](callback.html): (deleted: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Optional callback that will be executed on successful completion of the S3 operation. |
| [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.html) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.html): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.html)<br>Additional/custom headers to send with the S3 operation request. |
| [path](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-request-params/path.html) | [jvm]<br>abstract var [path](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-request-params/path.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>*Required* path to the object target of this request. |
| [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.html) | [jvm]<br>abstract val [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.html): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.html)<br>Additional/custom query parameters to send with the S3 operation request. |
| [recursive](recursive.html) | [jvm]<br>abstract var [recursive](recursive.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether to delete this directory recursively (including all contents) |
| [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.html) | [jvm]<br>abstract var [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |

