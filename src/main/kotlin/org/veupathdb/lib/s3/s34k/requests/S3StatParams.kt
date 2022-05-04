package org.veupathdb.lib.s3.s34k.requests

import org.veupathdb.lib.s3.s34k.S3ObjectMeta
import org.veupathdb.lib.s3.s34k.params.S3RegionRequestParams

// TODO: Document me
interface S3StatParams : S3RegionRequestParams {

  // TODO: Document me
  var callback: ((S3ObjectMeta) -> Unit)?

}