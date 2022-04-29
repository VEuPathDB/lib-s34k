//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.md)/[S3Bucket](index.md)/[deleteRecursive](delete-recursive.md)

# deleteRecursive

[jvm]\
abstract fun [deleteRecursive](delete-recursive.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Recursively deletes this bucket and all its contents.

This operation happens in 3 phases which can be configured independently using the [S3RecursiveBucketDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-s3-recursive-bucket-delete-params/index.md) class. The 3 phases are:

1. 
   Fetch a list of all the objects in the bucket.
2. 
   Delete all the objects from the bucket.
3. 
   Delete the bucket itself.

#### Return

Whether the bucket was deleted.  true if the bucket previously existed and has been deleted, false if the bucket did not exist.

## See also

jvm

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.response.bucket.S3Bucket](delete.md) |  |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.requests.bucket.recursive.RecursiveBucketDeleteError](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-recursive-bucket-delete-error/index.md) | If an error occurs while attempting to delete the bucket, or it's contained objects. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [deleteRecursive](delete-recursive.md)(action: [S3RecursiveBucketDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-s3-recursive-bucket-delete-params/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Recursively deletes this bucket and all its contents with the operation configured by the given action.

#### Return

Whether the bucket was deleted.  true if the bucket previously existed and has been deleted, false if the bucket did not exist.

## See also

jvm

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.response.bucket.S3Bucket](delete.md) |  |

## Parameters

jvm

| | |
|---|---|
| action | Action used to configure the S3 operation. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.requests.bucket.recursive.RecursiveBucketDeleteError](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-recursive-bucket-delete-error/index.md) | If an error occurs while attempting to delete the bucket, or it's contained objects. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [deleteRecursive](delete-recursive.md)(params: [S3RecursiveBucketDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-s3-recursive-bucket-delete-params/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Recursively deletes this bucket and all its contents with the operation configured by the given params.

#### Return

Whether the bucket was deleted.  true if the bucket previously existed and has been deleted, false if the bucket did not exist.

## See also

jvm

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.response.bucket.S3Bucket](delete.md) |  |

## Parameters

jvm

| | |
|---|---|
| params | S3 operation parameters. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.requests.bucket.recursive.RecursiveBucketDeleteError](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-recursive-bucket-delete-error/index.md) | If an error occurs while attempting to delete the bucket, or it's contained objects. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |
