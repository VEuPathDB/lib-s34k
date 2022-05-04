package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.fields.MutableHeaders
import org.veupathdb.lib.s3.s34k.fields.MutableQueryParams

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
  val headers: MutableHeaders

  /**
   * Additional/custom query parameters to send with the S3 operation request.
   */
  val queryParams: MutableQueryParams
}