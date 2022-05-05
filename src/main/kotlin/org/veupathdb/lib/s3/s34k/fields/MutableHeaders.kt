package org.veupathdb.lib.s3.s34k.fields

import org.veupathdb.lib.s3.s34k.util.MutableListMap

/**
 * Mutable map of headers being sent as part of an S3 operation request.
 *
 * Implementations of this interface should be thread safe.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
interface MutableHeaders : MutableListMap<String, String>, Headers {
  override fun toImmutable(): Headers
}