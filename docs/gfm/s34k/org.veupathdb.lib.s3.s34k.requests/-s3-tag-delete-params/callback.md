//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests](../index.md)/[S3TagDeleteParams](index.md)/[callback](callback.md)

# callback

[jvm]\
abstract var [callback](callback.md): ([S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?

Optional callback that will be executed on successful completion of the S3 operation.

This callback will be passed an [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md) instance containing the tags that were deleted from the S3 store.  If a target tag did not exist at the time the delete request was made, it will not appear in this tag map.
