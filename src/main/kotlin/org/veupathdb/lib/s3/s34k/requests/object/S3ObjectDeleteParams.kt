package org.veupathdb.lib.s3.s34k.requests.`object`

/**
 * Object delete request parameters.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3ObjectDeleteParams : S3ObjectRequestParams {

  /**
   * Optional callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed a boolean flag indicating whether the file was
   * deleted.  `true` means the file previously existed, and was deleted.
   * `false` means the file did not exist at the time the request was made.
   */
  var callback: ((Boolean) -> Unit)?

  /**
   * Whether the object delete should be recursive, I.E. should all keys with
   * this object path as a prefix also be deleted.
   *
   * ### Examples
   *
   * Examples for operations where the target key `/foo/bar` is deleted.
   *
   * #### Without Recursive
   *
   * Before:
   * ```
   * /foo/bar
   * /foo/bar/fizz
   * /foo/bar/buzz
   * /hi/bye/something
   * ```
   *
   * After:
   * ```
   * /foo/bar/fizz
   * /foo/bar/buzz
   * /hi/bye/something
   * ```
   *
   * #### With Recursive
   *
   * Before:
   * ```
   * /foo/bar
   * /foo/bar/fizz
   * /foo/bar/buzz
   * /hi/bye/something
   * ```
   *
   * After:
   * ```
   * /hi/bye/something
   * ```
   *
   * Default value: `false`
   */
  var recursive: Boolean
}