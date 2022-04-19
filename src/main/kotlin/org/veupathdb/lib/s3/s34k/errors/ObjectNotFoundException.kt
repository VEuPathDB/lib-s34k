package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.params.bucket.BucketName

class ObjectNotFoundException : S34kException {

  val bucket: BucketName

  val path: String

  constructor(bucket: BucketName, path: String, cause: Throwable) :
    super("Object $path not found in bucket $bucket", cause) {
    this.bucket = bucket
    this.path = path
  }

  constructor(bucket: BucketName, path: String) :
    super("Object $path not found in bucket $bucket") {
    this.bucket = bucket
    this.path = path
  }
}
