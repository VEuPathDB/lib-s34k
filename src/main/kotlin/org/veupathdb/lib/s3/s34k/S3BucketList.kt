package org.veupathdb.lib.s3.s34k

import java.util.stream.Stream

// TODO: Document me
interface S3BucketList : Iterable<S3Bucket> {

  // TODO: Document me
  val size: Int

  // TODO: Document me
  val isEmpty: Boolean

  // TODO: Document me
  val isNotEmpty: Boolean

  // TODO: Document me
  fun toMap(): Map<S3BucketName, S3Bucket>

  // TODO: Document me
  fun toList(): List<S3Bucket>

  // TODO: Document me
  fun stream(): Stream<S3Bucket>

  // TODO: Document me
  operator fun get(name: S3BucketName): S3Bucket?

  // TODO: Document me
  operator fun get(index: Int): S3Bucket
}