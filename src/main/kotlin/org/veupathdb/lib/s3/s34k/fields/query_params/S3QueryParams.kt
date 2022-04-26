package org.veupathdb.lib.s3.s34k.fields.query_params

import java.util.stream.Stream

interface S3QueryParams : Iterable<Pair<String, List<String>>> {

  /**
   * Number of tag pairs currently in this [TagMap]
   */
  val size: Int

  /**
   * Whether this [TagMap] is empty.
   */
  val isEmpty: Boolean

  /**
   * Whether this [TagMap] is not empty.
   */
  val isNotEmpty: Boolean

  fun toMap(): Map<String, List<String>>

  fun stream(): Stream<Pair<String, List<String>>>

  operator fun get(queryParam: String): List<String>?
}