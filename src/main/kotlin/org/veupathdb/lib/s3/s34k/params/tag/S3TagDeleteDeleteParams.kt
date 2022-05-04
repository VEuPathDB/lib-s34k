package org.veupathdb.lib.s3.s34k.params.tag

import org.veupathdb.lib.s3.s34k.params.S3RequestParams

/**
 * Parameters for the tag delete phase of the targeted tag delete operation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.3.0
 */
interface S3TagDeleteDeleteParams : S3RequestParams {

  /**
   * Optional callback that will be executed on completion of the delete phase
   * of the targeted tag delete operation.
   *
   * This callback will not be executed if the delete phase of the operation is
   * not reached.
   *
   * This could happen if the target bucket/object presently has no tags to
   * delete.
   */
  var callback: (() -> Unit)?
}