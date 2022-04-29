---
title: touchObject
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.html)/[S3Bucket](index.html)/[touchObject](touch-object.html)



# touchObject



[jvm]\
abstract fun [touchObject](touch-object.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.html)



Creates an empty object at the given [path](touch-object.html).



#### Return



An [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.html) instance wrapping the created empty object.



## Parameters


jvm

| | |
|---|---|
| path | Path to the empty object to create. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [touchObject](touch-object.html)(action: [S3ObjectTouchParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-touch-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.html)



Creates an empty object at the target path with the operation configured by the given action.



#### Return



An [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.html) instance wrapping the created empty object.



## Parameters


jvm

| | |
|---|---|
| action | Action used to configure the S3 operation. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.html) | If the S3 operation parameters are missing required fields or otherwise incorrectly configured. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [touchObject](touch-object.html)(params: [S3ObjectTouchParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-touch-params/index.html)): [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.html)



Creates an empty object at the target path with the operation configured by the given params.



#### Return



An [S3Object](../../org.veupathdb.lib.s3.s34k.response.object/-s3-object/index.html) instance wrapping the created empty object.



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
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |



