---
title: S3FileObject
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.response.object](../index.html)/[S3FileObject](index.html)



# S3FileObject



[jvm]\
interface [S3FileObject](index.html) : [S3Object](../-s3-object/index.html)



## Functions


| Name | Summary |
|---|---|
| [delete](../-s3-object/delete.html) | [jvm]<br>abstract fun [delete](../-s3-object/delete.html)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>abstract fun [delete](../-s3-object/delete.html)(action: [S3DeleteRequestParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-delete-request-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>abstract fun [delete](../-s3-object/delete.html)(params: [S3DeleteRequestParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-delete-request-params/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Deletes the current object from the S3 store (if it still exists). |
| [deleteTags](../-s3-object/delete-tags.html) | [jvm]<br>abstract fun [deleteTags](../-s3-object/delete-tags.html)(): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)<br>Deletes all the tags currently attached to this object.<br>[jvm]<br>abstract fun [deleteTags](../-s3-object/delete-tags.html)(vararg tags: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)<br>abstract fun [deleteTags](../-s3-object/delete-tags.html)(tags: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)<br>Deletes the specified tags currently attached to this object.<br>[jvm]<br>abstract fun [deleteTags](../-s3-object/delete-tags.html)(action: [S3BlankTagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-delete-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)<br>abstract fun [deleteTags](../-s3-object/delete-tags.html)(params: [S3BlankTagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-delete-params/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html) |
| [exists](../-s3-object/exists.html) | [jvm]<br>abstract fun [exists](../-s3-object/exists.html)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>abstract fun [exists](../-s3-object/exists.html)(action: [S3BlankExistsParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-exists-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>abstract fun [exists](../-s3-object/exists.html)(params: [S3BlankExistsParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-exists-params/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [getTags](../-s3-object/get-tags.html) | [jvm]<br>abstract fun [getTags](../-s3-object/get-tags.html)(): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)<br>abstract fun [getTags](../-s3-object/get-tags.html)(action: [S3BlankTagGetParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-get-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)<br>abstract fun [getTags](../-s3-object/get-tags.html)(params: [S3BlankTagGetParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-get-params/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html) |
| [setTag](../-s3-object/set-tag.html) | [jvm]<br>abstract fun [setTag](../-s3-object/set-tag.html)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [setTags](../-s3-object/set-tags.html) | [jvm]<br>abstract fun [setTags](../-s3-object/set-tags.html)(vararg tags: [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html))<br>abstract fun [setTags](../-s3-object/set-tags.html)(action: [S3BlankTagCreateParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-create-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))<br>abstract fun [setTags](../-s3-object/set-tags.html)(tags: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html)&gt;)<br>abstract fun [setTags](../-s3-object/set-tags.html)(tags: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>abstract fun [setTags](../-s3-object/set-tags.html)(params: [S3BlankTagCreateParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-create-params/index.html)) |
| [stat](../-s3-object/stat.html) | [jvm]<br>abstract fun [stat](../-s3-object/stat.html)(): [S3ObjectMeta](../-s3-object-meta/index.html)<br>abstract fun [stat](../-s3-object/stat.html)(action: [S3BlankStatParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-stat-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3ObjectMeta](../-s3-object-meta/index.html)<br>abstract fun [stat](../-s3-object/stat.html)(params: [S3BlankStatParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-stat-params/index.html)): [S3ObjectMeta](../-s3-object-meta/index.html) |


## Properties


| Name | Summary |
|---|---|
| [bucket](../../org.veupathdb.lib.s3.s34k.response/-s3-response/bucket.html) | [jvm]<br>abstract val [bucket](../../org.veupathdb.lib.s3.s34k.response/-s3-response/bucket.html): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.html) |
| [headers](../../org.veupathdb.lib.s3.s34k.response/-s3-response/headers.html) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.response/-s3-response/headers.html): [S3Headers](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers/index.html) |
| [localFile](local-file.html) | [jvm]<br>abstract val [localFile](local-file.html): [File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html) |
| [path](../-s3-object-response/path.html) | [jvm]<br>abstract val [path](../-s3-object-response/path.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [region](../../org.veupathdb.lib.s3.s34k.response/-s3-response/region.html) | [jvm]<br>abstract val [region](../../org.veupathdb.lib.s3.s34k.response/-s3-response/region.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |

