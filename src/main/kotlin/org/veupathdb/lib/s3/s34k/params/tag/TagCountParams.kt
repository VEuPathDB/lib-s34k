package org.veupathdb.lib.s3.s34k.params.tag

import org.veupathdb.lib.s3.s34k.params.RegionRequestParams

interface TagCountParams : RegionRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed the count of tags attached to the call target.
   */
  var callback: ((count: Int) -> Unit)?
}