package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.params.bucket.BucketName

class BucketAlreadyOwnedByYouException(bucket: BucketName, cause: Throwable)
  : BucketAlreadyExistsException(bucket, "You already own bucket $bucket", cause)