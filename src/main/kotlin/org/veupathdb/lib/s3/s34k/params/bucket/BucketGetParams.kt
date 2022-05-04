package org.veupathdb.lib.s3.s34k.params.bucket

import org.veupathdb.lib.s3.s34k.Bucket
import org.veupathdb.lib.s3.s34k.params.RegionRequestParams

/**
 * Fetch bucket request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface BucketGetParams : RegionRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed a handle on the bucket retrieved from the S3
   * store.
   */
  var callback: ((bucket: Bucket) -> Unit)?
}