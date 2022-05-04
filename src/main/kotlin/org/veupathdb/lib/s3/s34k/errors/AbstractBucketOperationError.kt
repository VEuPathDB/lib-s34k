package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.BucketName


/**
 * Base type for exceptions resulting from single bucket operations.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
abstract class AbstractBucketOperationError : AbstractResponseError {

  /**
   * Name of the bucket on which the failed operation was taking place.
   */
  val bucket: BucketName

  constructor(bucket: BucketName, message: String) : super(message) {
    this.bucket = bucket
  }

  constructor(bucket: BucketName, cause: Throwable): super(cause) {
    this.bucket = bucket
  }

  constructor(bucket: BucketName, message: String, cause: Throwable) : super(message, cause) {
    this.bucket = bucket
  }
}
