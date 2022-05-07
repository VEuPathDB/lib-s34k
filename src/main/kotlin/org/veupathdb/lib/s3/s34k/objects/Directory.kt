package org.veupathdb.lib.s3.s34k.objects

import org.veupathdb.lib.s3.s34k.objects.ObjectContainer

/**
 * Handle on a "directory" in an S3 store.
 *
 * A directory in this context is an imaginary concept and does not directly
 * represent anything more than a common prefix for one or more objects.
 *
 * A directory's existence is determined by whether any objects exist with the
 * directory's path as a key prefix.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.3.0
 */
interface Directory {

  /**
   * Path prefix this [Directory] represents.
   */
  val prefix: String

  /**
   * Object operation manager.
   */
  val objects: ObjectContainer
}