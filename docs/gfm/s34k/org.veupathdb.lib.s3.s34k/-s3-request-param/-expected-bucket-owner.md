//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k](../index.md)/[S3RequestParam](index.md)/[ExpectedBucketOwner](-expected-bucket-owner.md)

# ExpectedBucketOwner

[jvm]\
const val [ExpectedBucketOwner](-expected-bucket-owner.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

x-amz-expected-bucket-owner

The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code 403 Forbidden (access denied).
