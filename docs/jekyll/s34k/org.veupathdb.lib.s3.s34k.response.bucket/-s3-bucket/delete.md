---
title: delete
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.html)/[S3Bucket](index.html)/[delete](delete.html)



# delete



[jvm]\
abstract fun [delete](delete.html)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)



Deletes this bucket.



#### Return



Whether the bucket was deleted.  true if the bucket previously existed and has been deleted, false if the bucket did not exist.



## See also


jvm

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.response.bucket.S3Bucket](delete-recursive.html) |  |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotEmptyException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-empty-exception/index.html) | If this bucket is not empty and must be cleared before deletion. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [delete](delete.html)(action: [S3DeleteRequestParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-delete-request-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)



Deletes this bucket with the operation configured by the given action.



#### Return



Whether the bucket was deleted.  true if the bucket previously existed and has been deleted, false if the bucket did not exist.



## See also


jvm

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.response.bucket.S3Bucket](delete-recursive.html) |  |



## Parameters


jvm

| | |
|---|---|
| action | Action used to configure the S3 operation. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.html) | If the S3 operation parameters are missing required fields or otherwise incorrectly configured. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotEmptyException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-empty-exception/index.html) | If this bucket is not empty and must be cleared before deletion. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [delete](delete.html)(params: [S3DeleteRequestParams](../../org.veupathdb.lib.s3.s34k.requests/-s3-delete-request-params/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)



Deletes this bucket with the operation configured by the given params.



#### Return



Whether the bucket was deleted.  true if the bucket previously existed and has been deleted, false if the bucket did not exist.



## See also


jvm

| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.response.bucket.S3Bucket](delete-recursive.html) |  |



## Parameters


jvm

| | |
|---|---|
| params | S3 operation parameters. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.html) | If the S3 operation parameters are missing required fields or otherwise incorrectly configured. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotEmptyException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-empty-exception/index.html) | If this bucket is not empty and must be cleared before deletion. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |



