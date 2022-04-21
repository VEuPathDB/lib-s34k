package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.S3TagSet
import org.veupathdb.lib.s3.s34k.request.bucket.BucketTagGetParams
import org.veupathdb.lib.s3.s34k.fields.BucketName
import org.veupathdb.lib.s3.s34k.request.`object`.ObjectTagGetParams

/**
 * Generic Tag Get Operation Parameters
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class TagGetParams(
  region: String? = null,
  var callback: ((S3TagSet) -> Unit)? = null
) : RegionRequest(region) {
  // TODO: Document me
  fun toObjectTagGetParams(path: String) =
    ObjectTagGetParams(path, region, callback, headers, queryParams)

  fun toBucketTagGetParams(bucket: BucketName) =
    BucketTagGetParams(bucket, region, callback, headers, queryParams)
}