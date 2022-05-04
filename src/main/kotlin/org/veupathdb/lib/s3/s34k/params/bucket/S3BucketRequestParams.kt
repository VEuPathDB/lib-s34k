package org.veupathdb.lib.s3.s34k.params.bucket

import org.veupathdb.lib.s3.s34k.S3BucketName
import org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigError
import org.veupathdb.lib.s3.s34k.params.S3RegionRequestParams

/**
 * S3 Bucket Request
 *
 * Base type for S3 bucket operation param sets.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
@Deprecated("will be removed")
interface S3BucketRequestParams : S3RegionRequestParams