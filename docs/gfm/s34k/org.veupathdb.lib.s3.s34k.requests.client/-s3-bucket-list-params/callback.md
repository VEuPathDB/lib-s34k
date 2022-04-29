//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.client](../index.md)/[S3BucketListParams](index.md)/[callback](callback.md)

# callback

[jvm]\
abstract var [callback](callback.md): (buckets: [S3BucketList](../../org.veupathdb.lib.s3.s34k.response/-s3-bucket-list/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?

Optional callback that will be executed on successful completion of the S3 operation.

This callback will be passed the list of buckets retrieved from the S3 store.
