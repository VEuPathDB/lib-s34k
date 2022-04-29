//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests](../index.md)/[S3DeleteRequestParams](index.md)/[callback](callback.md)

# callback

[jvm]\
abstract var [callback](callback.md): ([Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?

Callback that will be executed on successful completion of the S3 operation.

The callback will be passed the result of the operation, true meaning the target previously existed and has been deleted, false meaning the target did not exist at the time of the operation.
