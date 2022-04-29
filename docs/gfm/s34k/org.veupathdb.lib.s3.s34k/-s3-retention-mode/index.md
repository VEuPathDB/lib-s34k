//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k](../index.md)/[S3RetentionMode](index.md)

# S3RetentionMode

[jvm]\
enum [S3RetentionMode](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[S3RetentionMode](index.md)&gt; 

S3 Retention Modes

S3 Object Lock provides two retention modes:

- 
   Governance mode
- 
   Compliance mode

These retention modes apply different levels of protection to your objects. You can apply either retention mode to any object version that is protected by Object Lock.

In *governance* mode, users can't overwrite or delete an object version or alter its lock settings unless they have special permissions. With governance mode, you protect objects against being deleted by most users, but you can still grant some users permission to alter the retention settings or delete the object if necessary. You can also use governance mode to test retention-period settings before creating a compliance-mode retention period.

To override or remove governance-mode retention settings, a user must have the s3:BypassGovernanceRetention permission and must explicitly include x-amz-bypass-governance-retention:true as a request header with any request that requires overriding governance mode.

In *compliance* mode, a protected object version can't be overwritten or deleted by any user, including the root user in your AWS account. When an object is locked in compliance mode, its retention mode can't be changed, and its retention period can't be shortened. Compliance mode helps ensure that an object version can't be overwritten or deleted for the duration of the retention period.

**Note** Updating an object version's metadata, as occurs when you place or alter an Object Lock, doesn't overwrite the object version or reset its Last-Modified timestamp.

#### Author

Elizabeth Paige Harper https://github.com/Foxcapades

#### Since

v0.1.0

## Entries

| | |
|---|---|
| [Governance](-governance/index.md) | [jvm]<br>[Governance](-governance/index.md)() |
| [Compliance](-compliance/index.md) | [jvm]<br>[Compliance](-compliance/index.md)() |

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
| [name](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-s3-recursive-delete-phase/-list-objects/index.md#-372974862%2FProperties%2F-1216412040) | [jvm]<br>val [name](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-s3-recursive-delete-phase/-list-objects/index.md#-372974862%2FProperties%2F-1216412040): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ordinal](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-s3-recursive-delete-phase/-list-objects/index.md#-739389684%2FProperties%2F-1216412040) | [jvm]<br>val [ordinal](../../org.veupathdb.lib.s3.s34k.requests.bucket.recursive/-s3-recursive-delete-phase/-list-objects/index.md#-739389684%2FProperties%2F-1216412040): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
