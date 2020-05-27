package com.progscala.leetcode

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

object TwoSum {

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val valuesWithIndex = nums.zipWithIndex
    val valuesWithIndexAsMap = nums.zipWithIndex.toMap
    valuesWithIndex.collectFirst {
      case (value, index)
        if valuesWithIndexAsMap.get(target - value).exists(_ != index) =>
        Array(index, valuesWithIndexAsMap(target - value))
    }.getOrElse(Array.empty)
  }

}
