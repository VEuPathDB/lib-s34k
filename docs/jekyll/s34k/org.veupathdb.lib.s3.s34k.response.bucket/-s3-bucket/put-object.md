---
title: putObject
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.html)/[S3Bucket](index.html)/[putObject](put-object.html)



# putObject



[jvm]\
abstract fun [putObject](put-object.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), stream: [InputStream](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html), size: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) = -1): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.html)



Puts an object of a known size into this bucket at the given [path](put-object.html) and copies at most [size](put-object.html) bytes of the contents of the given [stream](put-object.html) into the newly created object.



## Parameters


jvm

| | |
|---|---|
| path | Path to the object to create. |
| stream | [InputStream](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html) over the contents to copy into the newly created object. |
| size | Number of bytes to copy into the newly created object. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [putObject](put-object.html)(action: [S3StreamingObjectCreateParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-streaming-object-create-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.html)

abstract fun [putObject](put-object.html)(params: [S3StreamingObjectCreateParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-streaming-object-create-params/index.html)): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.html)




