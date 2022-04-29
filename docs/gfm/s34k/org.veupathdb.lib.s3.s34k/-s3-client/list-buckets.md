//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k](../index.md)/[S3Client](index.md)/[listBuckets](list-buckets.md)

# listBuckets

[jvm]\
abstract fun [listBuckets](list-buckets.md)(): [S3BucketList](../../org.veupathdb.lib.s3.s34k.response/-s3-bucket-list/index.md)

Fetches a list of all buckets available on the target S3 instance.

#### Return

A list of S3 bucket wrappers.

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [listBuckets](list-buckets.md)(action: [S3BucketListParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-list-params/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3BucketList](../../org.veupathdb.lib.s3.s34k.response/-s3-bucket-list/index.md)

Fetches a list of all buckets available on the target S3 instance.

#### Return

A list of S3 bucket wrappers.

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
abstract fun [listBuckets](list-buckets.md)(params: [S3BucketListParams](../../org.veupathdb.lib.s3.s34k.requests.client/-s3-bucket-list-params/index.md)): [S3BucketList](../../org.veupathdb.lib.s3.s34k.response/-s3-bucket-list/index.md)

Fetches a list of all buckets available on the target S3 instance.

#### Return

A list of S3 bucket wrappers.

## Parameters

jvm

| | |
|---|---|
| params | S3 operation parameters. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |
