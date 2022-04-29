---
title: putObjectTags
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.html)/[S3Bucket](index.html)/[putObjectTags](put-object-tags.html)



# putObjectTags



[jvm]\
abstract fun [putObjectTags](put-object-tags.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), vararg tags: [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)



Attaches the given key/value pairs as tags onto the target object.



## Parameters


jvm

| | |
|---|---|
| path | Path to the target object onto which the tags should be assigned. |
| tags | List of key/value pairs that will be assigned to the target object. |



## Throws


| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | If any of the given pairs of tags fail to meet the validation requirements outlined in the [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html) documentation. |
| [org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-object-not-found-exception/index.html) | If the target object does not exist. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [putObjectTags](put-object-tags.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), vararg tags: [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html))

abstract fun [putObjectTags](put-object-tags.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), tags: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html)&gt;)



Attaches the given [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html)s onto the target object.



## Parameters


jvm

| | |
|---|---|
| path | Path to the target object onto which the tags should be assigned. |
| tags | List of [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html) pairs that will be assigned to the target object. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-object-not-found-exception/index.html) | If the target object does not exist. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [putObjectTags](put-object-tags.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), tags: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)



Attaches the key/value pairs in the given map as tags onto the target object.



## Parameters


jvm

| | |
|---|---|
| path | Path to the target object onto which the tags should be assigned. |
| tags | Map\ of key/value pairs that will be assigned to the target object. |



## Throws


| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | If any of the key/value pairs of in the given map fail to meet the validation requirements outlined in the [S3Tag](../../org.veupathdb.lib.s3.s34k/-s3-tag/index.html) documentation. |
| [org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-object-not-found-exception/index.html) | If the target object does not exist. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [putObjectTags](put-object-tags.html)(action: [S3ObjectTagCreateParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-tag-create-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))



Attaches the configured tags to the target object.



## Parameters


jvm

| | |
|---|---|
| action | Action used to configure the S3 operation. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.html) | If the S3 operation parameters are missing required fields or otherwise incorrectly configured. |
| [org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-object-not-found-exception/index.html) | If the target object does not exist. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [putObjectTags](put-object-tags.html)(params: [S3ObjectTagCreateParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-tag-create-params/index.html))



Attaches the configured tags to the target object.



## Parameters


jvm

| | |
|---|---|
| params | S3 operation parameters. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.html) | If the S3 operation parameters are missing required fields or otherwise incorrectly configured. |
| [org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-object-not-found-exception/index.html) | If the target object does not exist. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |



