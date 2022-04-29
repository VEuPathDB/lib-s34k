//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.md)/[S3Bucket](index.md)/[getBucketTags](get-bucket-tags.md)

# getBucketTags

[jvm]\
abstract fun [getBucketTags](get-bucket-tags.md)(): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md)

Fetches the tags attached to this bucket.

#### Return

A set of the tags associated with this bucket.

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.md) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [getBucketTags](get-bucket-tags.md)(action: [S3BlankTagGetParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-get-params/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md)

Fetches the tags attached to this bucket.

#### Return

A set of the tags associated with this bucket.

## Parameters

jvm

| | |
|---|---|
| action | Function used to configure the S3 operation parameters. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.md) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [getBucketTags](get-bucket-tags.md)(params: [S3BlankTagGetParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-blank-tag-get-params/index.md)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.md)

Fetches the tags attached to this bucket.

#### Return

A set of the tags associated with this bucket.

## Parameters

jvm

| | |
|---|---|
| params | S3 operation parameters. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.md) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |
