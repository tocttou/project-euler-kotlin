package src

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver14())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver14(): Int {
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
    return elementWithLongestChain
}

private tailrec fun iterateOverCollatzSeq(n: Long, action: (Long) -> Unit) {
    action(n)
    if (n == 1L) return else
        return iterateOverCollatzSeq(if (n % 2L == 0L) n / 2L else 3 * n + 1L, action)
}