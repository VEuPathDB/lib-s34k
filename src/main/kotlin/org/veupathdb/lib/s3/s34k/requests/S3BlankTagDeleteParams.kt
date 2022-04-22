package org.veupathdb.lib.s3.s34k.requests

import org.veupathdb.lib.s3.s34k.requests.bucket.S3BucketTagDeleteParams
import org.veupathdb.lib.s3.s34k.requests.`object`.S3ObjectTagDeleteParams

interface S3BlankTagDeleteParams : S3TagDeleteParams {

  fun toBucketTagDeleteParams(): S3BucketTagDeleteParams

  fun toObjectTagDeleteParams(path: String): S3ObjectTagDeleteParams
}