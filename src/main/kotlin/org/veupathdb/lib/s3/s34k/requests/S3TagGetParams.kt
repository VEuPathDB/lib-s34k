package org.veupathdb.lib.s3.s34k.requests

import org.veupathdb.lib.s3.s34k.fields.tags.S3TagMap

interface S3TagGetParams : S3RegionRequestParams {

  /**
   * Callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed an [S3TagMap] containing all the tags fetched
   * from the target.
   */
  var callback: ((S3TagMap) -> Unit)?
}