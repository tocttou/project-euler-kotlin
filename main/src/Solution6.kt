package src

fun main(args: Array<String>) {
    val n = 100.0
    val squareOfSum = Math.pow((n * (n + 1) / 2), 2.0).toLong()
    val sumOfSquare = (n * (n + 1) * (2 * n + 1) / 6).toLong()
    println(squareOfSum - sumOfSquare)
}