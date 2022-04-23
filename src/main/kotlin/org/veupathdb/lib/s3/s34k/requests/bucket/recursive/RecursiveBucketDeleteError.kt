package org.veupathdb.lib.s3.s34k.requests.bucket.recursive

import org.veupathdb.lib.s3.s34k.errors.S34kException
import org.veupathdb.lib.s3.s34k.fields.BucketName
import org.veupathdb.lib.s3.s34k.fields.headers.S3Headers
import org.veupathdb.lib.s3.s34k.fields.query_params.S3QueryParams

open class RecursiveBucketDeleteError : S34kException {

  val bucketName: BucketName

  val globalHeaders: S3Headers

  val globalQueryParams: S3QueryParams

  val objectListHeaders: S3Headers

  val objectListQueryParams: S3QueryParams

  val objectDeleteHeaders: S3Headers

  val objectDeleteQueryParams: S3QueryParams

  val bucketDeleteHeaders: S3Headers

  val bucketDeleteQueryParams: S3QueryParams

  constructor(
    req: S3ClientRecursiveBucketDeleteParams,
    message: String,
    cause: Throwable
  ) : super(message, cause) {
    this.bucketName = req.bucketName!!

    this.globalHeaders = req.globalHeaders
    this.globalQueryParams = req.globalQueryParams

    this.objectListHeaders = req.objectFetch.headers
    this.objectListQueryParams = req.objectFetch.queryParams

    this.objectDeleteHeaders = req.objectDelete.headers
    this.objectDeleteQueryParams = req.objectDelete.queryParams

    this.bucketDeleteHeaders = req.bucketDelete.headers
    this.bucketDeleteQueryParams = req.bucketDelete.queryParams
  }
}