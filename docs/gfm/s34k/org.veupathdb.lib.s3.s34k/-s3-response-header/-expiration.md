//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k](../index.md)/[S3ResponseHeader](index.md)/[Expiration](-expiration.md)

# Expiration

[jvm]\
const val [Expiration](-expiration.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

x-amz-expiration

If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It includes the expiry-date and rule-id key-value pairs providing object expiration information. The value of the rule-id is URL-encoded.
