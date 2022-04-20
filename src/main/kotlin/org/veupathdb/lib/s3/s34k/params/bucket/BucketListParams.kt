package org.veupathdb.lib.s3.s34k.params.bucket

import org.veupathdb.lib.s3.s34k.S3Bucket

// TODO: Document me
class BucketListParams(
  bucket: String? = null,
  region: String? = null,
  var callback: ((List<S3Bucket>) -> Unit)? = null
) : BaseBucketRequest(bucket, region)