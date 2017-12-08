package src.utils

fun primesLessThanNumber(n: Int): List<Int> {
    val primesAtIndex = (0..n).map { true }.toMutableList()
    var p = 2
    primesAtIndex[0] = false
    primesAtIndex[1] = false
    while (p * p <= n) {
        if (primesAtIndex[p]) {
            for (i in 2 * p..n step p) {
                primesAtIndex[i] = false
            }
        }
        p += 1
    }
    val primes = mutableListOf<Int>()
    primesAtIndex.mapIndexed { index, b -> if (b) primes.add(index) }
    return primes
}