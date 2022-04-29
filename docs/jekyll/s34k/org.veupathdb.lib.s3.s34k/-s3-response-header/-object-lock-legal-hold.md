---
title: ObjectLockLegalHold
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k](../index.html)/[S3ResponseHeader](index.html)/[ObjectLockLegalHold](-object-lock-legal-hold.html)



# ObjectLockLegalHold



[jvm]\
const val [ObjectLockLegalHold](-object-lock-legal-hold.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)



x-amz-object-lock-legal-hold



Specifies whether a legal hold is in effect for this object. This header is only returned if the requester has the s3:GetObjectLegalHold permission. This header is not returned if the specified version of this object has never had a legal hold applied. For more information about S3 Object Lock, see "Object Lock".




