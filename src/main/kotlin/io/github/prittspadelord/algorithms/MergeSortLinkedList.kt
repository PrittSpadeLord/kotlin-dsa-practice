package io.github.prittspadelord.algorithms

import io.github.prittspadelord.Node

class MergeSortLinkedList<T: Comparable<T>> {

    //merge sort works by taking two sorted lists, and sorting them into one sorted list

    fun split(head: Node<T>): Pair<Node<T>, Node<T>> {
        //find the middle
        var slow = head
        var fast = head

        while(fast.getNext() != null && fast.getNext()!!.getNext() != null) {
            slow = slow.getNext()!!
            fast = fast.getNext()!!.getNext()!!
        }

        val second = slow.getNext()!!
        slow.setNext(null)
        val first = head

        return Pair(first, second)
    }
}