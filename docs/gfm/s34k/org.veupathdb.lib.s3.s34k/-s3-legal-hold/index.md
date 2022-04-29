//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k](../index.md)/[S3LegalHold](index.md)

# S3LegalHold

[jvm]\
enum [S3LegalHold](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[S3LegalHold](index.md)&gt; 

S3 Legal Holds

With Object Lock you can also place a legal hold on an object version. Like a retention period, a legal hold prevents an object version from being overwritten or deleted. However, a legal hold doesn't have an associated retention period and remains in effect until removed. Legal holds can be freely placed and removed by any user who has the s3:PutObjectLegalHold permission.

Legal holds are independent of retention periods. As long as the bucket that contains the object has Object Lock enabled, you can place and remove legal holds regardless of whether the specified object version has a retention period set. Placing a legal hold on an object version doesn't affect the retention mode or retention period for that object version.

For example, suppose that you place a legal hold on an object version while the object version is also protected by a retention period. If the retention period expires, the object doesn't lose its WORM protection. Rather, the legal hold continues to protect the object until an authorized user explicitly removes it. Similarly, if you remove a legal hold while an object version has a retention period in effect, the object version remains protected until the retention period expires.

To use Object Lock, you must enable it for a bucket. You can also optionally configure a default retention mode and period that applies to new objects that are placed in the bucket.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Entries

| | |
|---|---|
| [Off](-off/index.md) | [jvm]<br>[Off](-off/index.md)() |
| [On](-on/index.md) | [jvm]<br>[On](-on/index.md)() |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [jvm]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toString](to-string.md) | [jvm]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Properties

| Name | Summary |
|---|---|
| [asBool](as-bool.md) | [jvm]<br>val [asBool](as-bool.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [name](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-s3-recursive-delete-phase/-list-objects/index.md#-372974862%2FProperties%2F-1216412040) | [jvm]<br>val [name](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-s3-recursive-delete-phase/-list-objects/index.md#-372974862%2FProperties%2F-1216412040): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ordinal](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-s3-recursive-delete-phase/-list-objects/index.md#-739389684%2FProperties%2F-1216412040) | [jvm]<br>val [ordinal](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-s3-recursive-delete-phase/-list-objects/index.md#-739389684%2FProperties%2F-1216412040): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
