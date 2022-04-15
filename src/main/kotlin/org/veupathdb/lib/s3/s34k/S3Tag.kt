package org.veupathdb.lib.s3.s34k

private const val MaxKeyLength = 128
private const val MaxValLength = 256

// TODO: Document me
data class S3Tag(val key: String, val value: String) {
  init {
    if (key.length > MaxKeyLength)
      throw IllegalArgumentException("Tag keys must be less than or equal to $MaxKeyLength unicode characters in length.")
    if (value.length > MaxValLength)
      throw IllegalArgumentException("Tag values must be less than or equal to $MaxValLength unicode characters in length.")
  }

  override fun toString(): String {
    return "S3Tag {\n  key = $key,\n  value = $value,\n}"
  }
}