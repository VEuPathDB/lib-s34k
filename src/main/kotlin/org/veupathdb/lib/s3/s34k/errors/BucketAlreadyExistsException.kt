package org.veupathdb.lib.s3.s34k.errors


class BucketAlreadyExistsException : BucketOperationException {

  constructor(bucket: String, cause: Throwable) : super(
    bucket,
    "Bucket $bucket already exists.",
    cause
  )

  constructor(bucket: String) : super(bucket, "Bucket $bucket does not exist.")
}
