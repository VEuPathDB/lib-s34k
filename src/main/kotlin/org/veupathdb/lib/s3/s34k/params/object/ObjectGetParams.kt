package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.S3Object
import org.veupathdb.lib.s3.s34k.params.RegionRequestParams

/**
 * Object get operation parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.3.0
 */
interface ObjectGetParams : RegionRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed a handle on the target object if the target
   * object exists, otherwise it will be passed a `null` value.
   */
  var callback: ((handle: S3Object?) -> Unit)?
}