//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k](../index.md)/[S3Client](index.md)/[deleteBucket](delete-bucket.md)

# deleteBucket

[jvm]\
abstract fun [deleteBucket](delete-bucket.md)(name: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.md), region: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Deletes the target bucket from the S3 instance.

#### Return

Flag indicating whether the target bucket was deleted.  true if the bucket existed and was deleted, false if the bucket did not exist.

## Parameters

jvm

| | |
|---|---|
| name | Name of the bucket to delete. |
| region | Optional region value for the S3 operation. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotEmptyException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-empty-exception/index.md) | If the target bucket is not empty. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [deleteBucket](delete-bucket.md)(action: [S3BucketDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-delete-params/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Deletes the target bucket from the S3 instance.

#### Return

Flag indicating whether the target bucket was deleted.  true if the bucket existed and was deleted, false if the bucket did not exist.

## Parameters

jvm

| | |
|---|---|
| action | Action used to configure the S3 operation parameters. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotEmptyException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-empty-exception/index.md) | If the target bucket is not empty. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [deleteBucket](delete-bucket.md)(params: [S3BucketDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-delete-params/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Deletes the target bucket from the S3 instance.

#### Return

Flag indicating whether the target bucket was deleted.  true if the bucket existed and was deleted, false if the bucket did not exist.

## Parameters

jvm

| | |
|---|---|
| params | S3 operation parameters. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotEmptyException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-empty-exception/index.md) | If the target bucket is not empty. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |
