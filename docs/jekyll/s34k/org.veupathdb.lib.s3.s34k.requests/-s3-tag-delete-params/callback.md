---
title: callback
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.requests](../index.html)/[S3TagDeleteParams](index.html)/[callback](callback.html)



# callback



[jvm]\
abstract var [callback](callback.html): ([S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?



Optional callback that will be executed on successful completion of the S3 operation.



This callback will be passed an [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html) instance containing the tags that were deleted from the S3 store.  If a target tag did not exist at the time the delete request was made, it will not appear in this tag map.




