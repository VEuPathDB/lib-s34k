package org.veupathdb.lib.s3.s34k

import org.veupathdb.lib.s3.s34k.params.DeleteParams
import org.veupathdb.lib.s3.s34k.params.ExistsParams
import org.veupathdb.lib.s3.s34k.params.StatParams

// TODO: Document me
interface S3Object : ObjectResponse {

  val tags: TagContainer

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
   */
  fun delete()

  /**
   * Deletes the current object from the S3 store (if it still exists).
   *
   * @param action Action used to configure the S3 operation.
   */
  fun delete(action: DeleteParams.() -> Unit)

  /**
   * Deletes the current object from the S3 store (if it still exists).
   *
   * @param params S3 operation parameters.
   */
  fun delete(params: DeleteParams)

  // endregion

  // region Stat

  // TODO: Document me
  fun stat(): ObjectMeta

  // TODO: Document me
  fun stat(action: StatParams.() -> Unit): ObjectMeta

  // TODO: Document me
  fun stat(params: StatParams): ObjectMeta

  // endregion
}