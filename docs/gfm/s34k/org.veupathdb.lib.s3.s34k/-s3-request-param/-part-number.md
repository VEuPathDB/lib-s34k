//[s34k](../../../index.md)/[org.veupathdb.lib.s3.s34k](../index.md)/[S3RequestParam](index.md)/[PartNumber](-part-number.md)

# PartNumber

[jvm]\
const val [PartNumber](-part-number.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

partNumber

Part number of the object being read. This is a positive integer between 1 and 10,000. Effectively performs a 'ranged' GET request for the part specified. Useful for downloading just a part of an object.
