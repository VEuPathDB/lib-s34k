package org.veupathdb.lib.s3.s34k.requests.`object`

import org.veupathdb.lib.s3.s34k.S3Object

// TODO: Document me
interface S3ObjectTouchParams : S3ObjectWriteParams {

  // TODO: Document me
  var contentType: String?

  // TODO: Document me
  var callback: ((handle: S3Object) -> Unit)?
}