package org.veupathdb.lib.s3.s34k.params.bucket

import org.junit.jupiter.api.*

@DisplayName("BucketName")
internal class BucketNameTest {

  @Nested
  @DisplayName("constructor(String)")
  inner class Constructor1 {

    @Nested
    @DisplayName("throws an exception when")
    inner class Throws{

      @Test
      @DisplayName("the input string is less than 3 characters in length")
      fun t1() {
        assertThrows<IllegalArgumentException> {
          BucketName("hi")
        }
      }

      @Test
      @DisplayName("the input string is greater than 63 characters in length")
      fun t2() {
        assertThrows<IllegalArgumentException> {
          BucketName("some string that happens to be longer than 63 characters in length")
        }
      }

      @Test
      @DisplayName("the input string begins with a dash")
      fun t3() {
        assertThrows<IllegalArgumentException> {
          BucketName("-hello")
        }
      }

      @Test
      @DisplayName("the input string begins with a dot")
      fun t4() {
        assertThrows<IllegalArgumentException> {
          BucketName(".hello")
        }
      }

      @Test
      @DisplayName("the input string begins with 'xn--'")
      fun t5() {
        assertThrows<IllegalArgumentException> {
          BucketName("xn--hello")
        }
      }

      @Test
      @DisplayName("the input string ends with -s3alias")
      fun t6() {
        assertThrows<IllegalArgumentException> {
          BucketName("hello-s3alias")
        }
      }

      @Test
      @DisplayName("the input string contains non-lowercase characters")
      fun t7() {
        assertThrows<IllegalArgumentException> {
          BucketName("helloHi")
        }
      }

      @Test
      @DisplayName("the input string contains non-alphanumeric characters other than dot or dash")
      fun t8() {
        assertThrows<IllegalArgumentException> {
          BucketName("hello*")
        }
      }

      @Test
      @DisplayName("the input string appears to be an IP address")
      fun t9() {
        assertThrows<IllegalArgumentException> {
          BucketName("0.0.0.0")
        }
      }
    }

    @Nested
    @DisplayName("returns a BucketName instance when")
    inner class Returns {

      @Test
      @DisplayName("the input string is at least 3 characters in length")
      fun t1() {
        assertDoesNotThrow {
          BucketName("yap")
        }
      }

      @Test
      @DisplayName("the input string is at most 63 characters in length")
      fun t2() {
        assertDoesNotThrow {
          BucketName("012345678901234567890123456789012345678901234567890123456789012")
        }
      }
    }
  }

  @Nested
  @DisplayName("of(String?)")
  inner class Of {

    @Nested
    @DisplayName("throws an exception when")
    inner class Throws{

      @Test
      @DisplayName("the input string is less than 3 characters in length")
      fun t1() {
        assertThrows<IllegalArgumentException> {
          BucketName.of("hi")
        }
      }

      @Test
      @DisplayName("the input string is greater than 63 characters in length")
      fun t2() {
        assertThrows<IllegalArgumentException> {
          BucketName.of("some string that happens to be longer than 63 characters in length")
        }
      }

      @Test
      @DisplayName("the input string begins with a dash")
      fun t3() {
        assertThrows<IllegalArgumentException> {
          BucketName.of("-hello")
        }
      }

      @Test
      @DisplayName("the input string begins with a dot")
      fun t4() {
        assertThrows<IllegalArgumentException> {
          BucketName.of(".hello")
        }z
      }

      @Test
      @DisplayName("the input string begins with 'xn--'")
      fun t5() {
        assertThrows<IllegalArgumentException> {
          BucketName.of("xn--hello")
        }
      }

      @Test
      @DisplayName("the input string ends with -s3alias")
      fun t6() {
        assertThrows<IllegalArgumentException> {
          BucketName.of("hello-s3alias")
        }
      }

      @Test
      @DisplayName("the input string contains non-lowercase characters")
      fun t7() {
        assertThrows<IllegalArgumentException> {
          BucketName.of("helloHi")
        }
      }

      @Test
      @DisplayName("the input string contains non-alphanumeric characters other than dot or dash")
      fun t8() {
        assertThrows<IllegalArgumentException> {
          BucketName.of("hello*")
        }
      }

      @Test
      @DisplayName("the input string appears to be an IP address")
      fun t9() {
        assertThrows<IllegalArgumentException> {
          BucketName.of("0.0.0.0")
        }
      }

      @Test
      @DisplayName("the input string is null")
      fun t10() {
        assertThrows<IllegalArgumentException> {
          BucketName.of(null)
        }
      }
    }
  }
}