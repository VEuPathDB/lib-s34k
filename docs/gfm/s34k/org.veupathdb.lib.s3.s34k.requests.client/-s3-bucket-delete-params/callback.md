//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.client](../index.md)/[S3BucketDeleteParams](index.md)/[callback](callback.md)

# callback

[jvm]\
abstract var [callback](callback.md): (deleted: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?

Optional callback that will be executed on successful completion of the S3 operation.

This callback will be passed a boolean flag indicating whether the target bucket was deleted.  true indicates that the bucket existed in the store at the time of the operation and is now deleted, false indicates that the bucket had already been removed from the store at the time this operation was run.
