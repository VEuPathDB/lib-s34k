package org.veupathdb.lib.s3.s34k

/**
 * S3 API Wrapper
 *
 * Wraps a specific S3 API implementation with a general wrapper so as not to
 * tie the code in this library to any one implementation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
@Suppress("unused")
interface S3Client {

  val defaultRegion: String?

  val buckets: BucketContainer

}