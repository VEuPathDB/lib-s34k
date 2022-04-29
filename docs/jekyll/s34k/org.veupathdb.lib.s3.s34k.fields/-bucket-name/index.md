---
title: BucketName
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.fields](../index.html)/[BucketName](index.html)



# BucketName



[jvm]\
@[JvmInline](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-inline/index.html)



value class [BucketName](index.html)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

Validating bucket name wrapper.



Wraps a bucket name value and enforces the following validity rules:



- 
   Bucket names must be between 3 (min) and 63 (max) characters.
- 
   Bucket names must consist of only lowercase letters, numbers, dots (.), and hyphens (-).
- 
   Bucket names must begin and end with a letter or number.
- 
   Bucket names must not be formatted as an IP address (for example, 192.168.5.4).
- 
   Bucket names must not start with the prefix "xn--".
- 
   Bucket names must not end with the suffix "-s3alias".




If any of the above are true, then the creation of this type will fail with an [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html).



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Parameters


jvm

| | |
|---|---|
| name | Valid bucket name. |



## Throws


| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | If the input [name](name.html) value violates any of the bucket naming rules above. |


## Constructors


| | |
|---|---|
| [BucketName](-bucket-name.html) | [jvm]<br>fun [BucketName](-bucket-name.html)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Tests the input string and creates a new [BucketName](index.html) instance. |


## Types


| Name | Summary |
|---|---|
| [Companion](-companion/index.html) | [jvm]<br>object [Companion](-companion/index.html) |


## Functions


| Name | Summary |
|---|---|
| [toString](to-string.html) | [jvm]<br>open override fun [toString](to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |


## Properties


| Name | Summary |
|---|---|
| [name](name.html) | [jvm]<br>val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

