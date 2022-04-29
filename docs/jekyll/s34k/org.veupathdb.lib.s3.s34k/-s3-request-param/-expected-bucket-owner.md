---
title: ExpectedBucketOwner
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k](../index.html)/[S3RequestParam](index.html)/[ExpectedBucketOwner](-expected-bucket-owner.html)



# ExpectedBucketOwner



[jvm]\
const val [ExpectedBucketOwner](-expected-bucket-owner.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)



x-amz-expected-bucket-owner



The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code 403 Forbidden (access denied).




