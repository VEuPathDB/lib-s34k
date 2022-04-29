//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.object](../index.md)/[S3StreamingObjectCreateParams](index.md)/[stream](stream.md)

# stream

[jvm]\
abstract var [stream](stream.md): [InputStream](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)?

*Required*[InputStream](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html) over the data that will be written to the object in the S3 store.

If this value is not set when attempting to perform the S3 operation, an [InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.md) will be thrown.
