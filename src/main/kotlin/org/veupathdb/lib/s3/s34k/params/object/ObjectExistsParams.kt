package org.veupathdb.lib.s3.s34k.params.`object`

/**
 * Object Exists Test Operation Parameters
 *
 * @constructor Constructs a new [ObjectExistsParams] instance.
 *
 * @param callback Optional callback that will be called upon request
 * completion.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
class ObjectExistsParams : BaseObjectRequest {
  var callback: ((Boolean) -> Unit)?

  constructor(path: String? = null, callback: ((Boolean) -> Unit)? = null) : super(path) {
    this.callback = callback
  }

  internal constructor(
    path: String?,
    region: String?,
    callback: ((Boolean) -> Unit)?,
    headers: MutableMap<String, Array<String>>,
    queryParams: MutableMap<String, Array<String>>,
  ) : super(path, region, headers, queryParams) {
    this.callback = callback
  }
}
