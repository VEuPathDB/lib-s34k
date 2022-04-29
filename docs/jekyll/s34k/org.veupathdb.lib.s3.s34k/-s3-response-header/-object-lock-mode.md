---
title: ObjectLockMode
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k](../index.html)/[S3ResponseHeader](index.html)/[ObjectLockMode](-object-lock-mode.html)



# ObjectLockMode



[jvm]\
const val [ObjectLockMode](-object-lock-mode.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)



x-amz-object-lock-mode



The Object Lock mode, if any, that's in effect for this object. This header is only returned if the requester has the s3:GetObjectRetention permission. For more information about S3 Object Lock, see "Object Lock".



Valid Values:



- 
   GOVERNANCE
- 
   COMPLIANCE





