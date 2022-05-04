package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.S3ObjectMeta

// TODO: Document me
interface S3StatParams : S3RegionRequestParams {

  // TODO: Document me
  var callback: ((S3ObjectMeta) -> Unit)?

}