package com.progscala.leetcode

import com.progscala.leetcode.util.ListNode

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
object AddTwoNumbers {

  def addTwoNumbers(list1: ListNode, list2: ListNode): ListNode = {
    def addTwoNumbersImpl(list1: ListNode, list2: ListNode, carry: Int = 0): ListNode = {
      val list1Value = if(list1 != null) list1.x else 0
      val list2Value = if(list2 != null) list2.x else 0
      val sum = carry + list1Value + list2Value

      val nextListNode1 = if (list1 != null) list1.next else null
      val nextListNode2 = if (list2 != null) list2.next else null

      if (sum >= 10 || nextListNode1 != null || nextListNode2 != null) {
        new ListNode(sum % 10, addTwoNumbersImpl(nextListNode1, nextListNode2, sum / 10))
      } else {
        new ListNode(sum % 10)
      }
    }
    addTwoNumbersImpl(list1, list2)
  }

}
