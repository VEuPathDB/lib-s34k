---
title: callback
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests.object](../index.html)/[S3ObjectGetParams](index.html)/[callback](callback.html)



# callback



[jvm]\
abstract var [callback](callback.html): ([S3StreamObject](../../org.veupathdb.lib.s3.s34k.response.object/-s3-stream-object/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?



Optional callback that will be executed on successful completion of the S3 operation.



This callback will be passed an [S3StreamObject](../../org.veupathdb.lib.s3.s34k.response.object/-s3-stream-object/index.html) request wrapping a stream over the contents of the target object.




