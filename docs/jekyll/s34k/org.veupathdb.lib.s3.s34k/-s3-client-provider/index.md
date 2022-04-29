---
title: S3ClientProvider
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k](../index.html)/[S3ClientProvider](index.html)



# S3ClientProvider



[jvm]\
interface [S3ClientProvider](index.html)

S3 Client Provider



Factory/provider for creating [S3Client](../-s3-client/index.html) instances.



This is the entrypoint for specific implementations of the S34K API.



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Functions


| Name | Summary |
|---|---|
| [new](new.html) | [jvm]<br>abstract fun [new](new.html)(config: [S3Config](../-s3-config/index.html)): [S3Client](../-s3-client/index.html)<br>Provides a new [S3Client](../-s3-client/index.html) instance, configured by the passed [S3Config](../-s3-config/index.html) instance. |

