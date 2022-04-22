package org.veupathdb.lib.s3.s34k.requests.`object`

import org.veupathdb.lib.s3.s34k.S3ObjectList
import org.veupathdb.lib.s3.s34k.requests.S3RegionRequestParams

interface S3ObjectListParams : S3RegionRequestParams {

  /**
   * Callback that will be executed on successful completion of the S3
   * operation.
   *
   * The callback will be passed an [S3ObjectList] value.
   */
  var callback: ((S3ObjectList) -> Unit)?
}