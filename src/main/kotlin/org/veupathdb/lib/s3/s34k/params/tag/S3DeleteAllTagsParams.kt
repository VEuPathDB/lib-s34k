package org.veupathdb.lib.s3.s34k.params.tag

import org.veupathdb.lib.s3.s34k.params.S3RegionRequestParams

/**
 * Parameters for a 'delete all tags' operation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.3.0
 */
interface S3DeleteAllTagsParams : S3RegionRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   */
  var callback: (() -> Unit)?
}