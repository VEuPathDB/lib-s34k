---
title: S3DeleteRequestParams
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests](../index.html)/[S3DeleteRequestParams](index.html)



# S3DeleteRequestParams



[jvm]\
interface [S3DeleteRequestParams](index.html) : [S3RegionRequestParams](../-s3-region-request-params/index.html)

Generalized delete operation parameters.



This type can be configured in the context of a method that provides the S3 type specific fields, then converted to the actual required type upon method execution.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Functions


| Name | Summary |
|---|---|
| [toBucketDeleteParams](to-bucket-delete-params.html) | [jvm]<br>abstract fun [toBucketDeleteParams](to-bucket-delete-params.html)(name: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.html)): [S3BucketDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-delete-params/index.html)<br>Converts this generalized delete request into a bucket delete request. |
| [toObjectDeleteParams](to-object-delete-params.html) | [jvm]<br>abstract fun [toObjectDeleteParams](to-object-delete-params.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3ObjectDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-delete-params/index.html)<br>Converts this generalized delete request into an object delete request. |


## Properties


| Name | Summary |
|---|---|
| [callback](callback.html) | [jvm]<br>abstract var [callback](callback.html): ([Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Callback that will be executed on successful completion of the S3 operation. |
| [headers](../-s3-request-params/headers.html) | [jvm]<br>abstract val [headers](../-s3-request-params/headers.html): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.html)<br>Additional/custom headers to send with the S3 operation request. |
| [queryParams](../-s3-request-params/query-params.html) | [jvm]<br>abstract val [queryParams](../-s3-request-params/query-params.html): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.html)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../-s3-region-request-params/region.html) | [jvm]<br>abstract var [region](../-s3-region-request-params/region.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |

