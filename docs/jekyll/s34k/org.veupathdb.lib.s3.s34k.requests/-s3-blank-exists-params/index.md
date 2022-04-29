---
title: S3BlankExistsParams
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests](../index.html)/[S3BlankExistsParams](index.html)



# S3BlankExistsParams



[jvm]\
interface [S3BlankExistsParams](index.html) : [S3RegionRequestParams](../-s3-region-request-params/index.html)

Blank existence check request parameters.



This type may be used to assemble the request then convert to a specific target, bucket or object.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Functions


| Name | Summary |
|---|---|
| [toBucketExistsParams](to-bucket-exists-params.html) | [jvm]<br>abstract fun [toBucketExistsParams](to-bucket-exists-params.html)(bucket: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.html)): [S3BucketExistsParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-exists-params/index.html) |
| [toObjectExistsParams](to-object-exists-params.html) | [jvm]<br>abstract fun [toObjectExistsParams](to-object-exists-params.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3ObjectExistsParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-exists-params/index.html) |


## Properties


| Name | Summary |
|---|---|
| [callback](callback.html) | [jvm]<br>abstract var [callback](callback.html): (exists: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Optional callback that will be executed on successful completion of the S3 operation. |
| [headers](../-s3-request-params/headers.html) | [jvm]<br>abstract val [headers](../-s3-request-params/headers.html): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.html)<br>Additional/custom headers to send with the S3 operation request. |
| [queryParams](../-s3-request-params/query-params.html) | [jvm]<br>abstract val [queryParams](../-s3-request-params/query-params.html): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.html)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../-s3-region-request-params/region.html) | [jvm]<br>abstract var [region](../-s3-region-request-params/region.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |

