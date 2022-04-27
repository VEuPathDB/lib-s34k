package org.veupathdb.lib.s3.s34k.response.`object`

import org.veupathdb.lib.s3.s34k.S3Tag
import org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException
import org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException
import org.veupathdb.lib.s3.s34k.errors.S34kException
import org.veupathdb.lib.s3.s34k.fields.tags.S3TagMap
import org.veupathdb.lib.s3.s34k.requests.*

// TODO: Document me
interface S3Object : S3ObjectResponse {

  // region Exists

  // TODO: Document me
  fun exists(): Boolean

  // TODO: Document me
  fun exists(action: S3BlankExistsParams.() -> Unit): Boolean

  // TODO: Document me
  fun exists(params: S3BlankExistsParams): Boolean

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
  fun delete(action: S3DeleteRequestParams.() -> Unit): Boolean

  /**
   * Deletes the current object from the S3 store (if it still exists).
   *
   * @param params S3 operation parameters.
   *
   * @return Flag indicating if the object was deleted from the store.  `true`
   * if the object existed and was deleted, `false` if the
   * object did not exist.
   */
  fun delete(params: S3DeleteRequestParams): Boolean

  // endregion

  // region Stat

  // TODO: Document me
  fun stat(): S3ObjectMeta

  // TODO: Document me
  fun stat(action: S3BlankStatParams.() -> Unit): S3ObjectMeta

  // TODO: Document me
  fun stat(params: S3BlankStatParams): S3ObjectMeta

  // endregion

  // region Get Tags

  // TODO: Document me
  fun getTags(): S3TagMap

  // TODO: Document me
  fun getTags(action: S3BlankTagGetParams.() -> Unit): S3TagMap

  // TODO: Document me
  fun getTags(params: S3BlankTagGetParams): S3TagMap

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
  fun setTags(action: S3BlankTagCreateParams.() -> Unit)

  // TODO: Document me
  fun setTags(params: S3BlankTagCreateParams)

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
  fun deleteTags(): S3TagMap

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
  fun deleteTags(vararg tags: String): S3TagMap

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
  fun deleteTags(tags: Iterable<String>): S3TagMap

  // TODO: Document me
  fun deleteTags(action: S3BlankTagDeleteParams.() -> Unit): S3TagMap

  // TODO: Document me
  fun deleteTags(params: S3BlankTagDeleteParams): S3TagMap

  // endregion
}