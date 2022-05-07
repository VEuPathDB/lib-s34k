package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.objects.ObjectList
import org.veupathdb.lib.s3.s34k.params.RegionRequestParams

interface ObjectListParams : RegionRequestParams {

  /**
   * Callback that will be executed on successful completion of the S3
   * operation.
   *
   * The callback will be passed an [ObjectList] value.
   */
  var callback: ((objects: ObjectList) -> Unit)?
}