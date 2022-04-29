---
title: get
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k.fields.headers](../index.html)/[S3Headers](index.html)/[get](get.html)



# get



[jvm]\
abstract operator fun [get](get.html)(header: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;?



Returns a list of header values stored under the given header key.



If no such key exists, null will be returned.



#### Return



Either a list of header values for the given header key, or null if no such entry exists in this header map.




