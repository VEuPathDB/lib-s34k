package org.veupathdb.lib.s3.s34k.params.bucket.tag

import org.veupathdb.lib.s3.s34k.params.S3RequestParams

interface TargetedBucketTagDeletePut : S3RequestParams {
  var callback: (() -> Unit)?
}