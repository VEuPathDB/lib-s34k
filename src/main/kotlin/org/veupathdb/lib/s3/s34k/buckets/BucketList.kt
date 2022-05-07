package org.veupathdb.lib.s3.s34k.buckets

import org.veupathdb.lib.s3.s34k.fields.BucketName
import java.util.stream.Stream

/**
 * Collection of [Buckets][S3Bucket] retrieved from an S3 store.
 *
 * The contents of this [BucketList] are guaranteed to be in the order returned
 * by the S3 API.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.3.0
 */
interface BucketList : Iterable<S3Bucket> {

  /**
   * Count of buckets in this [BucketList].
   */
  val size: Int

  /**
   * Whether this [BucketList] is empty.
   */
  val isEmpty: Boolean

  /**
   * Whether this [BucketList] is not empty.
   */
  val isNotEmpty: Boolean

  /**
   * Copies the contents of this [BucketList] into a map keyed on bucket names.
   *
   * @return Map of buckets.
   */
  fun toMap(): Map<BucketName, S3Bucket>

  /**
   * Copies the contents of this [BucketList] into a list.
   *
   * Bucket list will be in the order the buckets were returned from the S3 API.
   *
   * @return List of buckets
   */
  fun toList(): List<S3Bucket>

  /**
   * Returns a stream over the contents of this [BucketList].
   *
   * The contents of the stream will be in the order the buckets were returned
   * from the S3 api.
   *
   * @return Stream of buckets.
   */
  fun stream(): Stream<S3Bucket>

  /**
   * Retrieves the bucket in this [BucketList] with the given name (if such a
   * bucket exists).
   *
   * @return The target bucket, if it exists, otherwise `null`.
   */
  operator fun get(name: BucketName): S3Bucket?

  /**
   * Returns the [S3Bucket] in this [BucketList] at the given index.
   *
   * @return The target bucket.
   */
  operator fun get(index: Int): S3Bucket
}