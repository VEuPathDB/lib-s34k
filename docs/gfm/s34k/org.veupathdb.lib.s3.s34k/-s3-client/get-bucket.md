//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k](../index.md)/[S3Client](index.md)/[getBucket](get-bucket.md)

# getBucket

[jvm]\
abstract fun [getBucket](get-bucket.md)(name: [BucketName](../../org.veupathdb.lib.s3.s34k.fields/-bucket-name/index.md), region: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md)

Creates a new [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md) instance wrapping the target S3 bucket.

#### Return

A new [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md) instance wrapping the target bucket.

## See also

jvm

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.S3Client](create-bucket-if-not-exists.md) |  |

## Parameters

jvm

| | |
|---|---|
| name | Name of the bucket to wrap. |
| region | Optional region for the bucket. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.md) | If the target bucket does not exist. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [getBucket](get-bucket.md)(action: [S3BucketGetParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-get-params/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md)

Creates a new [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md) instance wrapping the target S3 bucket.

#### Return

A new [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md) instance wrapping the target bucket.

## See also

jvm

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.S3Client](create-bucket-if-not-exists.md) |  |

## Parameters

jvm

| | |
|---|---|
| action | Action used to configure the S3 operation parameters. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.md) | If the target bucket does not exist. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [getBucket](get-bucket.md)(params: [S3BucketGetParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-get-params/index.md)): [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md)

Creates a new [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md) instance wrapping the target S3 bucket.

#### Return

A new [S3Bucket](../../org.veupathdb.lib.s3.s34k.response.bucket/-s3-bucket/index.md) instance wrapping the target bucket.

## See also

jvm

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.S3Client](create-bucket-if-not-exists.md) |  |

## Parameters

jvm

| | |
|---|---|
| params | S3 operation parameters. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.md) | If the target bucket does not exist. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |
