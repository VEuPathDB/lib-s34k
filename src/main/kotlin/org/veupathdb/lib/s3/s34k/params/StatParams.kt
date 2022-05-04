package org.veupathdb.lib.s3.s34k.params

import org.veupathdb.lib.s3.s34k.ObjectMeta

// TODO: Document me
interface StatParams : RegionRequestParams {

  // TODO: Document me
  var callback: ((ObjectMeta) -> Unit)?

}