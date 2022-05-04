package org.veupathdb.lib.s3.s34k.params.bucket

import org.veupathdb.lib.s3.s34k.S3BucketList
import org.veupathdb.lib.s3.s34k.params.S3RequestParams

/**
 * Fetch bucket list request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface BucketListParams : S3RequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed the list of buckets retrieved from the S3
   * store.
   */
  var callback: ((buckets: S3BucketList) -> Unit)?
}