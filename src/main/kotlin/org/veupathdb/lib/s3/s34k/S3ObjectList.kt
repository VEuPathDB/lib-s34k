package org.veupathdb.lib.s3.s34k

import org.veupathdb.lib.s3.s34k.response.`object`.S3Object
import java.util.stream.Stream

interface S3ObjectList : Iterable<S3Object> {

  val size: Int

  val isEmpty: Boolean

  val isNotEmpty: Boolean

  operator fun get(path: String): S3Object?

  operator fun get(index: Int): S3Object

  fun toMap(): Map<String, S3Object>

  fun toList(): List<S3Object>

  fun stream(): Stream<S3Object>
}