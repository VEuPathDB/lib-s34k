package org.veupathdb.lib.s3.s34k.fields

import java.util.stream.Stream

/**
 * Map of query parameters being sent as part of an S3 operation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
interface S3QueryParams : Iterable<Pair<String, List<String>>> {

  /**
   * Number of header entries in this [S3QueryParams] map.
   */
  val size: Int

  /**
   * Whether this query param map is empty.
   */
  val isEmpty: Boolean

  /**
   * Converts this [S3QueryParams] instance into a standard map of headers to
   * value lists.
   *
   * @return The converted map.
   */
  val isNotEmpty: Boolean

  fun toMap(): Map<String, List<String>>

  /**
   * Returns a stream over the contents of this [S3QueryParams] map.
   *
   * @return Stream over the contents of this header map.
   */
  fun stream(): Stream<Pair<String, List<String>>>

  /**
   * Returns a list of header values stored under the given header key.
   *
   * If no such key exists, `null` will be returned.
   *
   * @return Either a list of header values for the given header key, or `null`
   * if no such entry exists in this header map.
   */
  operator fun get(queryParam: String): List<String>?
}