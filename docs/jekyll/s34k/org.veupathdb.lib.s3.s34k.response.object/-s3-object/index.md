---
title: S3Object
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.response.object](../index.html)/[S3Object](index.html)



# S3Object



[jvm]\
interface [S3Object](index.html) : [S3ObjectResponse](../-s3-object-response/index.html)



## Functions


| Name | Summary |
|---|---|
| [delete](delete.html) | [jvm]<br>abstract fun [delete](delete.html)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>abstract fun [delete](delete.html)(action: [S3DeleteRequestParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-delete-request-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>abstract fun [delete](delete.html)(params: [S3DeleteRequestParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-delete-request-params/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Deletes the current object from the S3 store (if it still exists). |
| [deleteTags](delete-tags.html) | [jvm]<br>abstract fun [deleteTags](delete-tags.html)(): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)<br>Deletes all the tags currently attached to this object.<br>[jvm]<br>abstract fun [deleteTags](delete-tags.html)(vararg tags: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)<br>abstract fun [deleteTags](delete-tags.html)(tags: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)<br>Deletes the specified tags currently attached to this object.<br>[jvm]<br>abstract fun [deleteTags](delete-tags.html)(action: [S3BlankTagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-delete-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)<br>abstract fun [deleteTags](delete-tags.html)(params: [S3BlankTagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-delete-params/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html) |
| [exists](exists.html) | [jvm]<br>abstract fun [exists](exists.html)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>abstract fun [exists](exists.html)(action: [S3BlankExistsParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-exists-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>abstract fun [exists](exists.html)(params: [S3BlankExistsParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-exists-params/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [getTags](get-tags.html) | [jvm]<br>abstract fun [getTags](get-tags.html)(): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)<br>abstract fun [getTags](get-tags.html)(action: [S3BlankTagGetParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-get-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)<br>abstract fun [getTags](get-tags.html)(params: [S3BlankTagGetParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-get-params/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html) |
| [setTag](set-tag.html) | [jvm]<br>abstract fun [setTag](set-tag.html)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [setTags](set-tags.html) | [jvm]<br>abstract fun [setTags](set-tags.html)(vararg tags: [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html))<br>abstract fun [setTags](set-tags.html)(action: [S3BlankTagCreateParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-create-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))<br>abstract fun [setTags](set-tags.html)(tags: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html)&gt;)<br>abstract fun [setTags](set-tags.html)(tags: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>abstract fun [setTags](set-tags.html)(params: [S3BlankTagCreateParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-create-params/index.html)) |
| [stat](stat.html) | [jvm]<br>abstract fun [stat](stat.html)(): [S3ObjectMeta](../-s3-object-meta/index.html)<br>abstract fun [stat](stat.html)(action: [S3BlankStatParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-stat-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3ObjectMeta](../-s3-object-meta/index.html)<br>abstract fun [stat](stat.html)(params: [S3BlankStatParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-stat-params/index.html)): [S3ObjectMeta](../-s3-object-meta/index.html) |


## Properties


| Name | Summary |
|---|---|
| [bucket](../../org.veupathdb.lib.s3.s34k.response/-s3-response/bucket.html) | [jvm]<br>abstract val [bucket](../../org.veupathdb.lib.s3.s34k.response/-s3-response/bucket.html): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html) |
| [headers](../../org.veupathdb.lib.s3.s34k.response/-s3-response/headers.html) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.response/-s3-response/headers.html): [S3Headers](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers/index.html) |
| [path](../-s3-object-response/path.html) | [jvm]<br>abstract val [path](../-s3-object-response/path.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [region](../../org.veupathdb.lib.s3.s34k.response/-s3-response/region.html) | [jvm]<br>abstract val [region](../../org.veupathdb.lib.s3.s34k.response/-s3-response/region.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |


## Inheritors


| Name |
|---|
| [S3FileObject](../-s3-file-object/index.html) |
| [S3StreamObject](../-s3-stream-object/index.html) |

