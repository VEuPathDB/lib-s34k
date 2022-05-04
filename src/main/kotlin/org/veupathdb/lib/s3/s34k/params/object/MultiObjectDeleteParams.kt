package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.fields.S3MutablePathSet
import org.veupathdb.lib.s3.s34k.params.RegionRequestParams

/**
 * Multi-Object delete request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface MultiObjectDeleteParams : RegionRequestParams {

  /**
   * Collection of paths to the target objects that will be deleted.
   */
  val paths: S3MutablePathSet

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   */
  val callback: (() -> Unit)?
}