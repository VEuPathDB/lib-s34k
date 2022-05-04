package org.veupathdb.lib.s3.s34k.params.tag

import org.veupathdb.lib.s3.s34k.params.S3RegionRequestParams

interface S3TagExistsParams : S3RegionRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed a boolean flag indicating whether the target
   * tag was located on the tag container.
   */
  var callback: ((exists: Boolean) -> Unit)?
}