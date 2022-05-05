package org.veupathdb.lib.s3.s34k.util

/**
 * Mutable version of the immutable type [ListMap]
 *
 * Implementations of this interface should be thread safe.
 *
 * @param K Type of the keys in this [ListMap]
 *
 * @param V Type of the values in the lists in this [ListMap]
 *
 * @author Elizabeth Paige Harper [https://github.com/Foxcapades]
 *
 * @since  v0.3.0
 */
interface MutableListMap<K, V> : ListMap<K, V> {

  /**
   * Adds the given value to this [MutableListMap].
   *
   * If the given [key] already exists in this map, the given [value] will be
   * appended to the list at that [key].
   *
   * **Example**
   * ```
   * listMap == {
   *   "foo" = ["bar", "fizz", "buzz"]
   * }
   *
   * key   == "foo"
   * value == "happy"
   *
   * listMap.add(key, value)
   *
   * listMap == {
   *   "foo" = ["bar", "fizz", "buzz", "happy"]
   * }
   * ```
   *
   * @param key Key of the value to add.
   *
   * @param value Value to add.
   */
  fun add(key: K, value: V)

  /**
   * Adds the given values to this [MutableListMap].
   *
   * If the given [key] already exists in this map, the given [values] will be
   * appended to the list at that [key].
   *
   * **Example**
   * ```
   * listMap == {
   *   "foo" = ["bar", "fizz", "buzz"]
   * }
   *
   * key    == "foo"
   * values == ["happy", "sad"]
   *
   * listMap.add(key, values)
   *
   * listMap == {
   *   "foo" = ["bar", "fizz", "buzz", "happy", "sad"]
   * }
   * ```
   *
   * @param key Key of the value to add.
   *
   * @param values Values to add.
   */
  fun add(key: K, vararg values: V)

  /**
   * Adds the given values to this [MutableListMap].
   *
   * If the given [key] already exists in this map, the given [values] will be
   * appended to the list at that [key].
   *
   * **Example**
   * ```
   * listMap == {
   *   "foo" = ["bar", "fizz", "buzz"]
   * }
   *
   * key    == "foo"
   * values == ["happy", "sad"]
   *
   * listMap.add(key, values)
   *
   * listMap == {
   *   "foo" = ["bar", "fizz", "buzz", "happy", "sad"]
   * }
   * ```
   *
   * @param key Key of the value to add.
   *
   * @param values Values to add.
   */
  fun add(key: K, values: Iterable<V>)

  /**
   * Adds the given values to this [MutableListMap].
   *
   * If any key in the given [Map] overlaps with a key in this [MutableListMap],
   * the values in the input map will be appended to the list at the overlapping
   * key in this map.
   *
   * **Example**
   * ```
   * listMap == {
   *   "foo" = ["bar", "fizz", "buzz"]
   * }
   *
   * input == {
   *   "foo" = ["happy", "sad"]
   * }
   *
   * listMap.add(input)
   *
   * listMap == {
   *   "foo" = ["bar", "fizz", "buzz", "happy", "sad"]
   * }
   * ```
   *
   * @param values [Map] of values to add to this [MutableListMap]
   */
  fun add(values: Map<K, Iterable<V>>)

  /**
   * Sets the given value to this [MutableListMap].
   *
   * If the given [key] already exists in this map it will be overwritten with
   * a new list containing only the given value.
   *
   * **Example**
   * ```
   * listMap == {
   *   "foo" = ["bar", "fizz", "buzz"]
   * }
   *
   * key   == "foo"
   * value == "happy"
   *
   * listMap.add(key, value)
   *
   * listMap == {
   *   "foo" = ["happy"]
   * }
   * ```
   *
   * @param key Key of the value to add.
   *
   * @param value Value to add.
   */
  fun set(key: K, value: V)

  /**
   * Sets the given values to this [MutableListMap].
   *
   * If the given [key] already exists in this map, it will be overwritten with
   * the given array of values.
   *
   * **Example**
   * ```
   * listMap == {
   *   "foo" = ["bar", "fizz", "buzz"]
   * }
   *
   * key    == "foo"
   * values == ["happy", "sad"]
   *
   * listMap.add(key, values)
   *
   * listMap == {
   *   "foo" = ["happy", "sad"]
   * }
   * ```
   *
   * @param key Key of the value to add.
   *
   * @param values Values to add.
   */
  fun set(key: K, vararg values: V)

  /**
   * Sets the given values to this [MutableListMap].
   *
   * If the given [key] already exists in this map, it will be overwritten with
   * the given collection of values.
   *
   * **Example**
   * ```
   * listMap == {
   *   "foo" = ["bar", "fizz", "buzz"]
   * }
   *
   * key    == "foo"
   * values == ["happy", "sad"]
   *
   * listMap.add(key, values)
   *
   * listMap == {
   *   "foo" = ["happy", "sad"]
   * }
   * ```
   *
   * @param key Key of the value to add.
   *
   * @param values Values to add.
   */
  fun set(key: K, values: Iterable<V>)

  /**
   * Sets the given values to this [MutableListMap].
   *
   * If any key in the given [Map] overlaps with a key in this [MutableListMap],
   * the values in this [MutableListMap] will be replaced by value in the input
   * map the list at the overlapping key.
   *
   * **Example**
   * ```
   * listMap == {
   *   "foo" = ["bar", "fizz", "buzz"]
   * }
   *
   * input == {
   *   "foo" = ["happy", "sad"]
   * }
   *
   * listMap.add(input)
   *
   * listMap == {
   *   "foo" = ["happy", "sad"]
   * }
   * ```
   *
   * @param values [Map] of values to add to this [MutableListMap]
   */
  fun set(values: Map<K, Iterable<V>>)

  /**
   * Creates and returns an immutable [ListMap] copy of this [MutableListMap].
   *
   * @return Immutable [ListMap] copy of this instance.
   */
  fun toImmutable(): ListMap<K, V>
}