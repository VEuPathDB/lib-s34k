package org.veupathdb.lib.s3.s34k

import org.veupathdb.lib.s3.s34k.fields.tags.S3TagMap
import org.veupathdb.lib.s3.s34k.requests.S3TagCreateParams
import org.veupathdb.lib.s3.s34k.requests.S3TagDeleteParams
import org.veupathdb.lib.s3.s34k.requests.S3TagGetParams

interface S3TagManager {

  // region Size

  fun count(): Int

  // endregion Size

  // region Contains

  operator fun contains(key: String): Boolean

  // endregion Contains

  // region Put

  fun put(key: String, value: String)

  fun put(vararg tags: S3Tag)

  fun put(vararg tags: Pair<String, String>)

  fun put(tags: Iterable<S3Tag>)

  fun put(tags: Map<String, String>)

  fun put(tags: S3TagMap)

  fun put(action: S3TagCreateParams.() -> Unit)

  fun put(params: S3TagCreateParams)

  operator fun set(key: String, value: String)

  // endregion Put

  // region Get

  fun getAll(): S3TagMap

  operator fun get(key: String): S3Tag?

  fun get(vararg keys: String): S3TagMap

  fun get(keys: Iterable<String>): S3TagMap

  fun get(action: S3TagGetParams.() -> Unit): S3TagMap

  fun get(params: S3TagGetParams): S3TagMap

  // endregion Get

  // region Delete

  fun deleteAll()

  fun delete(key: String)

  fun delete(vararg keys: String)

  fun delete(keys: Iterable<String>)

  fun delete(action: S3TagDeleteParams.() -> Unit)

  fun delete(params: S3TagDeleteParams)

  // endregion Delete
}