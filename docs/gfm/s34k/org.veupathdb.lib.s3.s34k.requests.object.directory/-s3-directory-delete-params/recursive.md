//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests.object.directory](../index.md)/[S3DirectoryDeleteParams](index.md)/[recursive](recursive.md)

# recursive

[jvm]\
abstract var [recursive](recursive.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Whether to delete this directory recursively (including all contents)

If set to false and this directory is not empty, the operation will fail with a [DirectoryNotEmptyError](../-directory-not-empty-error/index.md) exception.

Defaults to true
