package org.veupathdb.lib.s3.s34k

interface S3ClientProvider {
  fun new(config: S3Config): S3Client
}