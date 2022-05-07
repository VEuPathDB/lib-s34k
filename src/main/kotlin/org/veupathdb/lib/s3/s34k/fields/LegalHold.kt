package org.veupathdb.lib.s3.s34k.fields

/**
 * S3 Legal Holds
 *
 * With Object Lock you can also place a legal hold on an object version. Like a
 * retention period, a legal hold prevents an object version from being
 * overwritten or deleted. However, a legal hold doesn't have an associated
 * retention period and remains in effect until removed. Legal holds can be
 * freely placed and removed by any user who has the `s3:PutObjectLegalHold`
 * permission.
 *
 * Legal holds are independent of retention periods. As long as the bucket that
 * contains the object has Object Lock enabled, you can place and remove legal
 * holds regardless of whether the specified object version has a retention
 * period set. Placing a legal hold on an object version doesn't affect the
 * retention mode or retention period for that object version.
 *
 * For example, suppose that you place a legal hold on an object version while
 * the object version is also protected by a retention period. If the retention
 * period expires, the object doesn't lose its WORM protection. Rather, the
 * legal hold continues to protect the object until an authorized user
 * explicitly removes it. Similarly, if you remove a legal hold while an object
 * version has a retention period in effect, the object version remains
 * protected until the retention period expires.
 *
 * To use Object Lock, you must enable it for a bucket. You can also optionally
 * configure a default retention mode and period that applies to new objects
 * that are placed in the bucket.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
enum class LegalHold {
  On,
  Off;

  val asBool get() = this == On

  override fun toString(): String =
    when(this) {
      On  -> "ON"
      Off -> "OFF"
    }

  companion object {
    @JvmStatic
    // TODO: Document me
    fun fromString(value: String) =
      when(value) {
        "ON"  -> On
        "OFF" -> Off
        else  -> throw IllegalArgumentException("Invalid S3LegalHold value: $value")
      }
  }
}