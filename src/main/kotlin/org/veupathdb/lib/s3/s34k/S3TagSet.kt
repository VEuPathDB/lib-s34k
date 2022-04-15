package org.veupathdb.lib.s3.s34k


/**
 * Set of tags retrieved from the S3 store.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3TagSet : Iterable<S3Tag> {

  /**
   * Number of tags in this tag set.
   */
  val size: Int

  /**
   * Whether this tag set is empty.
   */
  val isEmpty: Boolean

  /**
   * Whether this tag set is not empty.
   */
  val isNotEmpty: Boolean

  /**
   * Gets the contents of this tag set as an immutable set.
   *
   * @return An immutable set with the contents of this [S3TagSet].
   */
  fun asSet(): Set<S3Tag>

  /**
   * Gets the contents of this tag set as an immutable list.
   *
   * The elements in this list are guaranteed to be unique.
   *
   * @return An immutable list with the contents of this tag [S3TagSet].
   */
  fun asList(): List<S3Tag>

  /**
   * Gets the contents of this tag set as an immutable map of keys to values.
   *
   * @return An immutable map with the contents of this tag [S3TagSet].
   */
  fun asMap(): Map<String, String>
}