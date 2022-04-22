package org.veupathdb.lib.s3.s34k.requests.`object`

import org.veupathdb.lib.s3.s34k.response.`object`.S3StreamObject

/**
 * Object get request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3ObjectGetParams : S3ObjectRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed an [S3StreamObject] request wrapping a stream
   * over the contents of the target object.
   */
  var callback: ((S3StreamObject) -> Unit)?
}