//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k](../index.md)/[S3Client](index.md)/[bucketExists](bucket-exists.md)

# bucketExists

[jvm]\
abstract fun [bucketExists](bucket-exists.md)(name: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.md), region: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Tests for the existence of a bucket with the given name.

#### Return

true if the target bucket exists, otherwise false.

## Parameters

jvm

| | |
|---|---|
| name | Name of the bucket to test for. |
| region | Optional region for the bucket. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [bucketExists](bucket-exists.md)(action: [S3BucketExistsParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-exists-params/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Tests for the existence of a bucket with the operation configured by the given [action](bucket-exists.md).

#### Return

true if the target bucket exists, otherwise false.

## Parameters

jvm

| | |
|---|---|
| action | Action to configure the S3 operation. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [bucketExists](bucket-exists.md)(params: [S3BucketExistsParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-exists-params/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Tests for the existence of a bucket with the operation configured by the given [params](bucket-exists.md).

#### Return

true if the target bucket exists, otherwise false.

## Parameters

jvm

| | |
|---|---|
| params | S3 operation parameters. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |
