package org.veupathdb.lib.s3.s34k

// TODO: Document me
enum class S3RetentionMode {
  Compliance,
  Governance;

  companion object {

    @JvmStatic
    fun fromString(value: String) =
      when(value) {
        "GOVERNANCE" -> Governance
        "COMPLIANCE" -> Compliance
        else         -> throw IllegalArgumentException("Invalid S3RetentionMode value: $value")
      }
  }
}