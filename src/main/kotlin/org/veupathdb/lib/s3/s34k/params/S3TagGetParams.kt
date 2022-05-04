package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.fields.S3MutableTagSet
import org.veupathdb.lib.s3.s34k.fields.S3TagMap

interface S3TagGetParams : S3RegionRequestParams {

  /**
   * Optionally filter the returned tags to only those that appear in this tag
   * set.  If this tag set is empty, all tags will be returned.
   */
  val tags: S3MutableTagSet

  /**
   * Callback that will be executed on successful completion of the S3
   * operation.
   *
   * This callback will be passed an [S3TagMap] containing all the tags fetched
   * from the target.
   */
  var callback: ((S3TagMap) -> Unit)?
}