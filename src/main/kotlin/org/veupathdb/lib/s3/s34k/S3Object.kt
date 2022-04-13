package org.veupathdb.lib.s3.s34k

// TODO: Document me
interface S3Object {

  // TODO: Document me
  val bucket: S3Bucket

  // TODO: Document me
  val headers: Map<String, List<String>>

  // TODO: Document me
  val path: String

  // TODO: Document me
  fun getTags(): S3TagSet

  // TODO: Document me
  fun addTag(key: String, value: String)

  // TODO: Document me
  fun addTags(tags: Map<String, String>)

  // TODO: Document me
  fun addTags(tags: Collection<S3Tag>)

  // TODO: Document me
  fun addTags(vararg tags: S3Tag)
}