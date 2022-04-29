---
title: downloadObject
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.html)/[S3Bucket](index.html)/[downloadObject](download-object.html)



# downloadObject



[jvm]\
abstract fun [downloadObject](download-object.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), localFile: [File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html)): [S3FileObject](../../org.veupathdb.lib.s3.s34k.response.object/-s3-file-object/index.html)



Downloads the remote object at [path](download-object.html) into the specified local file.



If the target file does not exist, it will be created.



If the target file already exists, it will be truncated before downloading the object from the S3 bucket.



## Parameters


jvm

| | |
|---|---|
| path | Path to the target object in the root bucket. |
| localFile | Reference to the local file into which the contents of the remote object will be copied. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-object-not-found-exception/index.html) | If the object at the given path does not exist. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [downloadObject](download-object.html)(action: [S3ObjectDownloadParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-download-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3FileObject](../../org.veupathdb.lib.s3.s34k.response.object/-s3-file-object/index.html)

abstract fun [downloadObject](download-object.html)(params: [S3ObjectDownloadParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-download-params/index.html)): [S3FileObject](../../org.veupathdb.lib.s3.s34k.response.object/-s3-file-object/index.html)




