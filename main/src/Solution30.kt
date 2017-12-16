package src

import src.utils.pow

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver30())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver30(): Int {
    var sum = -1
    for (i in 1..6) { // upper bound found from condition: 9 ^ 5 * i > 10 ^ (i - 1)
        val start = pow(10, i - 1) as Int
        val end = pow(10, i) as Int - 1
        for (j in start..end) {
            if (j == sumDigitsFifthPower(j)) {
                sum += j
            }
        }
    }
    return sum
}

private fun sumDigitsFifthPower(n: Int): Int {
    var number = n
    var sum = 0
    while (number > 0) {
        sum += Math.pow((number % 10).toDouble(), 5.0).toInt()
        number /= 10
    }
    return sum
}

