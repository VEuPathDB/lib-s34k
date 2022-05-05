package org.veupathdb.lib.s3.s34k.fields

/**
 * Mutable map of headers being sent as part of an S3 operation request.
 *
 * Implementations of this interface should be thread safe.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
interface MutableHeaders : Headers {

  /**
   * Adds the given header and values to this header map.
   *
   * @param header Header key.
   *
   * @param values Header values.
   */
  fun addHeader(header: String, vararg values: String)

  /**
   * Adds the given header and values to this header map.
   *
   * @param header Header key.
   *
   * @param values Header values.
   */
  fun addHeader(header: String, values: Iterable<String>)

  /**
   * Adds the headers in the given map to this header map.
   *
   * If there exists any key in the input [headers] map that already exists in
   * this header map, the values in the supplied iterator will be appended to
   * the header values already in this map.
   *
   * @param headers Map of header keys to header values that will be appended to
   * this header map.
   */
  fun addHeaders(headers: Map<String, Iterable<String>>)

  /**
   * Adds the headers in the given set of pairs to this header map.
   *
   * If there exists any key in the input [headers] pairs that already exists
   * in this header map, the value in the supplied pair will be appended to the
   * header values already in this map.
   *
   * @param headers Collection of pairs of header keys to values that will be
   * appended to this header map.
   */
  fun addHeaders(vararg headers: Pair<String, String>)


  /**
   * Returns an immutable copy of this [MutableHeaders] instance.
   *
   * @return An immutable [Headers] instance copy of this object.
   */
  fun toImmutable(): Headers
}