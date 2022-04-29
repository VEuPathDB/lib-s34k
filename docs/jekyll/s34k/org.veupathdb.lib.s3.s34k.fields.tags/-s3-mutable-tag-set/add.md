---
title: add
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.fields.tags](../index.html)/[S3MutableTagSet](index.html)/[add](add.html)



# add



[jvm]\
abstract fun [add](add.html)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))



Adds the given tag to this [S3MutableTagSet](index.html).



## Throws


| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if the given tag name is greater than 128 characters in length. |




[jvm]\
abstract fun [add](add.html)(vararg tags: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))



Adds the given tags to this [S3MutableTagSet](index.html).



## Throws


| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if any of the given tag names are greater than 128 characters in length. |




[jvm]\
abstract fun [add](add.html)(tags: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)



Adds the tags from the [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) value to this [S3MutableTagSet](index.html).



## Throws


| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if any of the given tag names are greater than 128 characters in length. |



