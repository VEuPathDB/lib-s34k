---
title: getObject
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.html)/[S3Bucket](index.html)/[getObject](get-object.html)



# getObject



[jvm]\
abstract fun [getObject](get-object.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3StreamObject](../../org.veupathdb.lib.s3.s34k.response.object/-s3-stream-object/index.html)



Fetches a target object from this bucket and returns an object reference with a stream over the contents of the remote object.



#### Return



An object reference to the target object, containing a stream over the contents of that object.



## Parameters


jvm

| | |
|---|---|
| path | Path to the target object. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-object-not-found-exception/index.html) | If the target object does not exist. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [getObject](get-object.html)(action: [S3ObjectGetParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-get-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3StreamObject](../../org.veupathdb.lib.s3.s34k.response.object/-s3-stream-object/index.html)



Fetches the configured target object from this bucket and returns an object reference with a stream over the contents of the remote object.



#### Return



An object reference to the target object, containing a stream over the contents of that object.



## Parameters


jvm

| | |
|---|---|
| action | Action used to configure this S3 operation. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.html) | If the path property is not set on the [S3ObjectGetParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-get-params/index.html) instance. |
| [org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-object-not-found-exception/index.html) | If the target object does not exist. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [getObject](get-object.html)(params: [S3ObjectGetParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-get-params/index.html)): [S3StreamObject](../../org.veupathdb.lib.s3.s34k.response.object/-s3-stream-object/index.html)



Fetches the configured target object from this bucket and returns an object reference with a stream over the contents of the remote object.



#### Return



An object reference to the target object, containing a stream over the contents of that object.



## Parameters


jvm

| | |
|---|---|
| params | S3 operation parameters. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.html) | If the path property is not set on the [S3ObjectGetParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-get-params/index.html) instance. |
| [org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-object-not-found-exception/index.html) | If the target object does not exist. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |



