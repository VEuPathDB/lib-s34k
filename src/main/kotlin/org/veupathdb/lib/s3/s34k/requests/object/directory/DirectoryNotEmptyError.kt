package org.veupathdb.lib.s3.s34k.requests.`object`.directory

import org.veupathdb.lib.s3.s34k.errors.S34kException

/**
 * Exception thrown when attempting to delete a directory that is not empty
 * without using the delete operation's `recursive` flag.
 */
class DirectoryNotEmptyError : S34kException {

  /**
   * Name of the bucket containing the directory on which the delete operation
   * was attempted.
   */
  val bucketName: String

  /**
   * Path to the directory that could not be deleted.
   */
  val path: String

  constructor(bucketName: String, path: String) : super(makeErrMsg(bucketName, path)) {
    this.bucketName = bucketName
    this.path       = path
  }

  constructor(bucketName: String, path: String, cause: Throwable) : super(makeErrMsg(bucketName, path), cause) {
    this.bucketName = bucketName
    this.path       = path
  }

  constructor(bucketName: String, path: String, msg: String) : super(msg) {
    this.bucketName = bucketName
    this.path       = path
  }

  constructor(bucketName: String, path: String, msg: String, cause: Throwable) : super(msg, cause) {
    this.bucketName = bucketName
    this.path       = path
  }
}

@Suppress("NOTHING_TO_INLINE")
private inline fun makeErrMsg(bucketName: String, path: String) =
  "Could not delete non-empty directory '$path' from bucket '$bucketName', `recursive` was not specified."