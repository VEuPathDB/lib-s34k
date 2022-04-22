package org.veupathdb.lib.s3.s34k.requests.client

import org.veupathdb.lib.s3.s34k.requests.bucket.S3BucketRequestParams

// TODO: Document me
interface S3BucketDeleteParams : S3BucketRequestParams {
  // TODO: Document me
  var callback: ((deleted: Boolean) -> Unit)?
}