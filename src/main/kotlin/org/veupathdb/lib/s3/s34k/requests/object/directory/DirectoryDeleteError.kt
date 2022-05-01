package org.veupathdb.lib.s3.s34k.requests.`object`.directory

import org.veupathdb.lib.s3.s34k.errors.S34KError

open class DirectoryDeleteError : S34KError {

  /**
   * Name of the bucket containing the directory on which the delete operation
   * was attempted.
   */
  val bucketName: String

  /**
   * Path to the directory that could not be deleted.
   */
  val path: String

  constructor(bucketName: String, path: String, msg: String) : super(msg) {
    this.bucketName = bucketName
    this.path       = path
  }

  constructor(bucketName: String, path: String, msg: String, cause: Throwable) : super(msg, cause) {
    this.bucketName = bucketName
    this.path       = path
  }

}