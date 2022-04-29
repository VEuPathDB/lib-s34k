//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.md)/[S3Bucket](index.md)/[deleteDirectory](delete-directory.md)

# deleteDirectory

[jvm]\
abstract fun [deleteDirectory](delete-directory.md)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), recursive: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Deletes the target directory from this bucket.

This method differs from [deleteObject](delete-object.md) and [deleteObjects](delete-objects.md) in that it treats the target object as if it was a directory rather than just a plain object and follows standard *nix directory removal rules.

#### Return

true if the directory previously existed and was deleted, false if the directory did not exist at the time this method was called.

## Parameters

jvm

| | |
|---|---|
| path | Path to the target directory that should be deleted. |
| recursive | Whether the directory should be deleted recursively.  If set to false and the directory is not empty, a [DirectoryNotEmptyError](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-not-empty-error/index.md) exception will be thrown. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.md) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.requests.object.directory.DirectoryNotEmptyError](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-not-empty-error/index.md) | If the target directory is not empty and [recursive](delete-directory.md) was set to false. |
| [org.veupathdb.lib.s3.s34k.requests.object.directory.DirectoryObjectDeleteError](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.md) | If [recursive](delete-directory.md) is true but one or more objects in the directory could not be deleted. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [deleteDirectory](delete-directory.md)(action: [S3DirectoryDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-s3-directory-delete-params/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Deletes the target directory from this bucket with the operation configured by the given [action](delete-directory.md).

This method differs from [deleteObject](delete-object.md) and [deleteObjects](delete-objects.md) in that it treats the target object as if it was a directory rather than just a plain object and follows standard *nix directory removal rules.

#### Return

true if the directory previously existed and was deleted, false if the directory did not exist at the time this method was called.

## Parameters

jvm

| | |
|---|---|
| action | Action used to configure the S3 operation. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.md) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.requests.object.directory.DirectoryNotEmptyError](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-not-empty-error/index.md) | If the target directory is not empty and [S3DirectoryDeleteParams.recursive](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-s3-directory-delete-params/recursive.md) was set to false. |
| [org.veupathdb.lib.s3.s34k.requests.object.directory.DirectoryObjectDeleteError](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.md) | If [S3DirectoryDeleteParams.recursive](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-s3-directory-delete-params/recursive.md) is true but one or more objects in the directory could not be deleted. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |

[jvm]\
abstract fun [deleteDirectory](delete-directory.md)(params: [S3DirectoryDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-s3-directory-delete-params/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Deletes the target directory from this bucket with the operation configured by the given [params](delete-directory.md).

This method differs from [deleteObject](delete-object.md) and [deleteObjects](delete-objects.md) in that it treats the target object as if it was a directory rather than just a plain object and follows standard *nix directory removal rules.

#### Return

true if the directory previously existed and was deleted, false if the directory did not exist at the time this method was called.

## Parameters

jvm

| | |
|---|---|
| params | S3 operation parameters. |

## Throws

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.md) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.requests.object.directory.DirectoryNotEmptyError](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-not-empty-error/index.md) | If the target directory is not empty and [S3DirectoryDeleteParams.recursive](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-s3-directory-delete-params/recursive.md) was set to false. |
| [org.veupathdb.lib.s3.s34k.requests.object.directory.DirectoryObjectDeleteError](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.md) | If [S3DirectoryDeleteParams.recursive](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-s3-directory-delete-params/recursive.md) is true but one or more objects in the directory could not be deleted. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |
