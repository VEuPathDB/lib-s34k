---
title: ReplicationStatus
---
//[s34k](../../../index.html)/[org.veupathdb.lib.s3.s34k](../index.html)/[S3ResponseHeader](index.html)/[ReplicationStatus](-replication-status.html)



# ReplicationStatus



[jvm]\
const val [ReplicationStatus](-replication-status.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)



x-amz-replication-status



Amazon S3 can return this header if your request involves a bucket that is either a source or a destination in a replication rule.



In replication, you have a source bucket on which you configure replication and destination bucket or buckets where Amazon S3 stores object replicas. When you request an object (GetObject) or object metadata (HeadObject) from these buckets, Amazon S3 will return the x-amz-replication-status header in the response as follows:



- 
   **If requesting an object from the source bucket**, Amazon S3 will return the x-amz-replication-status header if the object in your request is eligible for replication. For example, suppose that in your replication configuration, you specify object prefix TaxDocs requesting Amazon S3 to replicate objects with key prefix TaxDocs. Any objects you upload with this key name prefix, for example TaxDocs/document1.pdf, are eligible for replication. For any object request with this key name prefix, Amazon S3 will return the x-amz-replication-status header with value PENDING, COMPLETED or FAILED indicating object replication status.
- 
   **If requesting an object from a destination bucket**, Amazon S3 will return the x-amz-replication-status header with value REPLICA if the object in your request is a replica that Amazon S3 created and there is no replica modification replication in progress.
- 
   **When replicating objects to multiple destination buckets**, the x-amz-replication-status header acts differently. The header of the source object will only return a value of COMPLETED when replication is successful to all destinations. The header will remain at value PENDING until replication has completed for all destinations. If one or more destinations fails replication the header will return FAILED.




For more information, see "Replication".



Valid Values:



- 
   COMPLETE
- 
   PENDING
- 
   FAILED
- 
   REPLICA





