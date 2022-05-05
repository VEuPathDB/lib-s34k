package org.veupathdb.lib.s3.s34k.params.bucket.put

import org.veupathdb.lib.s3.s34k.params.S3RequestParams

interface BPTagPutParams : S3RequestParams {
  var callback: (() -> Unit)?
}