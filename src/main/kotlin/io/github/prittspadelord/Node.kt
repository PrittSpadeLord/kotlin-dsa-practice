package io.github.prittspadelord

class Node<T>(value: T) {
    private var next: Node<T>? = null
    private val value = value

    fun setNext(next: Node<T>?) {
        this.next = next
    }

    fun getNext(): Node<T>? {
        return this.next
    }

    override fun toString(): String {
        //print the first entry

        //go to the next one, if it exists

        var curr: Node<T>? = this
        var res = ""

        while(curr != null) {
            res += curr.value
            curr = curr.getNext()
            if(curr != null) {
                res += ", "
            }
        }

        return res
    }
}