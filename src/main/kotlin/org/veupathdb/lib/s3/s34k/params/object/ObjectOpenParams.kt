package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.StreamObject
import org.veupathdb.lib.s3.s34k.params.RegionRequestParams

/**
 * Object open request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.3.0
 */
interface ObjectOpenParams : RegionRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed an [StreamObject] request wrapping a stream
   * over the contents of the target object if that object exists. If the target
   * object does not exist, this callback will be passed a `null` value.
   */
  var callback: ((StreamObject?) -> Unit)?
}