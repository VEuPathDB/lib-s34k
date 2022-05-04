package org.veupathdb.lib.s3.s34k.params.tag

import org.veupathdb.lib.s3.s34k.params.RegionRequestParams

/**
 * Parameters for a 'delete all tags' operation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.3.0
 */
interface DeleteAllTagsParams : RegionRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   */
  var callback: (() -> Unit)?
}