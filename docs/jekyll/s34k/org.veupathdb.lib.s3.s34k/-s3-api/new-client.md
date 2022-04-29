---
title: newClient
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k](../index.html)/[S3Api](index.html)/[newClient](new-client.html)



# newClient



[jvm]\




@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)



fun [newClient](new-client.html)(config: [S3Config](../-s3-config/index.html)): [S3Client](../-s3-client/index.html)



Gets a new [S3Client](../-s3-client/index.html) instance configured with the given [S3Config](../-s3-config/index.html) value.



Clients are loaded dynamically from the first implementing library found on the classpath.



#### Return



A newly created [S3Client](../-s3-client/index.html) instance.



## Parameters


jvm

| | |
|---|---|
| config | Configuration for the new client instance. |



## Throws


| | |
|---|---|
| [kotlin.RuntimeException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-runtime-exception/index.html) | if no implementing library was found on the classpath. |



