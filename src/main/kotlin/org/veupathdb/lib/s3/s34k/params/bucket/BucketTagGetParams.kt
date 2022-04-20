package org.veupathdb.lib.s3.s34k.params.bucket

import org.veupathdb.lib.s3.s34k.S3TagSet

/**
 * Bucket Tag Retrieval Operation Parameters
 *
 * @constructor Constructs a new [BucketTagGetParams] instance.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class BucketTagGetParams(
  bucket: String? = null,
  region: String? = null,
  var callback: ((tags: S3TagSet) -> Unit)? = null,
) : BaseBucketRequest(bucket, region)