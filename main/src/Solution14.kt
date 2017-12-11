package src

fun main(args: Array<String>) {
    var elementWithLongestChain = 0
    var longestChain = 0
    for (i in 999999 downTo 1) {
        var numberOfElementsInSeq = 0
        iterateOverCollatzSeq(i.toLong()) { numberOfElementsInSeq++ }
        if (numberOfElementsInSeq > longestChain) {
            longestChain = numberOfElementsInSeq
            elementWithLongestChain = i
        }
    }
    println(elementWithLongestChain)
}

tailrec fun iterateOverCollatzSeq(n: Long, action: (Long) -> Unit) {
    action(n)
    if (n == 1L) return else
        return iterateOverCollatzSeq(if (n % 2L == 0L) n / 2L else 3 * n + 1L, action)
}