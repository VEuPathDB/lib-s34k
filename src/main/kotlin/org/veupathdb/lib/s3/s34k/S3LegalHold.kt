package org.veupathdb.lib.s3.s34k

// TODO: Document me
enum class S3LegalHold {
  On,
  Off;

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