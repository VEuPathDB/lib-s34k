---
title: objectExists
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.html)/[S3Bucket](index.html)/[objectExists](object-exists.html)



# objectExists



[jvm]\
abstract fun [objectExists](object-exists.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)



Tests for the existence of an object at the given [path](object-exists.html).



#### Return



true if an object exists at the given path, otherwise false.



## Parameters


jvm

| | |
|---|---|
| path | Path to the object to test for. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [objectExists](object-exists.html)(action: [S3ObjectExistsParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-exists-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)



Tests for the existence of an object with the operation configured by the given [action](object-exists.html).



#### Return



true if an object exists at the given path, otherwise false.



## Parameters


jvm

| | |
|---|---|
| action | Action to configure the S3 operation. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.html) | If the S3 operation parameters are missing required fields or otherwise incorrectly configured. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [objectExists](object-exists.html)(params: [S3ObjectExistsParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-exists-params/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)



Tests for the existence of an object with the operation configured by the given [params](object-exists.html).



#### Return



true if an object exists at the given path, otherwise false.



## Parameters


jvm

| | |
|---|---|
| params | S3 operation configuration. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.html) | If the S3 operation parameters are missing required fields or otherwise incorrectly configured. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |



