package io.github.prittspadelord

import io.github.prittspadelord.algorithms.QuickSort

fun main() {
    val quicksort = QuickSort<Int>()

    var array: Array<Int> = arrayOf(6,5,4,3,2,1)

//    println("Partition index is ${quicksort.partition(array, 0, array.size-1)}")
//
//    println("Modified array is ${array.joinToString(",")}")

    quicksort.sort(array)

    println(array.joinToString(","))
}