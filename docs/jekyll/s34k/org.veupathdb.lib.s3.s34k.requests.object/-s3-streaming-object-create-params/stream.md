---
title: stream
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests.object](../index.html)/[S3StreamingObjectCreateParams](index.html)/[stream](stream.html)



# stream



[jvm]\
abstract var [stream](stream.html): [InputStream](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)?



*Required*[InputStream](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html) over the data that will be written to the object in the S3 store.



If this value is not set when attempting to perform the S3 operation, an [InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.html) will be thrown.




