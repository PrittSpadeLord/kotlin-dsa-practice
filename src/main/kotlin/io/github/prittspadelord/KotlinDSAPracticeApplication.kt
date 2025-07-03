package io.github.prittspadelord

import io.github.prittspadelord.algorithms.MergeSortLinkedList
import io.github.prittspadelord.algorithms.QuickSort

fun main() {
    val head = Node(0)
    val one = Node(1)
    val two = Node(2)
    val three = Node(3)
    val four = Node(4)
    val five = Node(5)
    val six = Node(6)

    six.setNext(five)
    five.setNext(four)
    four.setNext(three)
    three.setNext(two)
    two.setNext(one)
    head.setNext(six)

    println(head)

    val mergeSortLinkedList = MergeSortLinkedList<Int>()

    val resultPair = mergeSortLinkedList.split(head)

    println(resultPair.first)
    println(resultPair.second)
    println(head)
}