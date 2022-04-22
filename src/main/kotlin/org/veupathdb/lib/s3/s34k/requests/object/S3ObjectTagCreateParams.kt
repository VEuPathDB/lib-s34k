package org.veupathdb.lib.s3.s34k.requests.`object`

interface S3ObjectTagCreateParams : S3ObjectWriteParams {

  var callback: (() -> Unit)?
}