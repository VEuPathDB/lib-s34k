package org.veupathdb.lib.s3.s34k.requests

import org.veupathdb.lib.s3.s34k.requests.`object`.S3ObjectStatParams
import org.veupathdb.lib.s3.s34k.response.`object`.S3ObjectMeta

// TODO: Document me
interface S3BlankStatParams : S3RegionRequestParams {

  // TODO: Document me
  var callback: ((S3ObjectMeta) -> Unit)?

  // TODO: Document me
  fun toObjectStatParams(path: String): S3ObjectStatParams
}