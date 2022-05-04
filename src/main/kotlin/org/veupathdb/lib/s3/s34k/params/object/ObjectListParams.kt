package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.S3ObjectList
import org.veupathdb.lib.s3.s34k.params.S3RegionRequestParams

interface ObjectListParams : S3RegionRequestParams {

  /**
   * Callback that will be executed on successful completion of the S3
   * operation.
   *
   * The callback will be passed an [S3ObjectList] value.
   */
  var callback: ((objects: S3ObjectList) -> Unit)?
}