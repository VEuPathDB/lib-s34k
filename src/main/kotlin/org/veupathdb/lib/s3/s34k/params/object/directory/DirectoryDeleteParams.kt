package org.veupathdb.lib.s3.s34k.params.`object`.directory

import org.veupathdb.lib.s3.s34k.fields.MutableHeaders
import org.veupathdb.lib.s3.s34k.fields.MutableQueryParams
import org.veupathdb.lib.s3.s34k.params.RegionRequestParams

/**
 * Directory deletion request parameters.
 *
 * This is a 'complex operation' in that it happens in 2 independently
 * configurable phases:
 *
 * 1. List all objects with the target 'directory' prefix
 * 2. Delete only the located objects.
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since v0.1.0
 */
interface DirectoryDeleteParams : RegionRequestParams {

  /**
   * Global headers that will be applied to all phases of the operation.
   *
   * If there is a conflict between a global header and a phase specific header,
   * the phase specific header will be used.
   *
   * This is done rather than merging the 2 sets of headers to prevent the
   * creation of invalid headers or otherwise confusing behavior
   *
   * If both sets of headers are desired, set the headers on the phase specific
   * header set.
   */
  override val headers: MutableHeaders

  /**
   * Global query params that will be applied to all phases of the operation.
   *
   * If there is a conflict between a global query param and a phase specific
   * query param, the phase specific query param will be used.
   *
   * This is done rather than merging the 2 sets of query to prevent possibly
   * confusing behavior.
   *
   * If both sets of query params are desired, set the query params on the phase
   * specific query param set.
   */
  override val queryParams: MutableQueryParams

  /**
   * Optional callback that will be executed on successful completion of the
   * S3 operation.
   */
  var callback: (() -> Unit)?

  /**
   * Parameters specific to the object list phase of the directory delete
   * operation.
   */
  val listParams: DDListParams

  /**
   * Parameters specific to the bulk object delete phase of the directory delete
   * operation.
   */
  val deleteParams: DDDeleteParams
}