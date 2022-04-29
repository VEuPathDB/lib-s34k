---
title: S3ObjectListParams
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests.object](../index.html)/[S3ObjectListParams](index.html)



# S3ObjectListParams



[jvm]\
interface [S3ObjectListParams](index.html) : [S3RegionRequestParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/index.html)



## Properties


| Name | Summary |
|---|---|
| [callback](callback.html) | [jvm]<br>abstract var [callback](callback.html): ([S3ObjectList](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-list/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Callback that will be executed on successful completion of the S3 operation. |
| [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.html) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.html): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.html)<br>Additional/custom headers to send with the S3 operation request. |
| [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.html) | [jvm]<br>abstract val [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.html): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.html)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.html) | [jvm]<br>abstract var [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |

