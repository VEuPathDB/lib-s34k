package org.veupathdb.lib.s3.s34k

import org.veupathdb.lib.s3.s34k.errors.S34kException
import org.veupathdb.lib.s3.s34k.params.TagGetParams
import org.veupathdb.lib.s3.s34k.params.TagPutParams

// TODO: Document me
interface S3Object : S3ObjectResponse {

  /**
   * Tests that the backing object still exists in the S3 store.
   *
   * @param cb Callback that will be executed on the successful response from
   * the S3 store.
   *
   * @return `true` if the object still exists, otherwise `false`.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The thrown [S34kException] will wrap the implementation specific exception.
   */
  fun exists(cb: ((Boolean) -> Unit)? = null): Boolean

  fun stat(cb: ((S3ObjectMeta) -> Unit)? = null): S3ObjectMeta

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