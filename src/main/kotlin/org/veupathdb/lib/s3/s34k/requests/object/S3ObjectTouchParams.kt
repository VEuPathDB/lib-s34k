package org.veupathdb.lib.s3.s34k.requests.`object`

import org.veupathdb.lib.s3.s34k.response.`object`.S3Object

// TODO: Document me
interface S3ObjectTouchParams : S3ObjectWriteParams {

  // TODO: Document me
  var contentType: String?

  // TODO: Document me
  var callback: ((S3Object) -> Unit)?
}