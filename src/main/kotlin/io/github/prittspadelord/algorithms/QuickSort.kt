package io.github.prittspadelord.algorithms

import kotlin.math.floor

class QuickSort<T: Comparable<T>> {

    private fun partition(array: Array<T>, low: Int, high: Int): Int {
        assert(high >= low)

        val firstIndex = low
        val middleIndex = floor((high - low) * 0.5).toInt()
        val lastIndex = high

        var pivot = lastIndex

        //median of three
        if(((array[firstIndex] < array[middleIndex]) && (array[lastIndex] > array[middleIndex])) || ((array[firstIndex] > array[middleIndex]) && (array[lastIndex] < array[middleIndex]))) {
            pivot = middleIndex
        }
        else if(((array[middleIndex] < array[firstIndex]) && (array[lastIndex] > array[firstIndex])) || ((array[middleIndex] > array[firstIndex]) && (array[lastIndex] < array[firstIndex]))) {
            pivot = firstIndex
        }

        val pivotValue = array[pivot]

        //pivot has been swapped to the first
        val temp = array[pivot]
        array[pivot] = array[low]
        array[low] = temp

        //we set up the loop
        var i = low + 1
        var j = high

        while(true) {
            while(array[i] < pivotValue) {
                i++
            }

            while(array[j] > pivotValue) {
                j--
            }

            //break if crossed
            if(i >= j) {
                break
            }

            //swap if havent
            val t = array[i]
            array[i] = array[j]
            array[j] = t
        }

        //swap back
        val temp2 = array[low]
        array[low] = array[j]
        array[j] = temp2

        return j
    }

    private fun quicksort(array: Array<T>, start: Int, end: Int) {
        if(start < end) {
            val partitionIndex = this.partition(array, start, end)
            this.quicksort(array, start, partitionIndex - 1)
            this.quicksort(array, partitionIndex + 1, end)
        }
    }

    fun sort(array: Array<T>) {
        this.quicksort(array, 0, array.size - 1)
    }
}