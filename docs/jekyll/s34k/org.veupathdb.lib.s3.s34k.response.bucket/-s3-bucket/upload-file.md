---
title: uploadFile
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.html)/[S3Bucket](index.html)/[uploadFile](upload-file.html)



# uploadFile



[jvm]\
abstract fun [uploadFile](upload-file.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), file: [File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html)): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.html)



Puts an object into this bucket at the given [path](upload-file.html) and copies the contents of the given [file](upload-file.html) into the newly created object.



## Parameters


jvm

| | |
|---|---|
| path | Path to the object to create. |
| file | File whose contents will be copied into the newly created object. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [uploadFile](upload-file.html)(action: [S3FileUploadParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-file-upload-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.html)



Puts an object into this bucket at the configured path and copies the contents of the given configured file into the newly created object.



The parameters must be configured by the [action](upload-file.html) given to this method.



## Parameters


jvm

| | |
|---|---|
| action | Action used to configure the S3 operation parameters. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.html) | If the S3 operation parameters are missing required fields or otherwise incorrectly configured. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [uploadFile](upload-file.html)(params: [S3FileUploadParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-file-upload-params/index.html)): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.html)



Puts an object into this bucket at the configured path and copies the contents of the given configured file into the newly created object.



## Parameters


jvm

| | |
|---|---|
| params | S3 operation parameters. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.html) | If the S3 operation parameters are missing required fields or otherwise incorrectly configured. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |



