package org.veupathdb.lib.s3.s34k.params

import org.slf4j.LoggerFactory
import org.veupathdb.lib.s3.s34k.params.bucket.BucketDeleteParams
import org.veupathdb.lib.s3.s34k.params.bucket.BucketName

open class DeleteParams(val callback: (() -> Unit)? = null) : BaseRequest() {

  private val Log = LoggerFactory.getLogger(this::class.java)

  fun toBucketDeleteParams(
    name: BucketName,
    region: String? = null
  ): BucketDeleteParams {
    Log.trace("toBucketDeleteParams(name = {}, region = {})", name, region)
    return BucketDeleteParams(null, region, callback).also {
      it.bucket  = name
      queryParams.forEach { (k, v) -> it.addQueryParams(k, v.asList()) }
      headers.forEach { (k, v) -> it.addHeaders(k, v.asList()) }
    }
  }
}