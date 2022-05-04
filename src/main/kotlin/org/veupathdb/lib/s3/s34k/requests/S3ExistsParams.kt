package org.veupathdb.lib.s3.s34k.requests

import org.veupathdb.lib.s3.s34k.params.S3RegionRequestParams

/**
 * Blank existence check request parameters.
 *
 * This type may be used to assemble the request then convert to a specific
 * target, bucket or object.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3ExistsParams : S3RegionRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed a boolean flag indicating whether the target
   * bucket or object exists in the S3 store.
   */
  var callback: ((exists: Boolean) -> Unit)?
}