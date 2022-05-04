package org.veupathdb.lib.s3.s34k

import java.util.stream.Stream

// TODO: Document me
interface BucketList : Iterable<Bucket> {

  // TODO: Document me
  val size: Int

  // TODO: Document me
  val isEmpty: Boolean

  // TODO: Document me
  val isNotEmpty: Boolean

  // TODO: Document me
  fun toMap(): Map<BucketName, Bucket>

  // TODO: Document me
  fun toList(): List<Bucket>

  // TODO: Document me
  fun stream(): Stream<Bucket>

  // TODO: Document me
  operator fun get(name: BucketName): Bucket?

  // TODO: Document me
  operator fun get(index: Int): Bucket
}