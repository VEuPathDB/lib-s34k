//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.object](../index.md)/[S3ObjectDownloadParams](index.md)/[localFile](local-file.md)

# localFile

[jvm]\
abstract var [localFile](local-file.md): [File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html)?

*Required* handle on the local file into which the remote object will be downloaded.

This file does not need to already exist.

This value must be set or an [InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.md) will be thrown when the request is attempted.
