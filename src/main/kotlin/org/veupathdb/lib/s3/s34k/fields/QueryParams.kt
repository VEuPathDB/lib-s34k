package org.veupathdb.lib.s3.s34k.fields

import org.veupathdb.lib.s3.s34k.util.ListMap

/**
 * Map of query parameters being sent as part of an S3 operation.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.1.0
 */
interface QueryParams : ListMap<String, String>