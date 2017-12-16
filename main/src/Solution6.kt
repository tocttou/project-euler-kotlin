package src

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver6())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver6(): Long {
    val n = 100.0
    val squareOfSum = Math.pow((n * (n + 1) / 2), 2.0).toLong()
    val sumOfSquare = (n * (n + 1) * (2 * n + 1) / 6).toLong()
    return squareOfSum - sumOfSquare
}