---
title: plusAssign
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.fields.tags](../index.html)/[S3MutableTagSet](index.html)/[plusAssign](plus-assign.html)



# plusAssign



[jvm]\
abstract operator fun [plusAssign](plus-assign.html)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))



Adds the given tag to this [S3MutableTagSet](index.html).



## Throws


| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if the given tag name is greater than 128 characters in length. |



