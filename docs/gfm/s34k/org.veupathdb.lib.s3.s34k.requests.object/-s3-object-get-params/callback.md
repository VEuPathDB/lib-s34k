//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.object](../index.md)/[S3ObjectGetParams](index.md)/[callback](callback.md)

# callback

[jvm]\
abstract var [callback](callback.md): ([S3StreamObject](../../org.veupathdb.lib.s3.s34k.response.object/-s3-stream-object/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?

Optional callback that will be executed on successful completion of the S3 operation.

This callback will be passed an [S3StreamObject](../../org.veupathdb.lib.s3.s34k.response.object/-s3-stream-object/index.md) request wrapping a stream over the contents of the target object.
