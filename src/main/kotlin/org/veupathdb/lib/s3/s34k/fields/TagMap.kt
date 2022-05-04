package org.veupathdb.lib.s3.s34k.fields

import org.veupathdb.lib.s3.s34k.Tag
import java.util.stream.Stream

/**
 * Immutable map of [Tag] instances.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface TagMap : Iterable<Tag> {

  /**
   * Number of tag pairs currently in this [MutableTagMap]
   *
   * This value will be `10` at most.
   */
  val size: Int

  /**
   * Whether this [MutableTagMap] is empty.
   */
  val isEmpty: Boolean

  /**
   * Whether this [MutableTagMap] is not empty.
   */
  val isNotEmpty: Boolean

  /**
   * Returns the contents of this [TagMap] as a map of string key to string
   * value.
   *
   * @return Map of tag keys to values.
   */
  fun toMap(): Map<String, String>

  /**
   * Returns the contents of this [TagMap] as a set of [Tag] instances.
   *
   * @return Set of [Tag] values.
   */
  fun toSet(): Set<Tag>

  /**
   * Returns the contents of this [TagMap] as a list of [Tag] instances.
   *
   * @return List of [Tag] values.
   */
  fun toList(): List<Tag>

  /**
   * Returns a stream over the contents of this [TagMap].
   *
   * @return Stream over the contents of this [TagMap].
   */
  fun stream(): Stream<Tag>

  /**
   * Gets the value for the tag with the given name ([key]).
   *
   * If no such key exists, returns `null`.
   */
  operator fun get(key: String): String?
}