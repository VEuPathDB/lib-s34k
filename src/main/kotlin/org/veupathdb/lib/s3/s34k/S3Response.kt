package org.veupathdb.lib.s3.s34k

import org.veupathdb.lib.s3.s34k.fields.headers.S3Headers

// TODO: Document me
interface S3Response {

  // TODO: Document me
  val bucket: S3Bucket

  // TODO: Document me
  val region: String?

  // TODO: Document me
  val headers: S3Headers
}