package org.veupathdb.lib.s3.s34k

import java.time.OffsetDateTime

// TODO: Document me
interface S3ObjectMeta : S3ObjectResponse {

  // TODO: Document me
  val eTag: String?

  // TODO: Document me
  val size: Long

  // TODO: Document me
  val lastModified: OffsetDateTime

  // TODO: Document me
  val contentType: String

  // TODO: Document me
  val retentionMode: S3RetentionMode?

  // TODO: Document me
  val legalHold: S3LegalHold?
}