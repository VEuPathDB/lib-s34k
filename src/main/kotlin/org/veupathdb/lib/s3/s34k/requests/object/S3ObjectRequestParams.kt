package org.veupathdb.lib.s3.s34k.requests.`object`

import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException
import org.veupathdb.lib.s3.s34k.requests.S3RegionRequestParams

/**
 * Base parameters for operations relating to a target S3 object.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3ObjectRequestParams : S3RegionRequestParams {
  /**
   * *Required* path to the object target of this request.
   *
   * This value must be set or an [InvalidRequestConfigException] will be thrown
   * when the request is attempted.
   */
  var path: String?
}