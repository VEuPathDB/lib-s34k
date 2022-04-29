//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.client](../index.md)/[S3BucketExistsParams](index.md)/[callback](callback.md)

# callback

[jvm]\
abstract var [callback](callback.md): (exists: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?

Optional callback that will be executed on successful completion of the S3 operation.

This callback will be passed a boolean flag indicating whether the target bucket exists in the S3 store.
