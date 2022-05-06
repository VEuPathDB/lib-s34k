package org.veupathdb.lib.s3.s34k.fields

@JvmInline
value class PageSize(val value: UShort) {
  init {
    if (value > 1000u) {
      throw IllegalArgumentException("Page size cannot be greater than 1000")
    }
  }

  fun toInt() = value.toInt()

  companion object {
    fun of(value: Int) =
      if (value < 1)
        throw IllegalArgumentException("Page size cannot be less than 1")
      else if (value > 1000)
        throw IllegalArgumentException("Page size cannot be greater than 1000")
      else
        PageSize(value.toUShort())
  }
}