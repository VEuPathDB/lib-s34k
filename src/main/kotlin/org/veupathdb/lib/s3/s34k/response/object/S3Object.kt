package org.veupathdb.lib.s3.s34k.response.`object`

import org.veupathdb.lib.s3.s34k.S3Tag
import org.veupathdb.lib.s3.s34k.S3TagSet
import org.veupathdb.lib.s3.s34k.params.*
import org.veupathdb.lib.s3.s34k.errors.*

// TODO: Document me
interface S3Object : S3ObjectResponse {

  // region Exists

  // TODO: Document me
  fun exists(): Boolean

  // TODO: Document me
  fun exists(action: ExistsParams.() -> Unit): Boolean

  // TODO: Document me
  fun exists(params: ExistsParams): Boolean

  // endregion

  // region Delete

  /**
   * Deletes the current object from the S3 store (if it still exists).
   *
   * @return Flag indicating if the object was deleted from the store.  `true`
   * if the object existed and was deleted, `false` if the
   * object did not exist.
   */
  fun delete(): Boolean

  /**
   * Deletes the current object from the S3 store (if it still exists).
   *
   * @param action Action used to configure the S3 operation.
   *
   * @return Flag indicating if the object was deleted from the store.  `true`
   * if the object existed and was deleted, `false` if the
   * object did not exist.
   */
  fun delete(action: DeleteParams.() -> Unit): Boolean

  /**
   * Deletes the current object from the S3 store (if it still exists).
   *
   * @param params S3 operation parameters.
   *
   * @return Flag indicating if the object was deleted from the store.  `true`
   * if the object existed and was deleted, `false` if the
   * object did not exist.
   */
  fun delete(params: DeleteParams): Boolean

  // endregion

  // region Stat

  // TODO: Document me
  fun stat(): S3ObjectMeta

  // TODO: Document me
  fun stat(action: StatParams.() -> Unit): S3ObjectMeta

  // TODO: Document me
  fun stat(params: StatParams): S3ObjectMeta

  // endregion

  // region Get Tags

  // TODO: Document me
  fun getTags(): S3TagSet

  // TODO: Document me
  fun getTags(action: TagGetParams.() -> Unit): S3TagSet

  // TODO: Document me
  fun getTags(params: TagGetParams): S3TagSet

  // endregion

  // region Set Tags

  // TODO: Document me
  fun setTag(key: String, value: String)

  // TODO: Document me
  fun setTags(tags: Map<String, String>)

  // TODO: Document me
  fun setTags(tags: Iterable<S3Tag>)

  // TODO: Document me
  fun setTags(vararg tags: S3Tag)

  // TODO: Document me
  fun setTags(action: TagPutParams.() -> Unit)

  // TODO: Document me
  fun setTags(params: TagPutParams)

  // endregion

  // region Delete Tags

  /**
   * Deletes all the tags currently attached to this object.
   *
   * @return A tag set containing only the tags that existed on the target
   * object and were deleted.
   *
   * @throws BucketNotFoundException If the parent bucket no longer exists.
   *
   * @throws ObjectNotFoundException If this object no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun deleteTags(): S3TagSet

  /**
   * Deletes the specified tags currently attached to this object.
   *
   * @throws BucketNotFoundException If the parent bucket no longer exists.
   *
   * @throws ObjectNotFoundException If this object no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun deleteTags(vararg tags: String): S3TagSet

  /**
   * Deletes the specified tags currently attached to this object.
   *
   * @throws BucketNotFoundException If the parent bucket no longer exists.
   *
   * @throws ObjectNotFoundException If this object no longer exists.
   *
   * @throws S34kException If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  fun deleteTags(tags: Iterable<String>): S3TagSet

  // TODO: Document me
  fun deleteTags(action: TagDeleteParams.() -> Unit): S3TagSet

  // TODO: Document me
  fun deleteTags(params: TagDeleteParams): S3TagSet

  // endregion
}