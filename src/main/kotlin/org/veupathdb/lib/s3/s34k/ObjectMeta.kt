package org.veupathdb.lib.s3.s34k

import java.time.OffsetDateTime

// TODO: Document me
interface ObjectMeta : ObjectResponse {

  // TODO: Document me
  val eTag: String?

  // TODO: Document me
  val size: Long

  // TODO: Document me
  val lastModified: OffsetDateTime

  // TODO: Document me
  val contentType: String

  // TODO: Document me
  val retentionMode: RetentionMode?

  // TODO: Document me
  val legalHold: LegalHold?
}