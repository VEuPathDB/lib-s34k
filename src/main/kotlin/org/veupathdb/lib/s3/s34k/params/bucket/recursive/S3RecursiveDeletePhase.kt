package org.veupathdb.lib.s3.s34k.params.bucket.recursive

/**
 * Represents and defines the different phases of a recursive bucket delete
 * operation.
 *
 * This type is exclusively used when throwing a [RecursiveBucketDeleteError].
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
enum class S3RecursiveDeletePhase {
  ListObjects,
  DeleteObjects,
  DeleteBucket
}