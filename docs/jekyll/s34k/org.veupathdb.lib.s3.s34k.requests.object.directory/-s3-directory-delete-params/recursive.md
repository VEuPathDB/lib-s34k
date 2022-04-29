---
title: recursive
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests.object.directory](../index.html)/[S3DirectoryDeleteParams](index.html)/[recursive](recursive.html)



# recursive



[jvm]\
abstract var [recursive](recursive.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)



Whether to delete this directory recursively (including all contents)



If set to false and this directory is not empty, the operation will fail with a [DirectoryNotEmptyError](../-directory-not-empty-error/index.html) exception.



Defaults to true




