---
title: putDirectory
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.html)/[S3Bucket](index.html)/[putDirectory](put-directory.html)



# putDirectory



[jvm]\
abstract fun [putDirectory](put-directory.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.html)



Creates an empty directory at the given [path](put-directory.html).



**Warning**: Not all S3 implementations allow the creation of or hold onto empty directories.



**Note**: Some S3 implementations allow the creation of directories simply by attempting to put an object with a directory path.  For instance, putting an object at "foo/bar/fizz" may create the directory structure "foo/bar" automatically.



## Parameters


jvm

| | |
|---|---|
| path | Path to the object to create. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [putDirectory](put-directory.html)(action: [S3DirectoryCreateParams](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-s3-directory-create-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.html)

abstract fun [putDirectory](put-directory.html)(params: [S3DirectoryCreateParams](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-s3-directory-create-params/index.html)): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.html)




