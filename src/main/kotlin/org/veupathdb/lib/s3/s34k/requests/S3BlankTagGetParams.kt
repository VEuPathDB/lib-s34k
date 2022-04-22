package org.veupathdb.lib.s3.s34k.requests

import org.veupathdb.lib.s3.s34k.fields.BucketName
import org.veupathdb.lib.s3.s34k.requests.bucket.S3BucketTagGetParams
import org.veupathdb.lib.s3.s34k.requests.`object`.S3ObjectTagGetParams

// TODO: Document me
interface S3BlankTagGetParams : S3TagGetParams {

  fun toObjectTagGetParams(path: String): S3ObjectTagGetParams

  fun toBucketTagGetParams(bucket: BucketName): S3BucketTagGetParams
}