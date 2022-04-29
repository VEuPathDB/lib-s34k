---
title: S3Config
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k](../index.html)/[S3Config](index.html)



# S3Config



[jvm]\
data class [S3Config](index.html)(url: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), port: [UShort](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-short/index.html), secure: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), accessKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), secretKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), region: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)

S3 Client Configuration



#### Author



Elizabeth Paige Harper https://github.com/Foxcapades



#### Since



v0.1.0



## Constructors


| | |
|---|---|
| [S3Config](-s3-config.html) | [jvm]<br>fun [S3Config](-s3-config.html)(url: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = "127.0.0.1", port: [UShort](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-short/index.html), secure: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, accessKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), secretKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), region: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |


## Functions


| Name | Summary |
|---|---|
| [toString](to-string.html) | [jvm]<br>open override fun [toString](to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |


## Properties


| Name | Summary |
|---|---|
| [accessKey](access-key.html) | [jvm]<br>val [accessKey](access-key.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Access token/key used to authenticate with the S3 service. |
| [port](port.html) | [jvm]<br>val [port](port.html): [UShort](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-short/index.html)<br>Port for the S3 endpoint. |
| [region](region.html) | [jvm]<br>val [region](region.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null<br>Default region to use if not specified in operation specific params. |
| [secretKey](secret-key.html) | [jvm]<br>val [secretKey](secret-key.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Secret token/key used to authenticate with the S3 service. |
| [secure](secure.html) | [jvm]<br>val [secure](secure.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true<br>Whether HTTPS should be used instead of plain HTTP. |
| [url](url.html) | [jvm]<br>val [url](url.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>URL to the S3 endpoint. |

