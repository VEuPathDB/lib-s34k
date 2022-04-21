package org.veupathdb.lib.s3.s34k

import org.veupathdb.lib.s3.s34k.fields.BucketName

interface S3BucketList : Iterable<S3Bucket> {

  val size: Int

  val isEmpty: Boolean

  val isNotEmpty: Boolean

  operator fun get(name: BucketName): S3Bucket?

  operator fun get(index: Int): S3Bucket

  fun toMap(): Map<BucketName, S3Bucket>

  fun toList(): List<S3Bucket>
}