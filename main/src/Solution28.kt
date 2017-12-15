package src

fun main(args: Array<String>) {
    val n = 501
    val sum = 16 * sumSquares(n) - 28 * sumTerms(n) + 16 * n - 3
    println(sum)
}

fun sumTerms(n: Int): Int {
    return n * (n + 1) / 2
}

fun sumSquares(n: Int): Int {
    return n * (n + 1) * (2 * n + 1) / 6
}
