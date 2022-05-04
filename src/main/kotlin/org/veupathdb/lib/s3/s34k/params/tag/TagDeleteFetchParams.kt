package org.veupathdb.lib.s3.s34k.params.tag

import org.veupathdb.lib.s3.s34k.params.S3RequestParams

/**
 * Parameters for the tag fetch phase of the targeted tag delete operation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.3.0
 */
interface TagDeleteFetchParams : S3RequestParams {

  /**
   * Optional callback that will be executed on completion of the tag fetch
   * phase of the targeted tag delete operation.
   *
   * This callback will not be executed if the operation does not reach the tag
   * fetch phase.
   *
   * This could happen if there are no tags specified in the target tag set.
   */
  var callback: (() -> Unit)?
}