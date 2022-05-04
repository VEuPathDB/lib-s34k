package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.S3Object

// TODO: Document me
interface ObjectTouchParams : ObjectWriteParams {

  // TODO: Document me
  var contentType: String?

  // TODO: Document me
  var callback: ((handle: S3Object) -> Unit)?
}