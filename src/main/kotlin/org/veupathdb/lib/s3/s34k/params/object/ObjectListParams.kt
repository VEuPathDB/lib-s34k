package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.objects.ObjectList
import org.veupathdb.lib.s3.s34k.objects.ObjectContainer
import org.veupathdb.lib.s3.s34k.params.RegionRequestParams

interface ObjectListParams : RegionRequestParams {

  /**
   * Filtering prefix for the paths to return.
   *
   * If set to `null` or a blank string, this operation is the same as
   * [ObjectContainer.listAll].
   */
  var prefix: String?

  /**
   * If set to `true`, this operation will list all paths/keys at all depths
   * under the specified prefix.
   *
   * If set to `false`, this operation will only list paths directly under the
   * specified prefix.
   *
   * **Examples**
   *
   * `container.list("foo", false)`
   * ```
   * ObjectList [
   *   "foo/bar"
   *   "foo/fizz.txt"
   *   "foo/buzz.png"
   * ]
   * ```
   *
   * `container.list("foo", true)`
   * ```
   * ObjectList [
   *   "foo/bar/hello/goodbye.txt
   *   "foo/bar/jam/blueberry.jpg
   *   "foo/fizz.txt"
   *   "foo/buzz.png"
   * ]
   * ```
   */
  var recursive: Boolean

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed a list of objects retrieved from the store.
   */
  var callback: ((ObjectList) -> Unit)?
}