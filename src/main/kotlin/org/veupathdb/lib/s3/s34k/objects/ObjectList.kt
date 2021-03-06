package org.veupathdb.lib.s3.s34k.objects

import java.util.stream.Stream

// TODO: Document me
interface ObjectList : Iterable<S3Object> {

  // TODO: Document me
  val size: Int

  // TODO: Document me
  val isEmpty: Boolean

  // TODO: Document me
  val isNotEmpty: Boolean

  // TODO: Document me
  fun toMap(): Map<String, S3Object>

  // TODO: Document me
  fun toList(): List<S3Object>

  // TODO: Document me
  fun stream(): Stream<S3Object>

  // TODO: Document me
  operator fun get(path: String): S3Object?

  // TODO: Document me
  operator fun get(index: Int): S3Object
}