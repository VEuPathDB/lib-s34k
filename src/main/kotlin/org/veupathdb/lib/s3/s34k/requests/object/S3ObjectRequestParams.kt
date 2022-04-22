package org.veupathdb.lib.s3.s34k.requests.`object`

import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException
import org.veupathdb.lib.s3.s34k.requests.S3RegionRequestParams

// TODO: Document me
interface S3ObjectRequestParams : S3RegionRequestParams {
  /**
   * *Required* path to the object target of this request.
   *
   * This value must be set or an [InvalidRequestConfigException] will be thrown
   * when the request is attempted.
   */
  var path: String?
}