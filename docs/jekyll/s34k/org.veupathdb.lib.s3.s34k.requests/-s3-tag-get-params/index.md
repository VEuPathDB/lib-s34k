---
title: S3TagGetParams
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests](../index.html)/[S3TagGetParams](index.html)



# S3TagGetParams



[jvm]\
interface [S3TagGetParams](index.html) : [S3RegionRequestParams](../-s3-region-request-params/index.html)



## Properties


| Name | Summary |
|---|---|
| [callback](callback.html) | [jvm]<br>abstract var [callback](callback.html): ([S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Callback that will be executed on successful completion of the S3 operation. |
| [headers](../-s3-request-params/headers.html) | [jvm]<br>abstract val [headers](../-s3-request-params/headers.html): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.html)<br>Additional/custom headers to send with the S3 operation request. |
| [queryParams](../-s3-request-params/query-params.html) | [jvm]<br>abstract val [queryParams](../-s3-request-params/query-params.html): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.html)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../-s3-region-request-params/region.html) | [jvm]<br>abstract var [region](../-s3-region-request-params/region.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |


## Inheritors


| Name |
|---|
| [S3BlankTagGetParams](../-s3-blank-tag-get-params/index.html) |
| [S3BucketTagGetParams](../../org.veupathdb.lib.s3.s34k.requests.bucket/-s3-bucket-tag-get-params/index.html) |
| [S3ObjectTagGetParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-tag-get-params/index.html) |

