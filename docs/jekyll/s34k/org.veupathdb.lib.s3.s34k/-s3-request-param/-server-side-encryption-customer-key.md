---
title: ServerSideEncryptionCustomerKey
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k](../index.html)/[S3RequestParam](index.html)/[ServerSideEncryptionCustomerKey](-server-side-encryption-customer-key.html)



# ServerSideEncryptionCustomerKey



[jvm]\
const val [ServerSideEncryptionCustomerKey](-server-side-encryption-customer-key.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)



x-amz-server-side-encryption-customer-key



Specifies the customer-provided encryption key for Amazon S3 used to encrypt the data. This value is used to decrypt the object when recovering it and must match the one used when storing the data. The key must be appropriate for use with the algorithm specified in the x-amz-server-side-encryption-customer-algorithm header.




