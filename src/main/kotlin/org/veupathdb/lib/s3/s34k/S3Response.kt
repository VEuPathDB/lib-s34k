package org.veupathdb.lib.s3.s34k

import org.veupathdb.lib.s3.s34k.fields.Headers

// TODO: Document me
interface S3Response {

  // TODO: Document me
  val bucket: Bucket

  // TODO: Document me
  val region: String

  // TODO: Document me
  val headers: Headers
}