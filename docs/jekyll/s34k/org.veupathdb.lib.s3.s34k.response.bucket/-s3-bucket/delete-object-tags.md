---
title: deleteObjectTags
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.response.bucket](../index.html)/[S3Bucket](index.html)/[deleteObjectTags](delete-object-tags.html)



# deleteObjectTags



[jvm]\
abstract fun [deleteObjectTags](delete-object-tags.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)



Deletes all the tags attached to the S3 object at the given [path](delete-object-tags.html).



#### Return



An [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html) containing the keys/values that were previously attached to the target object.  If the target object previously had no tags attached, this method will be empty.



## Parameters


jvm

| | |
|---|---|
| path | Path to the object whose tags should be deleted. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-object-not-found-exception/index.html) | If the target object does not exist. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [deleteObjectTags](delete-object-tags.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), vararg tags: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)

abstract fun [deleteObjectTags](delete-object-tags.html)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), tags: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)



Deletes only the specified target tags from the S3 object at the given [path](delete-object-tags.html).



This operation happens in 3 phases due to S3 not presently supporting targeted tag deletions:



1. 
   Fetch a list of all the tags presently on the target object.
2. 
   Delete all tags from the target object.
3. 
   Re-append the tags to the object that did not appear in the tag removal     list.




Any/all tags not specified in the list of tags for removal will be re-appended to the target object.



If one or more tags in the removal list, they will be ignored and will not appear in the output [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html).



#### Return



An [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html) containing the tags that were previously attached to the target object.  If any tags in the removal list were not attached to the object at the time this method was called, those tags will not appear in the returned tag map.



## Parameters


jvm

| | |
|---|---|
| path | Path to the object whose tags should be deleted. |
| tags | Tags to be removed from the object. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-object-not-found-exception/index.html) | If the target object does not exist. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [deleteObjectTags](delete-object-tags.html)(action: [S3ObjectTagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-tag-delete-params/index.html).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)



Deletes only the specified target tags from the S3 object at the object path configured by the given configuration [action](delete-object-tags.html).



This operation happens in 3 phases due to S3 not presently supporting targeted tag deletions:



1. 
   Fetch a list of all the tags presently on the target object.
2. 
   Delete all tags from the target object.
3. 
   Re-append the tags to the object that did not appear in the tag removal     list.




Any/all tags not specified in the list of tags for removal will be re-appended to the target object.



If one or more tags in the removal list, they will be ignored and will not appear in the output [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html).



#### Return



An [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html) containing the tags that were previously attached to the target object.  If any tags in the removal list were not attached to the object at the time this method was called, those tags will not appear in the returned tag map.



## Parameters


jvm

| | |
|---|---|
| action | Action used to configure this S3 operation. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.html) | If the path property is not set on the configured [S3ObjectTagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-tag-delete-params/index.html) instance. |
| [org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-object-not-found-exception/index.html) | If the target object does not exist. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |




[jvm]\
abstract fun [deleteObjectTags](delete-object-tags.html)(params: [S3ObjectTagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-tag-delete-params/index.html)): [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html)



Deletes only the specified target tags from the S3 object at the object path configured by the given configuration.



This operation happens in 3 phases due to S3 not presently supporting targeted tag deletions:



1. 
   Fetch a list of all the tags presently on the target object.
2. 
   Delete all tags from the target object.
3. 
   Re-append the tags to the object that did not appear in the tag removal     list.




Any/all tags not specified in the list of tags for removal will be re-appended to the target object.



If one or more tags in the removal list, they will be ignored and will not appear in the output [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html).



#### Return



An [S3TagMap](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-tag-map/index.html) containing the tags that were previously attached to the target object.  If any tags in the removal list were not attached to the object at the time this method was called, those tags will not appear in the returned tag map.



## Parameters


jvm

| | |
|---|---|
| params | S3 operation parameters. |



## Throws


| | |
|---|---|
| [org.veupathdb.lib.s3.s34k.errors.InvalidRequestConfigException](../../org.veupathdb.lib.s3.s34k.errors/-invalid-request-config-exception/index.html) | If the path property is not set on the configured [S3ObjectTagDeleteParams](../../org.veupathdb.lib.s3.s34k.requests.object/-s3-object-tag-delete-params/index.html) instance. |
| [org.veupathdb.lib.s3.s34k.errors.ObjectNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-object-not-found-exception/index.html) | If the target object does not exist. |
| [org.veupathdb.lib.s3.s34k.errors.BucketNotFoundException](../../org.veupathdb.lib.s3.s34k.errors/-bucket-not-found-exception/index.html) | If this bucket no longer exists. |
| [org.veupathdb.lib.s3.s34k.errors.S34kException](../../org.veupathdb.lib.s3.s34k.errors/-s34k-exception/index.html) | If an implementation specific exception is thrown. The implementation specific exception will be set to the thrown exception's 'cause' value. |



