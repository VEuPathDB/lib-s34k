package org.veupathdb.lib.s3.s34k.params.`object`.directory

import org.veupathdb.lib.s3.s34k.params.`object`.ObjectDeleteError

class DirectoryObjectDeleteError : DirectoryDeleteError {

  val errors: List<ObjectDeleteError>

  constructor(bucketName: String, path: String, errors: List<ObjectDeleteError>) : super(bucketName, path, makeErrMsg(bucketName, path)) {
    this.errors = errors
  }

  constructor(bucketName: String, path: String, errors: List<ObjectDeleteError>, cause: Throwable) : super(bucketName, path, makeErrMsg(bucketName, path), cause) {
    this.errors = errors
  }

  constructor(bucketName: String, path: String, errors: List<ObjectDeleteError>, msg: String) : super(bucketName, path, msg) {
    this.errors = errors
  }

  constructor(bucketName: String, path: String, errors: List<ObjectDeleteError>, msg: String, cause: Throwable) : super(bucketName, path, msg, cause) {
    this.errors = errors
  }
}

@Suppress("NOTHING_TO_INLINE")
private inline fun makeErrMsg(bucketName: String, path: String) =
  "Could not delete non-empty directory '$path' from bucket '$bucketName' due to one or more object deletion failures."