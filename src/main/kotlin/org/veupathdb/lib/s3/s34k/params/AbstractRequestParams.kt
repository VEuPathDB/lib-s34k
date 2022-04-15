package org.veupathdb.lib.s3.s34k.params

import org.slf4j.LoggerFactory

/**
 * Request Params
 *
 * Base type for S3 operation param sets.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
abstract class AbstractRequestParams {

  private val Log = LoggerFactory.getLogger(AbstractRequestParams::class.java)

  /**
   * Additional headers that will be sent with the S3 operation.
   */
  val headers: Map<String, Array<String>> = HashMap()

  /**
   * Additional query parameters that will be sent with the S3 operation.
   */
  val queryParams: Map<String, Array<String>> = HashMap()

  /**
   * Merges the additional [headers] provided into the existing
   * [AbstractRequestParams.headers] map.
   *
   * If the [AbstractRequestParams.headers] map already contains one or more keys
   * present in the input [headers] map, the value at that key will be appended
   * to the array of headers at that key in [AbstractRequestParams.headers].
   *
   * Example:
   * ```
   * input := {
   *   foo  : "bar",
   *   fizz : "buzz"
   * }
   *
   * existing := {
   *   foo : [ faz ]
   * }
   *
   * result := {
   *   foo  : [ "faz", "bar" ]
   *   fizz : [ "buzz" ]
   * }
   * ```
   *
   * @param headers Map of headers to merge into the existing
   * [AbstractRequestParams.headers] map.
   */
  fun addHeaders(headers: Map<String, String>) {
    Log.trace("addHeaders(headers = {})", headers)
    headers.forEach { (t, u) -> mergeArrays(this.headers, t, arrayOf(u)) }
  }

  /**
   * Merges the additional headers provided into the existing [headers] map.
   *
   * If the [headers] map already contains the given key, the [values] in the
   * given [Collection] will be merged into that array.
   *
   * Merge Example:
   * ```
   * inputKey    := "foo"
   * inputValues := [ "fizz", "buzz" ]
   *
   * existing := {
   *   foo : [ "bar" ]
   * }
   *
   * result := {
   *   foo : [ "bar", "fizz", "buzz" ]
   * }
   * ```
   *
   * @param key Key under which the new headers will be added.
   *
   * @param values Values to append to the [headers] map.
   */
  @Suppress("UNCHECKED_CAST")
  fun addHeaders(key: String, values: Collection<String>) {
    Log.trace("addHeaders(key = {}, values = {})", key, values)
    mergeArrays(queryParams, key, values.toTypedArray())
  }

  /**
   * Merges the additional headers provided into the existing [headers] map.
   *
   * If the [headers] map already contains the given key, the given [values]
   * will be merged into that array.
   *
   * Merge Example:
   * ```
   * inputKey    := "foo"
   * inputValues := [ "fizz", "buzz" ]
   *
   * existing := {
   *   foo : [ "bar" ]
   * }
   *
   * result := {
   *   foo : [ "bar", "fizz", "buzz" ]
   * }
   * ```
   *
   * @param key Key under which the new headers will be added.
   *
   * @param values Values to append to the [headers] map.
   */
  @Suppress("UNCHECKED_CAST")
  fun addHeaders(key: String, vararg values: String) {
    Log.trace("addHeaders(key = {}, values = {})", key, values)
    mergeArrays(queryParams, key, (values as Array<String>))
  }

  /**
   * Overwrites the header values in the [headers] map with the given array of
   * [values].
   *
   * Overwrite Example:
   * ```
   * inputKey    := "foo"
   * inputValues := [ "fizz", "buzz" ]
   *
   * existing := {
   *   foo : [ "bar" ]
   * }
   *
   * result := {
   *   foo : [ "fizz", "buzz" ]
   * }
   * ```
   *
   * @param key Key under which the new headers will be set.
   *
   * @param values Values to set in the [headers] map.
   */
  @Suppress("UNCHECKED_CAST")
  fun setHeaders(key: String, vararg values: String) {
    Log.trace("setHeaders(key = {}, values = {})", key, values)
    (headers as MutableMap)[key] = (values as Array<String>)
  }

  /**
   * Merges the additional [queryParams] provided into the existing
   * [AbstractRequestParams.queryParams] map.
   *
   * If the [AbstractRequestParams.queryParams] map already contains one or more keys
   * present in the input [queryParams] map, the value at that key will be
   * appended to the array of queryParams at that key in
   * [AbstractRequestParams.queryParams].
   *
   * Example:
   * ```
   * input := {
   *   foo  : "bar",
   *   fizz : "buzz"
   * }
   *
   * existing := {
   *   foo : [ faz ]
   * }
   *
   * result := {
   *   foo  : [ faz, bar ]
   *   fizz : [ buzz ]
   * }
   * ```
   *
   * @param queryParams Map of queryParams to merge into the existing
   * [AbstractRequestParams.queryParams] map.
   */
  fun addQueryParams(queryParams: Map<String, String>) {
    Log.trace("addQueryParams(headers = {})", queryParams)
    queryParams.forEach { (t, u) -> mergeArrays(this.queryParams, t, arrayOf(u)) }
  }

  /**
   * Merges the additional queryParams provided into the existing [queryParams]
   * map.
   *
   * If the [queryParams] map already contains the given key, the [values] in
   * the given [Collection] will be merged into that array.
   *
   * Merge Example:
   * ```
   * inputKey    := "foo"
   * inputValues := [ "fizz", "buzz" ]
   *
   * existing := {
   *   foo : [ "bar" ]
   * }
   *
   * result := {
   *   foo : [ "bar", "fizz", "buzz" ]
   * }
   * ```
   *
   * @param key Key under which the new queryParams will be added.
   *
   * @param values Values to append to the [queryParams] map.
   */
  @Suppress("UNCHECKED_CAST")
  fun addQueryParams(key: String, values: Collection<String>) {
    Log.trace("addQueryParams(key = {}, values = {})", key, values)
    mergeArrays(queryParams, key, values.toTypedArray())
  }

  /**
   * Merges the additional headers provided into the existing [headers] map.
   *
   * If the [headers] map already contains the given key, the given [values]
   * will be merged into that array.
   *
   * Merge Example:
   * ```
   * inputKey    := "foo"
   * inputValues := [ "fizz", "buzz" ]
   *
   * existing := {
   *   foo : [ "bar" ]
   * }
   *
   * result := {
   *   foo : [ "bar", "fizz", "buzz" ]
   * }
   * ```
   *
   * @param key Key under which the new headers will be added.
   *
   * @param values Values to append to the [headers] map.
   */
  @Suppress("UNCHECKED_CAST")
  fun addQueryParams(key: String, vararg values: String) {
    Log.trace("addQueryParams(key = {}, values = {})", key, values)
    mergeArrays(queryParams, key, (values as Array<String>))
  }


  /**
   * Overwrites the queryParam values in the [queryParams] map with the given
   * array of [values].
   *
   * Overwrite Example:
   * ```
   * inputKey    := "foo"
   * inputValues := [ "fizz", "buzz" ]
   *
   * existing := {
   *   foo : [ "bar" ]
   * }
   *
   * result := {
   *   foo : [ "fizz", "buzz" ]
   * }
   * ```
   *
   * @param key Key under which the new queryParams will be set.
   *
   * @param values Values to set in the [queryParams] map.
   */
  @Suppress("UNCHECKED_CAST")
  fun setQueryParams(key: String, vararg values: String) {
    Log.trace("setQueryParams(key = {}, values = {})", key, values)
    (queryParams as MutableMap)[key] = (values as Array<String>)
  }

  @Suppress("UNCHECKED_CAST", "NOTHING_TO_INLINE")
  private inline fun mergeArrays(
    map: Map<String, Array<String>>,
    key: String,
    values: Array<String>,
  ) {
    val tmp = map[key]

    if (tmp != null) {
      val newArray = arrayOfNulls<String>(tmp.size + values.size)
      System.arraycopy(tmp, 0, newArray, 0, tmp.size)
      System.arraycopy(values, 0, newArray, tmp.size, values.size)
      (queryParams as MutableMap)[key] = (newArray as Array<String>)
    } else {
      (queryParams as MutableMap)[key] = values
    }
  }

  protected open fun toString(sb: StringBuilder) {
    if (headers.isNotEmpty()) {
      sb.append("  headers = {\n")
      headers.forEach { (hk, hv) ->
        sb.append("    ").append(hk).append(" = [\n")
        hv.forEach {
          sb.append("      ").append(it).append(",\n")
        }
        sb.append("    ],\n")
      }
      sb.append("  },\n")
    }

    if (queryParams.isNotEmpty()) {
      sb.append("  queryParams = {\n")
      queryParams.forEach { (hk, hv) ->
        sb.append("    ").append(hk).append(" = [\n")
        hv.forEach {
          sb.append("      ").append(it).append(",\n")
        }
        sb.append("    ],\n")
      }
      sb.append("  },\n")
    }
  }
}
