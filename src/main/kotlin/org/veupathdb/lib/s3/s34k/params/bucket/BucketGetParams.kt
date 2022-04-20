package org.veupathdb.lib.s3.s34k.params.bucket

import org.veupathdb.lib.s3.s34k.S3Bucket

/**
 * Get Bucket Operation Parameters
 *
 * @constructor Constructs a new [BucketGetParams] instance.
 *
 * @param bucket Name of the target S3 bucket.
 *
 * @throws IllegalArgumentException If the value set is not between `3` and
 * `63` characters in length.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class BucketGetParams(
  bucket: String? = null,
  region: String? = null,
  var callback: ((bucket: S3Bucket) -> Unit)? = null
) : BaseBucketRequest(bucket, region)
