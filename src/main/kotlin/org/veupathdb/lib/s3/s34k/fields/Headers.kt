package org.veupathdb.lib.s3.s34k.fields

import org.veupathdb.lib.s3.s34k.util.ListMap

/**
 * Map of headers being sent to or returned from an S3 operation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
interface Headers : ListMap<String, String>