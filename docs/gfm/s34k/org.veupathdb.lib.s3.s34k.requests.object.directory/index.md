//[s34k](../../index.md)/[org.veupathdb.lib.s3.s34k.requests.object.directory](index.md)

# Package org.veupathdb.lib.s3.s34k.requests.object.directory

## Types

| Name | Summary |
|---|---|
| [DirectoryDeleteError](-directory-delete-error/index.md) | [jvm]<br>open class [DirectoryDeleteError](-directory-delete-error/index.md) : [S34kException](../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.md) |
| [DirectoryNotEmptyError](-directory-not-empty-error/index.md) | [jvm]<br>class [DirectoryNotEmptyError](-directory-not-empty-error/index.md) : [DirectoryDeleteError](-directory-delete-error/index.md)<br>Exception thrown when attempting to delete a directory that is not empty without using the delete operation's recursive flag. |
| [DirectoryObjectDeleteError](-directory-object-delete-error/index.md) | [jvm]<br>class [DirectoryObjectDeleteError](-directory-object-delete-error/index.md) : [DirectoryDeleteError](-directory-delete-error/index.md) |
| [S3DirectoryCreateParams](-s3-directory-create-params/index.md) | [jvm]<br>interface [S3DirectoryCreateParams](-s3-directory-create-params/index.md) : [S3ObjectWriteParams](../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-write-params/index.md)<br>Directory creation operation parameters. |
| [S3DirectoryDeleteParams](-s3-directory-delete-params/index.md) | [jvm]<br>interface [S3DirectoryDeleteParams](-s3-directory-delete-params/index.md) : [S3ObjectRequestParams](../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-request-params/index.md)<br>Directory deletion request parameters. |
