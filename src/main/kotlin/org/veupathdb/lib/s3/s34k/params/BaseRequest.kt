package org.veupathdb.lib.s3.s34k.params

import org.slf4j.LoggerFactory
import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.headers.MutableHeaderMapImpl
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.MutableQueryParamMapImpl

/**
 * Request Params
 *
 * Base type for S3 operation param sets.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
open class BaseRequest {

  private val Log = LoggerFactory.getLogger(this::class.java)

  /**
   * Additional headers that will be sent with the S3 operation.
   */
  val headers: S3HeadersMutable

  /**
   * Additional query parameters that will be sent with the S3 operation.
   */
  val queryParams: S3QueryParamsMutable

  constructor() : this(MutableHeaderMapImpl(), MutableQueryParamMapImpl())

  internal constructor(
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable,
  ) {
    this.headers     = headers
    this.queryParams = queryParams
  }
}
