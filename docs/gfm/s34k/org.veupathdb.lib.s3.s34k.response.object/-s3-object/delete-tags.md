//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.response.object](../index.md)/[S3Object](index.md)/[deleteTags](delete-tags.md)

# deleteTags

[jvm]\
abstract fun [deleteTags](delete-tags.md)(): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md)

Deletes all the tags currently attached to this object.

#### Return

A tag set containing only the tags that existed on the target object and were deleted.

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.md) | If the parent bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-object-not-found-exception/index.md) | If this object no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [deleteTags](delete-tags.md)(vararg tags: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md)

abstract fun [deleteTags](delete-tags.md)(tags: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md)

Deletes the specified tags currently attached to this object.

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.md) | If the parent bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-object-not-found-exception/index.md) | If this object no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [deleteTags](delete-tags.md)(action: [S3BlankTagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-delete-params/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md)

abstract fun [deleteTags](delete-tags.md)(params: [S3BlankTagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-delete-params/index.md)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md)
