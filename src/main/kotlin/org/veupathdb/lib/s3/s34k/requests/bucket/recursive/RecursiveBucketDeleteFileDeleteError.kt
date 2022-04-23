package org.veupathdb.lib.s3.s34k.requests.bucket.recursive

import org.veupathdb.lib.s3.s34k.requests.`object`.ObjectDeleteError

class RecursiveBucketDeleteFileDeleteError(
  req: S3ClientRecursiveBucketDeleteParams,
  val errs: List<ObjectDeleteError>,
  message: String,
  cause: Throwable
) : RecursiveBucketDeleteError(req, message, cause)