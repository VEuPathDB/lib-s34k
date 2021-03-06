package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.objects.ObjectMeta
import org.veupathdb.lib.s3.s34k.params.RegionRequestParams

/**
 * Parameters for an S3 object stat operation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.3.0
 */
interface ObjectStatParams : RegionRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed the metadata returned for the target object.
   */
  var callback: ((ObjectMeta?) -> Unit)?
}