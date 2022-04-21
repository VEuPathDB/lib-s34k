package org.veupathdb.lib.s3.s34k.request.bucket

import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException
import org.veupathdb.lib.s3.s34k.fields.BucketName
import org.veupathdb.lib.s3.s34k.fields.headers.S3HeadersMutable
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParamsMutable
import org.veupathdb.lib.s3.s34k.params.RegionRequest

// TODO: Document me
open class BucketRequest : RegionRequest {

  /**
   * Name of the target S3 bucket.
   *
   * This value must be set or an [InvalidRequestConfigException] will be thrown
   * when the request is attempted.
   */
  var bucket: BucketName?

  constructor(bucket: BucketName? = null, region: String? = null) : super(region) {
    this.bucket = bucket
  }

  internal constructor(
    bucket:      BucketName?,
    region:      String?,
    headers: S3HeadersMutable,
    queryParams: S3QueryParamsMutable,
  ) : super(region, headers, queryParams) {
    this.bucket = bucket
  }

  // TODO: Document me
  fun setBucket(name: String) {
    bucket = BucketName(name)
  }
}