package org.veupathdb.lib.s3.s34k.requests.client

import org.veupathdb.lib.s3.s34k.S3BucketList
import org.veupathdb.lib.s3.s34k.requests.S3RequestParams

// TODO: Document me
interface S3BucketListParams : S3RequestParams {

  // TODO: Document me
  var callback: ((buckets: S3BucketList) -> Unit)?
}