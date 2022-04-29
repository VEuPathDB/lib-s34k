//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.md)/[S3Bucket](index.md)/[putDirectory](put-directory.md)

# putDirectory

[jvm]\
abstract fun [putDirectory](put-directory.md)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.md)

Creates an empty directory at the given [path](put-directory.md).

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
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.md) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [putDirectory](put-directory.md)(action: [S3DirectoryCreateParams](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-s3-directory-create-params/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.md)

abstract fun [putDirectory](put-directory.md)(params: [S3DirectoryCreateParams](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-s3-directory-create-params/index.md)): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.md)
