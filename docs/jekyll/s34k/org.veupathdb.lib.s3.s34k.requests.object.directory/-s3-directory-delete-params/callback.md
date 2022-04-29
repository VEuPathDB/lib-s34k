---
title: callback
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests.object.directory](../index.html)/[S3DirectoryDeleteParams](index.html)/[callback](callback.html)



# callback



[jvm]\
abstract var [callback](callback.html): (deleted: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?



Optional callback that will be executed on successful completion of the S3 operation.



This callback will be passed a boolean flag indicating whether the directory existed before the delete operation was called.  true indicates the directory did exist but has now been deleted, false indicates the directory did not exist at the time the delete operation was executed.




