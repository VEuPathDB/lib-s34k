package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.params.bucket.BucketName


class BucketAlreadyExistsException : BucketOperationException {

  constructor(bucket: BucketName, cause: Throwable) : super(
    bucket,
    "Bucket $bucket already exists.",
    cause
  )

  constructor(bucket: BucketName) : super(bucket, "Bucket $bucket does not exist.")
}
