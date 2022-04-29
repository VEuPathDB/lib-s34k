---
title: S3ObjectTagDeleteParams
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests.object](../index.html)/[S3ObjectTagDeleteParams](index.html)



# S3ObjectTagDeleteParams



[jvm]\
interface [S3ObjectTagDeleteParams](index.html) : [S3TagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-tag-delete-params/index.html), [S3ObjectRequestParams](../-s3-object-request-params/index.html)

Object tag delete operation parameters.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Properties


| Name | Summary |
|---|---|
| [allTags](../../org.veupathdb.lib.s3.s34k.requests/-s3-tag-delete-params/all-tags.html) | [jvm]<br>abstract var [allTags](../../org.veupathdb.lib.s3.s34k.requests/-s3-tag-delete-params/all-tags.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether all tags should be deleted from the target bucket. |
| [callback](../../org.veupathdb.lib.s3.s34k.requests/-s3-tag-delete-params/callback.html) | [jvm]<br>abstract var [callback](../../org.veupathdb.lib.s3.s34k.requests/-s3-tag-delete-params/callback.html): ([S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?<br>Optional callback that will be executed on successful completion of the S3 operation. |
| [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.html) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/headers.html): [S3HeadersMutable](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers-mutable/index.html)<br>Additional/custom headers to send with the S3 operation request. |
| [path](../-s3-object-request-params/path.html) | [jvm]<br>abstract var [path](../-s3-object-request-params/path.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>*Required* path to the object target of this request. |
| [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.html) | [jvm]<br>abstract val [queryParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-request-params/query-params.html): [S3QueryParamsMutable](../../org.veupathdb.lib.s3.s34k.fields.query_params/-s3-query-params-mutable/index.html)<br>Additional/custom query parameters to send with the S3 operation request. |
| [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.html) | [jvm]<br>abstract var [region](../../org.veupathdb.lib.s3.s34k.requests/-s3-region-request-params/region.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [tags](../../org.veupathdb.lib.s3.s34k.requests/-s3-tag-delete-params/tags.html) | [jvm]<br>abstract val [tags](../../org.veupathdb.lib.s3.s34k.requests/-s3-tag-delete-params/tags.html): [S3MutableTagSet](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-mutable-tag-set/index.html)<br>Set of tags to delete from the target bucket. |

