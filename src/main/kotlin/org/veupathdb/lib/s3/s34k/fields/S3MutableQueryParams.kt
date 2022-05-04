package org.veupathdb.lib.s3.s34k.fields

/**
 * Mutable map of query params being sent as part of an S3 operation request.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
interface S3MutableQueryParams : S3QueryParams {

  /**
   * Adds the given header and values to this query param map.
   *
   * @param param Query parameter.
   *
   * @param values Values.
   */
  fun addQueryParam(param: String, vararg values: String)

  /**
   * Adds the given header and values to this query param map.
   *
   * @param param Query parameter.
   *
   * @param values Values.
   */
  fun addQueryParam(param: String, values: Iterable<String>)

  /**
   * Adds the query params in the given map to this query param map.
   *
   * If there exists any key in the input [params] map that already exists in
   * this query parameter map, the values in the supplied iterator will be
   * appended to the param values already in this map.
   *
   * @param params Map of query parameters to values that will be appended to
   * this map.
   */
  fun addQueryParams(params: Map<String, Iterable<String>>)

  /**
   * Adds the query params in the given set of pairs to this query param map.
   *
   * If there exists any key in the input [params] pairs that already exists
   * in this map, the value in the supplied pair will be appended to the values
   * already in this map.
   *
   * @param params Collection of pairs of query parameters to values that will
   * be appended to this header map.
   */
  fun addQueryParams(vararg params: Pair<String, String>)

  /**
   * Returns an immutable copy of this [S3MutableQueryParams] instance.
   *
   * @return An immutable [S3QueryParams] instance copy of this object.
   */
  fun toImmutable(): S3QueryParams
}