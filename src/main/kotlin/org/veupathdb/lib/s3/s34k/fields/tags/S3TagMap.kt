package org.veupathdb.lib.s3.s34k.fields.tags

import org.veupathdb.lib.s3.s34k.S3Tag
import java.util.stream.Stream

/**
 * Immutable map of [S3Tag] instances.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3TagMap : Iterable<S3Tag> {

  /**
   * Number of tag pairs currently in this [S3MutableTagMap]
   */
  val size: Int

  /**
   * Whether this [S3MutableTagMap] is empty.
   */
  val isEmpty: Boolean

  /**
   * Whether this [S3MutableTagMap] is not empty.
   */
  val isNotEmpty: Boolean

  /**
   * Returns the contents of this [S3TagMap] as a map of string key to string
   * value.
   *
   * @return Map of tag keys to values.
   */
  fun toMap(): Map<String, String>

  /**
   * Returns the contents of this [S3TagMap] as a set of [S3Tag] instances.
   *
   * @return Set of [S3Tag] values.
   */
  fun toSet(): Set<S3Tag>

  /**
   * Returns the contents of this [S3TagMap] as a list of [S3Tag] instances.
   *
   * @return List of [S3Tag] values.
   */
  fun toList(): List<S3Tag>

  /**
   * Returns a stream over the contents of this [S3TagMap].
   *
   * @return Stream over the contents of this [S3TagMap].
   */
  fun stream(): Stream<S3Tag>

  /**
   * Gets the value for the tag with the given name ([key]).
   *
   * If no such key exists, returns `null`.
   */
  operator fun get(key: String): String?
}