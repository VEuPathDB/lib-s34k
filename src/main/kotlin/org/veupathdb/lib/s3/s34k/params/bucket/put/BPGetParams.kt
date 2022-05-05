package org.veupathdb.lib.s3.s34k.params.bucket.put

import org.veupathdb.lib.s3.s34k.params.S3RequestParams

interface BPGetParams : S3RequestParams {
  var callback: (() -> Unit)?
}