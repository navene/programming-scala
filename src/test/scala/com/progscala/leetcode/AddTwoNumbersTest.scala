package com.progscala.leetcode

import com.progscala.leetcode.util.ListNode
import org.junit.{Assert, Test}

class AddTwoNumbersTest {

  @Test def `Add two single digit numbers and their sum less than 10`: Unit = {
    val number1 = BigInt(5)
    val number2 = BigInt(2)

    val result = AddTwoNumbers.addTwoNumbers(toListNode(number1), toListNode(number2))

    Assert.assertEquals(number1 + number2, toNumber(result))
  }

  @Test def `Add two single digit numbers whose sum greater than 10`: Unit = {
    val number1 = BigInt(7)
    val number2 = BigInt(8)

    val result = AddTwoNumbers.addTwoNumbers(toListNode(number1), toListNode(number2))

    Assert.assertEquals(number1 + number2, toNumber(result))
  }

  @Test def `Add two multiple digit numbers of equal length`: Unit = {
    val number1 = BigInt(2135)
    val number2 = BigInt(7865)

    val result = AddTwoNumbers.addTwoNumbers(toListNode(number1), toListNode(number2))

    Assert.assertEquals(number1 + number2, toNumber(result))
  }

  @Test def `Add two numbers of unequal length`: Unit = {
    val number1 = BigInt(999999)
    val number2 = BigInt(1)

    val result = AddTwoNumbers.addTwoNumbers(toListNode(number1), toListNode(number2))

    Assert.assertEquals(number1 + number2, toNumber(result))
  }

  @Test def `Convert integer to List Node`: Unit = {
    val number = BigInt(123123)
    Assert.assertTrue(number == toNumber(toListNode(number)))
  }

  def toListNode(num: BigInt): ListNode = {
    var numAsListNode: ListNode = null
    num.toString().foreach { digit =>
      numAsListNode = new ListNode(digit.asDigit, numAsListNode)
    }
    numAsListNode
  }

  def toNumber(listNode: ListNode): BigInt = {
    var listNodeAsNumber = 0
    var digitPlace = 0

    var tmpListNode = listNode
    while (tmpListNode != null) {
      listNodeAsNumber = listNodeAsNumber + tmpListNode.x * Math.pow(10, digitPlace).toInt
      tmpListNode = tmpListNode.next
      digitPlace += 1
    }
    listNodeAsNumber
  }
}
