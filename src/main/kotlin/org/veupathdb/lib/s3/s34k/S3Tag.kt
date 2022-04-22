package org.veupathdb.lib.s3.s34k

private const val MaxKeyLength = 128
private const val MaxValLength = 256

/**
 * Represents a single tag attached to a target object or bucket in an S3 store.
 *
 * @param key Tag key.  Must be less than or equal to 128 characters in length.
 *
 * @param value Tag value.  Must be less than or equal to 256 characters in
 * length.
 *
 * @throws IllegalArgumentException If the key is greater than 128 characters in
 * length, or the value is greater than 256 characters in length.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
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