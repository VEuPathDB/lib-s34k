//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.md)/[S3Bucket](index.md)/[touchObject](touch-object.md)

# touchObject

[jvm]\
abstract fun [touchObject](touch-object.md)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.md)

Creates an empty object at the given [path](touch-object.md).

#### Return

An [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.md) instance wrapping the created empty object.

## Parameters

jvm

| | |
|---|---|
| path | Path to the empty object to create. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.md) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [touchObject](touch-object.md)(action: [S3ObjectTouchParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-touch-params/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.md)

Creates an empty object at the target path with the operation configured by the given action.

#### Return

An [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.md) instance wrapping the created empty object.

## Parameters

jvm

| | |
|---|---|
| action | Action used to configure the S3 operation. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.md) | If the S3 operation parameters are missing required fields or otherwise incorrectly configured. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.md) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [touchObject](touch-object.md)(params: [S3ObjectTouchParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-touch-params/index.md)): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.md)

Creates an empty object at the target path with the operation configured by the given params.

#### Return

An [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.md) instance wrapping the created empty object.

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
