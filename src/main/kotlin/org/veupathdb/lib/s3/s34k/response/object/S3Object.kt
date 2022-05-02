package org.veupathdb.lib.s3.s34k.response.`object`

import org.veupathdb.lib.s3.s34k.S3TagContainer
import org.veupathdb.lib.s3.s34k.requests.*

// TODO: Document me
interface S3Object : S3ObjectResponse {

  val tags: S3TagContainer

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
   */
  fun delete()

  /**
   * Deletes the current object from the S3 store (if it still exists).
   *
   * @param action Action used to configure the S3 operation.
   */
  fun delete(action: S3DeleteRequestParams.() -> Unit)

  /**
   * Deletes the current object from the S3 store (if it still exists).
   *
   * @param params S3 operation parameters.
   */
  fun delete(params: S3DeleteRequestParams)

  // endregion

  // region Stat

  // TODO: Document me
  fun stat(): S3ObjectMeta

  // TODO: Document me
  fun stat(action: S3BlankStatParams.() -> Unit): S3ObjectMeta

  // TODO: Document me
  fun stat(params: S3BlankStatParams): S3ObjectMeta

  // endregion
}