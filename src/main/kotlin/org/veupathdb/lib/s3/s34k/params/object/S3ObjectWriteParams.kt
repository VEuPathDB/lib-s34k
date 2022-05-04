package org.veupathdb.lib.s3.s34k.params.`object`

import org.veupathdb.lib.s3.s34k.params.S3RegionRequestParams
import org.veupathdb.lib.s3.s34k.params.S3TagCreateParams

/**
 * Parameter base for S3 object write operations.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface S3ObjectWriteParams : S3TagCreateParams, S3RegionRequestParams