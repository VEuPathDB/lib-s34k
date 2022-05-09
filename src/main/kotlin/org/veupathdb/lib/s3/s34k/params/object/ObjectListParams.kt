package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.objects.ObjectList
import org.veupathdb.lib.s3.s34k.objects.ObjectContainer
import org.veupathdb.lib.s3.s34k.params.RegionRequestParams

interface ObjectListParams : RegionRequestParams {

  /**
   * Filtering prefix for the paths to return.
   *
   * If set to `null` or a blank string, this operation is the same as
   * [ObjectContainer.listAll].
   */
  var prefix: String?

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed a list of objects retrieved from the store.
   */
  var callback: ((ObjectList) -> Unit)?
}