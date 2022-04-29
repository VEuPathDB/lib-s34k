---
title: callback
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests.object](../index.html)/[S3ObjectDeleteParams](index.html)/[callback](callback.html)



# callback



[jvm]\
abstract var [callback](callback.html): ([Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?



Optional callback that will be executed on successful completion of the S3 operation.



This callback will be passed a boolean flag indicating whether the file was deleted.  true means the file previously existed, and was deleted. false means the file did not exist at the time the request was made.




