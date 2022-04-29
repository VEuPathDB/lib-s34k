//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k](../index.md)/[S3Client](index.md)/[createBucketIfNotExists](create-bucket-if-not-exists.md)

# createBucketIfNotExists

[jvm]\
abstract fun [createBucketIfNotExists](create-bucket-if-not-exists.md)(name: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.md), region: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md)

Attempts to create a bucket with the given name if it does not already exist in the S3 instance.

**Warning** This may not be allowed based on the security policy/ permissions granted on the target S3 instance.

#### Return

A new [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md) instance wrapping either the newly created bucket or the pre-existing bucket.

## See also

jvm

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.S3Client](create-bucket.md) |  |

## Parameters

jvm

| | |
|---|---|
| name | Name of the bucket to create. |
| region | Optional region where the bucket should reside. |

[jvm]\
abstract fun [createBucketIfNotExists](create-bucket-if-not-exists.md)(action: [S3BucketCreateParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-create-params/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md)

Attempts to create a bucket with the given name if it does not already exist in the S3 instance.

**Warning** This may not be allowed based on the security policy/ permissions granted on the target S3 instance.

#### Return

A new [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md) instance wrapping either the newly created bucket or the pre-existing bucket.

## See also

jvm

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.S3Client](create-bucket.md) |  |

## Parameters

jvm

| | |
|---|---|
| action | Action used to configure the S3 operation parameters. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [createBucketIfNotExists](create-bucket-if-not-exists.md)(params: [S3BucketCreateParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-create-params/index.md)): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md)

Attempts to create a bucket with the given name if it does not already exist in the S3 instance.

**Warning** This may not be allowed based on the security policy/ permissions granted on the target S3 instance.

#### Return

A new [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md) instance wrapping either the newly created bucket or the pre-existing bucket.

## See also

jvm

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.S3Client](create-bucket.md) |  |

## Parameters

jvm

| | |
|---|---|
| params | S3 operation parameters. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |
