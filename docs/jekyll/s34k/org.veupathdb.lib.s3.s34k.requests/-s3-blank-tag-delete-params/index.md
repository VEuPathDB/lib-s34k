---
title: S3BlankTagDeleteParams
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests](../index.html)/[S3BlankTagDeleteParams](index.html)



# S3BlankTagDeleteParams



[jvm]\
interface [S3BlankTagDeleteParams](index.html) : [S3TagDeleteParams](../-s3-tag-delete-params/index.html)



## Functions


| Name | Summary |
|---|---|
| [toBucketTagDeleteParams](to-bucket-tag-delete-params.html) | [jvm]<br>abstract fun [toBucketTagDeleteParams](to-bucket-tag-delete-params.html)(): [S3BucketTagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.bucket/-s3-bucket-tag-delete-params/index.html) |
| [toObjectTagDeleteParams](to-object-tag-delete-params.html) | [jvm]<br>abstract fun [toObjectTagDeleteParams](to-object-tag-delete-params.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3ObjectTagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-tag-delete-params/index.html) |


## Properties


| Name | Summary |
|---|---|
| [allTags](../-s3-tag-delete-params/all-tags.html) | [jvm]<br>abstract var [allTags](../-s3-tag-delete-params/all-tags.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether all tags should be deleted from the target bucket. |
| [callback](../-s3-tag-delete-params/callback.html) | [jvm]<br>abstract var [callback](../-s3-tag-delete-params/callback.html): ([S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Optional callback that will be executed on successful completion of the S3 operation. |
| [headers](../-s3-request-params/headers.html) | [jvm]<br>abstract val [headers](../-s3-request-params/headers.html): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.html)<br>Additional/custom headers to send with the S3 operation request. |
| [queryParams](../-s3-request-params/query-params.html) | [jvm]<br>abstract val [queryParams](../-s3-request-params/query-params.html): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.html)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../-s3-region-request-params/region.html) | [jvm]<br>abstract var [region](../-s3-region-request-params/region.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [tags](../-s3-tag-delete-params/tags.html) | [jvm]<br>abstract val [tags](../-s3-tag-delete-params/tags.html): [S3MutableTagSet](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-mutable-tag-set/index.html)<br>Set of tags to delete from the target bucket. |

