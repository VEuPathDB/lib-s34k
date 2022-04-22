package org.veupathdb.lib.s3.s34k.requests.bucket

import org.veupathdb.lib.s3.s34k.fields.tags.S3MutableTagMap

// TODO: Document me
interface S3BucketWriteRequestParams : S3BucketRequestParams {

  // TODO: Document me
  val tags: S3MutableTagMap
}