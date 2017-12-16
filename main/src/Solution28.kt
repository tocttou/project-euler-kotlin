package src

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver28())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver28(): Int {
    val n = 501
    val sum = 16 * sumSquares(n) - 28 * sumTerms(n) + 16 * n - 3
    return sum
}

private fun sumTerms(n: Int): Int {
    return n * (n + 1) / 2
}

private fun sumSquares(n: Int): Int {
    return n * (n + 1) * (2 * n + 1) / 6
}
