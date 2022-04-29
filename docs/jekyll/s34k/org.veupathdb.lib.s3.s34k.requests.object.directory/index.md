---
title: org.veupathdb.lib.s3.s34k.requests.object.directory
---
//[s34k](../../index.html)/[org.veupathdb.lib.s3.s34k.requests.object.directory](index.html)



# Package org.veupathdb.lib.s3.s34k.requests.object.directory



## Types


| Name | Summary |
|---|---|
| [DirectoryDeleteError](-directory-delete-error/index.html) | [jvm]<br>open class [DirectoryDeleteError](-directory-delete-error/index.html) : [S34kException](../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) |
| [DirectoryNotEmptyError](-directory-not-empty-error/index.html) | [jvm]<br>class [DirectoryNotEmptyError](-directory-not-empty-error/index.html) : [DirectoryDeleteError](-directory-delete-error/index.html)<br>Exception thrown when attempting to delete a directory that is not empty without using the delete operation's recursive flag. |
| [DirectoryObjectDeleteError](-directory-object-delete-error/index.html) | [jvm]<br>class [DirectoryObjectDeleteError](-directory-object-delete-error/index.html) : [DirectoryDeleteError](-directory-delete-error/index.html) |
| [S3DirectoryCreateParams](-s3-directory-create-params/index.html) | [jvm]<br>interface [S3DirectoryCreateParams](-s3-directory-create-params/index.html) : [S3ObjectWriteParams](../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-write-params/index.html)<br>Directory creation operation parameters. |
| [S3DirectoryDeleteParams](-s3-directory-delete-params/index.html) | [jvm]<br>interface [S3DirectoryDeleteParams](-s3-directory-delete-params/index.html) : [S3ObjectRequestParams](../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-request-params/index.html)<br>Directory deletion request parameters. |

