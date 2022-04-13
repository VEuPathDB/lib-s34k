package org.veupathdb.lib.s3.s34k

import java.io.InputStream

// TODO: Document me
interface S3StreamObject : S3Object {
  // TODO: Document me
  val stream: InputStream
}