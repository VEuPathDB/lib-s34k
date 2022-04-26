package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.fields.BucketName


/**
 * Base type for exceptions resulting from single bucket operations.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
abstract class AbstractBucketOperationException : AbstractResponseException {

  /**
   * Name of the bucket on which the failed operation was taking place.
   */
  val bucket: BucketName

  constructor(
    bucket: BucketName,
    msg:    String,
    cause:  Throwable
  ) : super(msg, cause) {
    this.bucket = bucket
  }

  constructor(bucket: BucketName, msg: String) : super(msg) {
    this.bucket = bucket
  }
}
