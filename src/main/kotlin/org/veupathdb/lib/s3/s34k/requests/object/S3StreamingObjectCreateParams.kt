package org.veupathdb.lib.s3.s34k.requests.`object`

import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException
import java.io.InputStream

/**
 * Object put via [InputStream] operation parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3StreamingObjectCreateParams : S3ObjectCreateParams {

  /**
   * *Required* [InputStream] over the data that will be written to the object
   * in the S3 store.
   *
   * If this value is not set when attempting to perform the S3 operation, an
   * [InvalidRequestConfigException] will be thrown.
   */
  var stream: InputStream?

  /**
   * Size of the object being written to the S3 store.
   *
   * If this size is unknown, set this value to -1.
   *
   * Defaults to -1.
   */
  var length: Long

  /**
   * Max chunk size to send in a single request to the S3 store.
   *
   * Defaults to 10MiB.
   */
  var partSize: Int
}