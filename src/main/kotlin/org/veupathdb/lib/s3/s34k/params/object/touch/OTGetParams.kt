package org.veupathdb.lib.s3.s34k.params.`object`.touch

import org.veupathdb.lib.s3.s34k.params.S3RequestParams

/**
 * Object Get Operation Put Phase Parameters
 *
 * Parameters specific to the 'get object' phase of the object touch complex
 * operation.
 *
 * If the get phase is skipped on the object touch operation due to an object
 * already existing at the target path and the [ObjectTouchParams.overwrite]
 * flag being set to `true` then these parameters will be ignored.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.3.0
 */
interface OTGetParams : S3RequestParams {

  /**
   * Optional callback that will be executed on successful completion of the
   * object get phase of the touch operation.
   *
   * If the object get phase is never reached or is skipped due to the
   * [ObjectTouchParams.overwrite] flag being set to `true` this callback will
   * not be executed.
   */
  var callback: (() -> Unit)?
}