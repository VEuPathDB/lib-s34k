//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.object](../index.md)/[S3ObjectDownloadParams](index.md)/[callback](callback.md)

# callback

[jvm]\
abstract var [callback](callback.md): ([S3FileObject](../../org.veupathdb.lib.s3.s34k.response.object/-s3-file-object/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?

Optional callback that will be executed on successful completion of the S3 operation.

This callback will be passed an [S3FileObject](../../org.veupathdb.lib.s3.s34k.response.object/-s3-file-object/index.md) instance representing the file that was downloaded.
