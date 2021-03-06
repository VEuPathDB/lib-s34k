package org.veupathdb.lib.s3.s34k.params.tag

import org.veupathdb.lib.s3.s34k.fields.MutableTagSet
import org.veupathdb.lib.s3.s34k.fields.TagMap
import org.veupathdb.lib.s3.s34k.params.RegionRequestParams

interface TagGetParams : RegionRequestParams {

  /**
   * Optionally filter the returned tags to only those that appear in this tag
   * set.  If this tag set is empty, all tags will be returned.
   */
  val tags: MutableTagSet

  /**
   * Callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed an [TagMap] containing all the tags fetched
   * from the target.
   */
  var callback: ((TagMap) -> Unit)?
}