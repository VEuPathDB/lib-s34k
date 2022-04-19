package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.params.bucket.BucketName

open class BucketAlreadyExistsException : BucketOperationException {
  constructor(bucket: BucketName, cause: Throwable)
    : super(bucket, "Bucket $bucket already exists.", cause)

  constructor(bucket: BucketName, msg: String, cause: Throwable)
    : super(bucket, msg, cause)
}
