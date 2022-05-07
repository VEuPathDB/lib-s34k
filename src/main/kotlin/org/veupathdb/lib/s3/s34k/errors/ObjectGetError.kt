package org.veupathdb.lib.s3.s34k.errors

import org.veupathdb.lib.s3.s34k.fields.BucketName

private inline fun err(bucket: BucketName, path: String) =
  "Failed to get object '$path' from bucket '$bucket'"