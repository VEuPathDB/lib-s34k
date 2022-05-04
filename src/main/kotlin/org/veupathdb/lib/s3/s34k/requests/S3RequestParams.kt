package org.veupathdb.lib.s3.s34k.requests

import org.veupathdb.lib.s3.s34k.fields.S3MutableHeaders
import org.veupathdb.lib.s3.s34k.fields.S3MutableQueryParams

/**
 * Represents a basic S3 request.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3RequestParams {

  /**
   * Additional/custom headers to send with the S3 operation request.
   */
  val headers: S3MutableHeaders

  /**
   * Additional/custom query parameters to send with the S3 operation request.
   */
  val queryParams: S3MutableQueryParams
}