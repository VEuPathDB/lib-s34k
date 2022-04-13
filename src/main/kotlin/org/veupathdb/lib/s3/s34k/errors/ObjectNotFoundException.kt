package org.veupathdb.lib.s3.s34k.errors

class ObjectNotFoundException : S34kException {

  val bucket: String

  val path: String

  constructor(bucket: String, path: String, cause: Throwable) :
    super("Object $path not found in bucket $bucket", cause) {
    this.bucket = bucket
    this.path = path
  }

  constructor(bucket: String, path: String) :
    super("Object $path not found in bucket $bucket") {
    this.bucket = bucket
    this.path = path
  }
}
