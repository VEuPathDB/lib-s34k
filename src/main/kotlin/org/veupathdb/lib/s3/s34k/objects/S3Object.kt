package org.veupathdb.lib.s3.s34k.objects

import org.veupathdb.lib.s3.s34k.errors.BucketNotFoundError
import org.veupathdb.lib.s3.s34k.errors.S34KError
import org.veupathdb.lib.s3.s34k.params.DeleteParams
import org.veupathdb.lib.s3.s34k.params.`object`.ObjectExistsParams
import org.veupathdb.lib.s3.s34k.params.`object`.ObjectStatParams
import java.time.OffsetDateTime

/**
 * S3 Object
 *
 * Represents a single object in an S3 store and provides methods and properties
 * for operating on the object and its tags.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.3.0
 */
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

  /**
   * Returns the base name of this object, or in other words, the last segment
   * of the path.
   *
   * **Examples**:
   *
   * Given the object path `foo/bar/fizz/buzz` the base name would be `"buzz"`
   *
   * Given the object path `foo` the base name would be `"foo"`
   */
  val baseName: String

  /**
   * Returns the 'directory' parent of this object.
   *
   * If this path is a root level object, the returned dirName will be blank.
   *
   * **Examples**:
   *
   * Given the object path `foo/bar/fizz/buzz` the dir name would be
   * `"foo/bar/fizz"`.
   *
   * Given the object path `foo`, the dir name would be `""`.
   */
  val dirName: String

  // region Exists

  /**
   * Tests whether this object still exists.
   *
   * @return `true` if this object still exists, otherwise `false`.
   *
   * @throws BucketNotFoundError The bucket in which this object resided no
   * longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun exists(): Boolean

  /**
   * Tests whether this object still exists.
   *
   * @return `true` if this object still exists, otherwise `false`.
   *
   * @throws BucketNotFoundError The bucket in which this object resided no
   * longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun exists(action: ObjectExistsParams.() -> Unit): Boolean

  /**
   * Tests whether this object still exists.
   *
   * @return `true` if this object still exists, otherwise `false`.
   *
   * @throws BucketNotFoundError The bucket in which this object resided no
   * longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun exists(params: ObjectExistsParams): Boolean

  // endregion

  // region Delete

  /**
   * Deletes the current object.
   *
   * @throws BucketNotFoundError If the bucket in which this object resided no
   * longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun delete()

  /**
   * Deletes the current object.
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * @throws BucketNotFoundError If the bucket in which this object resided no
   * longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun delete(action: DeleteParams.() -> Unit)

  /**
   * Deletes the current object.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @throws BucketNotFoundError If the bucket in which this object resided no
   * longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun delete(params: DeleteParams)

  // endregion

  // region Stat

  /**
   * Fetches metadata for this object.
   *
   * If this object no longer exists, `null` will be returned.
   *
   * @return An [ObjectMeta] instance containing this object's metadata
   * if this object exists, otherwise `null`.
   *
   * @throws BucketNotFoundError If the bucket in which this object resided no
   * longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun stat(): ObjectMeta?

  /**
   * Fetches metadata for this object.
   *
   * If this object no longer exists, `null` will be returned.
   *
   * @param action Action used to configure the backing S3 operation.
   *
   * @return An [ObjectMeta] instance containing this object's metadata
   * if this object exists, otherwise `null`.
   *
   * @throws BucketNotFoundError If the bucket in which this object resided no
   * longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun stat(action: ObjectStatParams.() -> Unit): ObjectMeta?

  /**
   * Fetches metadata for this object.
   *
   * If this object no longer exists, `null` will be returned.
   *
   * @param params Parameters for the backing S3 operation.
   *
   * @return An [ObjectMeta] instance containing this object's metadata
   * if this object exists, otherwise `null`.
   *
   * @throws BucketNotFoundError If the bucket in which this object resided no
   * longer exists.
   *
   * @throws S34KError If an implementation specific exception is thrown.
   * The implementation specific exception will be set to the thrown exception's
   * 'cause' value.
   */
  @Throws(BucketNotFoundError::class, S34KError::class)
  fun stat(params: ObjectStatParams): ObjectMeta?

  // endregion
}