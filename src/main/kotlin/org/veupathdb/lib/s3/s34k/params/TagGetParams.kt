package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.S3TagSet
import org.veupathdb.lib.s3.s34k.fields.BucketName
import org.veupathdb.lib.s3.s34k.params.bucket.BucketTagGetParams
import org.veupathdb.lib.s3.s34k.`object`.request.ObjectTagGetParams

/**
 * Generic Tag Get Operation Parameters
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class TagGetParams(var callback: ((S3TagSet) -> Unit)? = null) : BaseRequest() {
  // TODO: Document me
  fun toObjectTagGetParams(path: String, region: String? = null) =
    ObjectTagGetParams(path, region, callback, headers, queryParams)

  fun toBucketTagGetParams(bucket: BucketName, region: String? = null) =
    BucketTagGetParams(bucket, region, callback, headers, queryParams)
}