//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k](../index.md)/[S3RequestParam](index.md)/[ServerSideEncryptionCustomerKey](-server-side-encryption-customer-key.md)

# ServerSideEncryptionCustomerKey

[jvm]\
const val [ServerSideEncryptionCustomerKey](-server-side-encryption-customer-key.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

x-amz-server-side-encryption-customer-key

Specifies the customer-provided encryption key for Amazon S3 used to encrypt the data. This value is used to decrypt the object when recovering it and must match the one used when storing the data. The key must be appropriate for use with the algorithm specified in the x-amz-server-side-encryption-customer-algorithm header.
