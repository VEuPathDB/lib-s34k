package org.veupathdb.lib.s3.s34k

/**
 * S3 Retention Modes
 *
 * S3 Object Lock provides two retention modes:
 * * Governance mode
 * * Compliance mode
 *
 * These retention modes apply different levels of protection to your objects.
 * You can apply either retention mode to any object version that is protected
 * by Object Lock.
 *
 * In _governance_ mode, users can't overwrite or delete an object version or
 * alter its lock settings unless they have special permissions. With governance
 * mode, you protect objects against being deleted by most users, but you can
 * still grant some users permission to alter the retention settings or delete
 * the object if necessary. You can also use governance mode to test
 * retention-period settings before creating a compliance-mode retention period.
 *
 * To override or remove governance-mode retention settings, a user must have
 * the `s3:BypassGovernanceRetention` permission and must explicitly include
 * `x-amz-bypass-governance-retention:true` as a request header with any request
 * that requires overriding governance mode.
 *
 * In _compliance_ mode, a protected object version can't be overwritten or
 * deleted by any user, including the root user in your AWS account. When an
 * object is locked in compliance mode, its retention mode can't be changed, and
 * its retention period can't be shortened. Compliance mode helps ensure that an
 * object version can't be overwritten or deleted for the duration of the
 * retention period.
 *
 * **Note** Updating an object version's metadata, as occurs when you place or
 * alter an Object Lock, doesn't overwrite the object version or reset its
 * `Last-Modified` timestamp.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
enum class RetentionMode {
  Compliance,
  Governance;

  override fun toString() =
    when(this) {
      Compliance -> "COMPLIANCE"
      Governance -> "GOVERNANCE"
    }

  companion object {
    // TODO: Document me
    @JvmStatic
    fun fromString(value: String) =
      when(value) {
        "GOVERNANCE" -> Governance
        "COMPLIANCE" -> Compliance
        else         -> throw IllegalArgumentException("Invalid S3RetentionMode value: $value")
      }
  }
}