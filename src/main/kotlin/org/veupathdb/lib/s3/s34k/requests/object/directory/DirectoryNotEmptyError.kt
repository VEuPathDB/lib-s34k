package org.veupathdb.lib.s3.s34k.requests.`object`.directory

/**
 * Exception thrown when attempting to delete a directory that is not empty
 * without using the delete operation's `recursive` flag.
 */
class DirectoryNotEmptyError : DirectoryDeleteError {

  constructor(bucket: String, path: String)
    : super(bucket, path, err(bucket, path))

  constructor(bucket: String, path: String, message: String)
    : super(bucket, path, message)

  constructor(bucket: String, path: String, cause: Throwable)
    : super(bucket, path, err(bucket, path), cause)

  constructor(bucket: String, path: String, message: String, cause: Throwable)
    : super(bucket, path, message, cause)
}

@Suppress("NOTHING_TO_INLINE")
private inline fun err(bucket: String, path: String) =
  "Could not delete non-empty directory '$path' from bucket '$bucket', `recursive` was not specified."