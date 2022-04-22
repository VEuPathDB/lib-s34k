package org.veupathdb.lib.s3.s34k.requests.client

import org.veupathdb.lib.s3.s34k.S3Bucket
import org.veupathdb.lib.s3.s34k.requests.bucket.S3BucketWriteRequestParams

// TODO: Document me
interface S3BucketCreateParams : S3BucketWriteRequestParams {

  // TODO: Document me
  var callback: ((bucket: S3Bucket) -> Unit)?
}