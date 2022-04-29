package org.veupathdb.lib.s3.s34k.requests.`object`.directory

/**
 * Exception thrown when attempting to delete a directory that is not empty
 * without using the delete operation's `recursive` flag.
 */
class DirectoryNotEmptyError : DirectoryDeleteError {

  constructor(bucketName: String, path: String) : super(bucketName, path, makeErrMsg(bucketName, path))

  constructor(bucketName: String, path: String, cause: Throwable) : super(bucketName, path, makeErrMsg(bucketName, path), cause)

  constructor(bucketName: String, path: String, msg: String) : super(bucketName, path, msg)

  constructor(bucketName: String, path: String, msg: String, cause: Throwable) : super(bucketName, path, msg, cause)
}

@Suppress("NOTHING_TO_INLINE")
private inline fun makeErrMsg(bucketName: String, path: String) =
  "Could not delete non-empty directory '$path' from bucket '$bucketName', `recursive` was not specified."