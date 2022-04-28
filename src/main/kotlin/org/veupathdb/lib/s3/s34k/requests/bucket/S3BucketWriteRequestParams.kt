package org.veupathdb.lib.s3.s34k.requests.bucket

import org.veupathdb.lib.s3.s34k.fields.tags.S3MutableTagMap

/**
 * S3 Bucket Write Request
 *
 * Base type for S3 operations that create or otherwise write to a bucket.
 *
 * This type includes optional tags that may be attached to the bucket during
 * the operation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3BucketWriteRequestParams : S3BucketRequestParams {

  /**
   * Tags that may be attached to the target bucket during the execution of
   * this S3 operation.
   */
  val tags: S3MutableTagMap
}