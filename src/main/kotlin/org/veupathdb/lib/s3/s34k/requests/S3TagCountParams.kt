package org.veupathdb.lib.s3.s34k.requests

interface S3TagCountParams : S3RegionRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed the count of tags attached to the call target.
   */
  var callback: ((count: Int) -> Unit)?
}