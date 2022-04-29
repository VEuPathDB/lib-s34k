---
title: S3BlankTagCreateParams
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests](../index.html)/[S3BlankTagCreateParams](index.html)



# S3BlankTagCreateParams



[jvm]\
interface [S3BlankTagCreateParams](index.html) : [S3TagCreateParams](../-s3-tag-create-params/index.html)

Generalized tag creation request parameters.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Functions


| Name | Summary |
|---|---|
| [toBucketTagCreateParams](to-bucket-tag-create-params.html) | [jvm]<br>abstract fun [toBucketTagCreateParams](to-bucket-tag-create-params.html)(): [S3BucketTagCreateParams](../../org.veupathdb.lib.s3.s34k.requests.bucket/-s3-bucket-tag-create-params/index.html)<br>Converts this [S3BucketTagCreateParams](../../org.veupathdb.lib.s3.s34k.requests.bucket/-s3-bucket-tag-create-params/index.html) instance into an [S3BucketTagCreateParams](../../org.veupathdb.lib.s3.s34k.requests.bucket/-s3-bucket-tag-create-params/index.html) instance. |
| [toObjectTagCreateParams](to-object-tag-create-params.html) | [jvm]<br>abstract fun [toObjectTagCreateParams](to-object-tag-create-params.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3ObjectTagCreateParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-tag-create-params/index.html)<br>Converts this [S3BucketTagCreateParams](../../org.veupathdb.lib.s3.s34k.requests.bucket/-s3-bucket-tag-create-params/index.html) instance into an [S3ObjectTagCreateParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-tag-create-params/index.html) instance. |


## Properties


| Name | Summary |
|---|---|
| [callback](callback.html) | [jvm]<br>abstract var [callback](callback.html): () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? |
| [headers](../-s3-request-params/headers.html) | [jvm]<br>abstract val [headers](../-s3-request-params/headers.html): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.html)<br>Additional/custom headers to send with the S3 operation request. |
| [queryParams](../-s3-request-params/query-params.html) | [jvm]<br>abstract val [queryParams](../-s3-request-params/query-params.html): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.html)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../-s3-region-request-params/region.html) | [jvm]<br>abstract var [region](../-s3-region-request-params/region.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [tags](../-s3-tag-create-params/tags.html) | [jvm]<br>abstract val [tags](../-s3-tag-create-params/tags.html): [S3MutableTagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-mutable-tag-map/index.html)<br>Tags that will be attached to the target object. |

