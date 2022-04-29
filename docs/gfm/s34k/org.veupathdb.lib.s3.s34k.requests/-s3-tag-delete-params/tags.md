//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k.requests](../index.md)/[S3TagDeleteParams](index.md)/[tags](tags.md)

# tags

[jvm]\
abstract val [tags](tags.md): [S3MutableTagSet](../../org.veupathdb.lib.s3.s34k.fields.tags/-s3-mutable-tag-set/index.md)

Set of tags to delete from the target bucket.

If [allTags](all-tags.md) is true, this set will be ignored.

If [allTags](all-tags.md) is false, only the tags in this set will be deleted.  If this list is empty, nothing will be deleted.
