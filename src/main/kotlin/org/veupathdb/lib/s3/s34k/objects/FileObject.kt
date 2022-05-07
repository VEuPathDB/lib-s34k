package org.veupathdb.lib.s3.s34k.objects

import java.io.File

// TODO: Document me
interface FileObject : S3Object {

  // TODO: Document me
  val localFile: File
}