package org.veupathdb.lib.s3.s34k

import org.veupathdb.lib.s3.s34k.errors.S34kException
import org.veupathdb.lib.s3.s34k.params.ExistsParams
import org.veupathdb.lib.s3.s34k.params.StatParams
import org.veupathdb.lib.s3.s34k.params.TagGetParams
import org.veupathdb.lib.s3.s34k.params.TagPutParams

// TODO: Document me
interface S3Object : S3ObjectResponse {

  // region: Exists

  // TODO: Document me
  fun exists(): Boolean

  // TODO: Document me
  fun exists(action: ExistsParams.() -> Unit): Boolean

  // TODO: Document me
  fun exists(params: ExistsParams): Boolean

  // endregion


  // region: Stat

  // TODO: Document me
  fun stat(): S3ObjectMeta

  // TODO: Document me
  fun stat(action: StatParams.() -> Unit): S3ObjectMeta

  // TODO: Document me
  fun stat(params: StatParams): S3ObjectMeta

  // endregion

  // TODO: Document me
  fun getTags(cb: ((S3TagSet) -> Unit)? = null): S3TagSet

  // TODO: Document me
  fun getTags(action: TagGetParams.() -> Unit, cb: ((S3TagSet) -> Unit)? = null): S3TagSet

  // TODO: Document me
  fun getTags(params: TagGetParams, cb: ((S3TagSet) -> Unit)? = null): S3TagSet

  // TODO: Document me
  fun setTag(key: String, value: String, cb: (() -> Unit)? = null)

  // TODO: Document me
  fun setTags(tags: Map<String, String>, cb: (() -> Unit)? = null)

  // TODO: Document me
  fun setTags(tags: Collection<S3Tag>, cb: (() -> Unit)? = null)

  // TODO: Document me
  fun setTags(vararg tags: S3Tag, cb: (() -> Unit)? = null)

  // TODO: Document me
  fun setTags(action: TagPutParams.() -> Unit, cb: (() -> Unit)? = null)

  // TODO: Document me
  fun setTags(params: TagPutParams, cb: (() -> Unit)? = null)
}