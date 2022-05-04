package org.veupathdb.lib.s3.s34k.requests.`object`

import org.veupathdb.lib.s3.s34k.S3StreamObject

/**
 * Object open request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.3.0
 */
interface S3ObjectOpenParams : S3ObjectRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed an [S3StreamObject] request wrapping a stream
   * over the contents of the target object if that object exists. If the target
   * object does not exist, this callback will be passed a `null` value.
   */
  var callback: ((S3StreamObject?) -> Unit)?
}