package org.veupathdb.lib.s3.s34k.requests

import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable

/**
 * Represents a basic S3 request.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3RequestParams {
  val headers: S3HeadersMutable

  val queryParams: S3QueryParamsMutable
}