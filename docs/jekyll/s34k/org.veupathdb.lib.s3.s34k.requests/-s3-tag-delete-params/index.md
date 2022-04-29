---
title: S3TagDeleteParams
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests](../index.html)/[S3TagDeleteParams](index.html)



# S3TagDeleteParams



[jvm]\
interface [S3TagDeleteParams](index.html) : [S3RegionRequestParams](../-s3-region-request-params/index.html)

Tag Deleter



Represents the tag deletion methods on any [S3TagDeleteParams](index.html) implementation.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Properties


| Name | Summary |
|---|---|
| [allTags](all-tags.html) | [jvm]<br>abstract var [allTags](all-tags.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether all tags should be deleted from the target bucket. |
| [callback](callback.html) | [jvm]<br>abstract var [callback](callback.html): ([S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Optional callback that will be executed on successful completion of the S3 operation. |
| [headers](../-s3-request-params/headers.html) | [jvm]<br>abstract val [headers](../-s3-request-params/headers.html): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.html)<br>Additional/custom headers to send with the S3 operation request. |
| [queryParams](../-s3-request-params/query-params.html) | [jvm]<br>abstract val [queryParams](../-s3-request-params/query-params.html): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.html)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../-s3-region-request-params/region.html) | [jvm]<br>abstract var [region](../-s3-region-request-params/region.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [tags](tags.html) | [jvm]<br>abstract val [tags](tags.html): [S3MutableTagSet](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-mutable-tag-set/index.html)<br>Set of tags to delete from the target bucket. |


## Inheritors


| Name |
|---|
| [S3BlankTagDeleteParams](../-s3-blank-tag-delete-params/index.html) |
| [S3BucketTagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.bucket/-s3-bucket-tag-delete-params/index.html) |
| [S3ObjectTagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-tag-delete-params/index.html) |

