package src

import src.utils.primesLessThanNumber

fun main(args: Array<String>) {
    var max = Pair<List<Int?>, Int>(listOf(0), 0)
    for (i in -999..999 step 2) {
        for (j in primesLessThanNumber(1000)) {
            val numPrimes = generateQuadraticSeq(i, j)
                .filter { it > 1L }
                .indexOfFirst { !it.isPrime() }
            if (numPrimes > max.second) max = Pair(listOf(i, j), numPrimes)
        }
    }
    println(max.first[0]!! * max.first[1]!!)
}

fun generateQuadraticSeq(a: Int, b: Int): Sequence<Long> {
    var counter = -1L
    val seq = generateSequence {
        counter++
        counter * counter + counter * a + b
    }
    return seq
}

fun Long.isPrime(): Boolean {
    if (this < 2) return false
    if (this == 2L || this == 3L) return true
    if (this % 2 == 0L || this % 3 == 0L) return false
    val sqrtN = Math.sqrt(this.toDouble()).toLong() + 1
    var i = 6L
    while (i <= sqrtN) {
        if (this % (i - 1) == 0L || this % (i + 1) == 0L) return false
        i += 6
    }
    return true
}
