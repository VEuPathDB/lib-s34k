package org.veupathdb.lib.s3.s34k

/**
 * Validating bucket name wrapper.
 *
 * Wraps a bucket name value and enforces the following validity rules:
 *
 * * Bucket names must be between 3 (min) and 63 (max) characters.
 * * Bucket names must consist of only lowercase letters, numbers, dots (`.`),
 *   and hyphens (`-`).
 * * Bucket names must begin and end with a letter or number.
 * * Bucket names must not be formatted as an IP address (for example,
 *   192.168.5.4).
 * * Bucket names must not start with the prefix "xn--".
 * * Bucket names must not end with the suffix "-s3alias".
 *
 * If any of the above are true, then the creation of this type will fail with
 * an [IllegalArgumentException].
 *
 * @constructor Tests the input string and creates a new [BucketName] instance.
 *
 * @param name Valid bucket name.
 *
 * @throws IllegalArgumentException If the input [name] value violates any of
 * the bucket naming rules above.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
@JvmInline
value class BucketName(val name: String) {

  companion object {
    /**
     * Bucket name check regex that verifies the bucket name starts with, and
     * ends with a lowercase letter or number; and consists of only lowercase
     * letters, numbers, dot characters or hyphen characters.
     */
    @JvmStatic
    internal val nameRegex = Regex("^[a-z\\d][-.a-z\\d]+[a-z\\d]$")

    /**
     * Bucket name check regex that tests whether the bucket name appears to be
     * an IP address.
     */
    @JvmStatic
    internal val ipRegex = Regex("^\\d+\\.\\d+\\.\\d+\\.\\d+$")

    /**
     * Constructs a new [BucketName] instance from the given name if it is not
     * `null`.
     *
     * If the given name _is_ `null`, an [IllegalArgumentException] will be
     * thrown.
     *
     * @param name Bucket name.
     *
     * @return New [BucketName] instance.
     *
     * @throws IllegalArgumentException If the input value is `null`, or if the
     * input string violates any of the rules outlined in this type's
     * constructor documentation.
     */
    @JvmStatic
    fun of(name: String?): BucketName {
      if (name == null)
        throw IllegalArgumentException("Bucket name must not be null")

      return BucketName(name)
    }
  }

  init {
    if (name.length !in 3 .. 63)
      throw IllegalArgumentException("Bucket name must be between 3 and 64 characters in length.  Given value: $name")

    if (!nameRegex.matches(name))
      throw IllegalArgumentException("Bucket names must begin and end with with a letter or number and may not contain any characters other than lowercase letters, numbers, '.' characters or '-' characters.")

    if (name.startsWith("xn--"))
      throw IllegalArgumentException("Bucket names must not begin with the prefix 'xn--'")

    if (name.endsWith("-s3alias"))
      throw IllegalArgumentException("Bucket names must not end with the suffix '-s3alias'")

    if (ipRegex.matches(name))
      throw IllegalArgumentException("Bucket names must not be formatted as an IP address.")
  }

  override fun toString() = name
}