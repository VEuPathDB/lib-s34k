---
title: statObject
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.html)/[S3Bucket](index.html)/[statObject](stat-object.html)



# statObject



[jvm]\
abstract fun [statObject](stat-object.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3ObjectMeta](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-meta/index.html)



Fetches metadata for the object in this bucket at the given [path](stat-object.html).



#### Return



Metadata about the specified object.



## Parameters


jvm

| | |
|---|---|
| path | Path to the object whose metadata should be fetched. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-object-not-found-exception/index.html) | If the target object does not exist. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [statObject](stat-object.html)(action: [S3ObjectStatParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-stat-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3ObjectMeta](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-meta/index.html)



Fetches metadata for the object in this bucket at the configured path.



#### Return



Metadata about the specified object.



## Parameters


jvm

| | |
|---|---|
| action | Action used to configure the S3 operation parameters. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.html) | If the S3 operation parameters are missing required fields or otherwise incorrectly configured. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-object-not-found-exception/index.html) | If the target object does not exist. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [statObject](stat-object.html)(params: [S3ObjectStatParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-stat-params/index.html)): [S3ObjectMeta](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object-meta/index.html)



Fetches metadata for the object in this bucket at the configured path.



#### Return



Metadata about the specified object.



## Parameters


jvm

| | |
|---|---|
| params | S3 operation parameters. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.html) | If the S3 operation parameters are missing required fields or otherwise incorrectly configured. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-object-not-found-exception/index.html) | If the target object does not exist. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |



