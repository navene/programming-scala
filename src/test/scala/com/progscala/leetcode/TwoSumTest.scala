package com.progscala.leetcode

import org.junit.Assert._
import org.junit.Test

class TwoSumTest {

  @Test def `twoSum returns Indices of Numbers`: Unit = {
    val givenNumbers = Array(3, 2, 4)
    val target = 6
    val expectedIndex1 = 1
    val expectedIndex2 = 2

    val result = TwoSum.twoSum(givenNumbers, target)

    assertEquals(2, result.size)
    assertTrue(result.contains(expectedIndex1))
    assertTrue(result.contains(expectedIndex2))
  }

  @Test def `twoSum returns Indices when given number contains negative values`: Unit = {
    val givenNumbers = Array(-2, 3, 5, 7)
    val target = 3
    val expectedIndex1 = 0
    val expectedIndex2 = 2

    val result = TwoSum.twoSum(givenNumbers, target)

    assertEquals(2, result.size)
    assertTrue(result.contains(expectedIndex1))
    assertTrue(result.contains(expectedIndex2))
  }

  @Test def `twoSum returns correct indices when one of the given numbers is half of target`: Unit = {
    val givenNumbers = Array(3, 2, 4)
    val target = 6
    val expectedIndex1 = 1
    val expectedIndex2 = 2

    val result = TwoSum.twoSum(givenNumbers, target)

    assertEquals(2, result.size)
    assertTrue(result.contains(expectedIndex1))
    assertTrue(result.contains(expectedIndex2))
  }

  @Test def `twoSum returns indices when given numbers contains two halves of target`: Unit = {
    val givenNumbers = Array(3, 3)
    val target = 6
    val expectedIndex1 = 0
    val expectedIndex2 = 1

    val result = TwoSum.twoSum(givenNumbers, target)

    assertEquals(2, result.size)
    assertTrue(result.contains(expectedIndex1))
    assertTrue(result.contains(expectedIndex2))
  }

  @Test def `twoSum returns empty array when no numbers add up to given target`: Unit = {
    val givenNumbers = Array(2, 3, 5, 7)
    val target = 25

    val result = TwoSum.twoSum(givenNumbers, target)

    assertEquals(0, result.size)
  }

  @Test def `twoSum returns empty array when given Array of numbers is empty`: Unit = {
    val givenNumbers = Array.emptyIntArray
    val target = 8

    val result = TwoSum.twoSum(givenNumbers, target)

    assertEquals(0, result.size)
  }
}
