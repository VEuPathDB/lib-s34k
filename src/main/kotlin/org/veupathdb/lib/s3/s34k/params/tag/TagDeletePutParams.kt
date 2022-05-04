package org.veupathdb.lib.s3.s34k.params.tag

import org.veupathdb.lib.s3.s34k.params.S3RequestParams

/**
 * Parameters for the tag put phase of the targeted tag delete operation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.3.0
 */
interface TagDeletePutParams : S3RequestParams {

  /**
   * Optional callback that will be executed on completion of the tag put phase
   * of the targeted tag delete operation.
   *
   * This callback will not be executed if the tag put phase of the operation is
   * never reached.
   *
   * This could happen if there are no tags presently on the target
   * bucket/object or if there are no remaining tags to re-attach to the target
   * bucket/object.
   */
  var callback: (() -> Unit)?
}