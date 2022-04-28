package org.veupathdb.lib.s3.s34k.requests.client

import org.veupathdb.lib.s3.s34k.requests.S3RequestParams
import org.veupathdb.lib.s3.s34k.response.S3BucketList

/**
 * Fetch bucket list request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3BucketListParams : S3RequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed the list of buckets retrieved from the S3
   * store.
   */
  var callback: ((buckets: S3BucketList) -> Unit)?
}