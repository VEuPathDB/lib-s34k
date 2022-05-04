package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigError

interface S3TagExistsParams : S3RegionRequestParams {

  /**
   * **Required**: Target tag whose existence will be tested for.
   *
   * This value must be set or an [InvalidRequestConfigError] will be thrown
   * when the request is attempted.
   */
  var tag: String?

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed a boolean flag indicating whether the target
   * tag was located on the tag container.
   */
  var callback: ((exists: Boolean) -> Unit)?
}