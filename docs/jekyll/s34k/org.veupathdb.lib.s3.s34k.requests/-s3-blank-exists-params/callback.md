---
title: callback
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests](../index.html)/[S3BlankExistsParams](index.html)/[callback](callback.html)



# callback



[jvm]\
abstract var [callback](callback.html): (exists: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?



Optional callback that will be executed on successful completion of the S3 operation.



This callback will be passed a boolean flag indicating whether the target bucket or object exists in the S3 store.




