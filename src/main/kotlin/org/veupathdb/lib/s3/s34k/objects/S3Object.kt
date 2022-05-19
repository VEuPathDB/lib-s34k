package org.veupathdb.lib.s3.s34k.objects

import org.veupathdb.lib.s3.s34k.params.DeleteParams
import org.veupathdb.lib.s3.s34k.params.`object`.ObjectExistsParams
import org.veupathdb.lib.s3.s34k.params.`object`.ObjectStatParams
import java.time.OffsetDateTime

// TODO: Document me
interface S3Object : ObjectResponse {

  /**
   * Object last modified/created timestamp.
   *
   * This value will not be present on responses from object puts.
   */
  val lastModified: OffsetDateTime?

  /**
   * Object ETag value.
   */
  val eTag: String

  /**
   * Object tag management container.
   */
  val tags: ObjectTagContainer

  // region Exists

  // TODO: Document me
  fun exists(): Boolean

  // TODO: Document me
  fun exists(action: ObjectExistsParams.() -> Unit): Boolean

  // TODO: Document me
  fun exists(params: ObjectExistsParams): Boolean

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
  fun stat(): ObjectMeta?

  // TODO: Document me
  fun stat(action: ObjectStatParams.() -> Unit): ObjectMeta?

  // TODO: Document me
  fun stat(params: ObjectStatParams): ObjectMeta?

  // endregion
}