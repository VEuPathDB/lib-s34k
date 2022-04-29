//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.response.object](../index.md)/[S3Object](index.md)

# S3Object

[jvm]\
interface [S3Object](index.md) : [S3ObjectResponse](../-s3-object-response/index.md)

## Functions

| Name | Summary |
|---|---|
| [delete](delete.md) | [jvm]<br>abstract fun [delete](delete.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>abstract fun [delete](delete.md)(action: [S3DeleteRequestParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-delete-request-params/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>abstract fun [delete](delete.md)(params: [S3DeleteRequestParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-delete-request-params/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Deletes the current object from the S3 store (if it still exists). |
| [deleteTags](delete-tags.md) | [jvm]<br>abstract fun [deleteTags](delete-tags.md)(): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md)<br>Deletes all the tags currently attached to this object.<br>[jvm]<br>abstract fun [deleteTags](delete-tags.md)(vararg tags: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md)<br>abstract fun [deleteTags](delete-tags.md)(tags: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md)<br>Deletes the specified tags currently attached to this object.<br>[jvm]<br>abstract fun [deleteTags](delete-tags.md)(action: [S3BlankTagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-delete-params/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md)<br>abstract fun [deleteTags](delete-tags.md)(params: [S3BlankTagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-delete-params/index.md)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md) |
| [exists](exists.md) | [jvm]<br>abstract fun [exists](exists.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>abstract fun [exists](exists.md)(action: [S3BlankExistsParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-exists-params/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>abstract fun [exists](exists.md)(params: [S3BlankExistsParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-exists-params/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [getTags](get-tags.md) | [jvm]<br>abstract fun [getTags](get-tags.md)(): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md)<br>abstract fun [getTags](get-tags.md)(action: [S3BlankTagGetParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-get-params/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md)<br>abstract fun [getTags](get-tags.md)(params: [S3BlankTagGetParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-get-params/index.md)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md) |
| [setTag](set-tag.md) | [jvm]<br>abstract fun [setTag](set-tag.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [setTags](set-tags.md) | [jvm]<br>abstract fun [setTags](set-tags.md)(vararg tags: [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md))<br>abstract fun [setTags](set-tags.md)(action: [S3BlankTagCreateParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-create-params/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))<br>abstract fun [setTags](set-tags.md)(tags: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.md)&gt;)<br>abstract fun [setTags](set-tags.md)(tags: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>abstract fun [setTags](set-tags.md)(params: [S3BlankTagCreateParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-create-params/index.md)) |
| [stat](stat.md) | [jvm]<br>abstract fun [stat](stat.md)(): [S3ObjectMeta](../-s3-object-meta/index.md)<br>abstract fun [stat](stat.md)(action: [S3BlankStatParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-stat-params/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3ObjectMeta](../-s3-object-meta/index.md)<br>abstract fun [stat](stat.md)(params: [S3BlankStatParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-stat-params/index.md)): [S3ObjectMeta](../-s3-object-meta/index.md) |

## Properties

| Name | Summary |
|---|---|
| [bucket](../../org.veupathdb.lib.s3.s34k.response/-s3-response/bucket.md) | [jvm]<br>abstract val [bucket](../../org.veupathdb.lib.s3.s34k.response/-s3-response/bucket.md): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md) |
| [headers](../../org.veupathdb.lib.s3.s34k.response/-s3-response/headers.md) | [jvm]<br>abstract val [headers](../../org.veupathdb.lib.s3.s34k.response/-s3-response/headers.md): [S3Headers](../../org.veupathdb.lib.s3.s34k.fields.headers/-s3-headers/index.md) |
| [path](../-s3-object-response/path.md) | [jvm]<br>abstract val [path](../-s3-object-response/path.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [region](../../org.veupathdb.lib.s3.s34k.response/-s3-response/region.md) | [jvm]<br>abstract val [region](../../org.veupathdb.lib.s3.s34k.response/-s3-response/region.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |

## Inheritors

| Name |
|---|
| [S3FileObject](../-s3-file-object/index.md) |
| [S3StreamObject](../-s3-stream-object/index.md) |
