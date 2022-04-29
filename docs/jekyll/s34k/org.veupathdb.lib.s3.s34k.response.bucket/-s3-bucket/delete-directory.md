---
title: deleteDirectory
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.html)/[S3Bucket](index.html)/[deleteDirectory](delete-directory.html)



# deleteDirectory



[jvm]\
abstract fun [deleteDirectory](delete-directory.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), recursive: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)



Deletes the target directory from this bucket.



This method differs from [deleteObject](delete-object.html) and [deleteObjects](delete-objects.html) in that it treats the target object as if it was a directory rather than just a plain object and follows standard *nix directory removal rules.



#### Return



true if the directory previously existed and was deleted, false if the directory did not exist at the time this method was called.



## Parameters


jvm

| | |
|---|---|
| path | Path to the target directory that should be deleted. |
| recursive | Whether the directory should be deleted recursively.  If set to false and the directory is not empty, a [DirectoryNotEmptyError](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-not-empty-error/index.html) exception will be thrown. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.requests.object.directory.DirectoryNotEmptyError](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-not-empty-error/index.html) | If the target directory is not empty and [recursive](delete-directory.html) was set to false. |
| [org.veupathdb.lib.s3.s34k.requests.object.directory.DirectoryObjectDeleteError](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html) | If [recursive](delete-directory.html) is true but one or more objects in the directory could not be deleted. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [deleteDirectory](delete-directory.html)(action: [S3DirectoryDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-s3-directory-delete-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)



Deletes the target directory from this bucket with the operation configured by the given [action](delete-directory.html).



This method differs from [deleteObject](delete-object.html) and [deleteObjects](delete-objects.html) in that it treats the target object as if it was a directory rather than just a plain object and follows standard *nix directory removal rules.



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
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.requests.object.directory.DirectoryNotEmptyError](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-not-empty-error/index.html) | If the target directory is not empty and [S3DirectoryDeleteParams.recursive](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-s3-directory-delete-params/recursive.html) was set to false. |
| [org.veupathdb.lib.s3.s34k.requests.object.directory.DirectoryObjectDeleteError](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html) | If [S3DirectoryDeleteParams.recursive](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-s3-directory-delete-params/recursive.html) is true but one or more objects in the directory could not be deleted. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [deleteDirectory](delete-directory.html)(params: [S3DirectoryDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-s3-directory-delete-params/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)



Deletes the target directory from this bucket with the operation configured by the given [params](delete-directory.html).



This method differs from [deleteObject](delete-object.html) and [deleteObjects](delete-objects.html) in that it treats the target object as if it was a directory rather than just a plain object and follows standard *nix directory removal rules.



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
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.requests.object.directory.DirectoryNotEmptyError](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-not-empty-error/index.html) | If the target directory is not empty and [S3DirectoryDeleteParams.recursive](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-s3-directory-delete-params/recursive.html) was set to false. |
| [org.veupathdb.lib.s3.s34k.requests.object.directory.DirectoryObjectDeleteError](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-directory-object-delete-error/index.html) | If [S3DirectoryDeleteParams.recursive](../../org.veupathdb.lib.s3.s34k.requests.object.directory/-s3-directory-delete-params/recursive.html) is true but one or more objects in the directory could not be deleted. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |



