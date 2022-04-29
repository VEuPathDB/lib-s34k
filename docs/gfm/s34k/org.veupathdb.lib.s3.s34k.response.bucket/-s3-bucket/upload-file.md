//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.md)/[S3Bucket](index.md)/[uploadFile](upload-file.md)

# uploadFile

[jvm]\
abstract fun [uploadFile](upload-file.md)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), file: [File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html)): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.md)

Puts an object into this bucket at the given [path](upload-file.md) and copies the contents of the given [file](upload-file.md) into the newly created object.

## Parameters

jvm

| | |
|---|---|
| path | Path to the object to create. |
| file | File whose contents will be copied into the newly created object. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.md) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [uploadFile](upload-file.md)(action: [S3FileUploadParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-file-upload-params/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.md)

Puts an object into this bucket at the configured path and copies the contents of the given configured file into the newly created object.

The parameters must be configured by the [action](upload-file.md) given to this method.

## Parameters

jvm

| | |
|---|---|
| action | Action used to configure the S3 operation parameters. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.md) | If the S3 operation parameters are missing required fields or otherwise incorrectly configured. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.md) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [uploadFile](upload-file.md)(params: [S3FileUploadParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-file-upload-params/index.md)): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.md)

Puts an object into this bucket at the configured path and copies the contents of the given configured file into the newly created object.

## Parameters

jvm

| | |
|---|---|
| params | S3 operation parameters. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.md) | If the S3 operation parameters are missing required fields or otherwise incorrectly configured. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.md) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |
