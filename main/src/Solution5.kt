package src

import src.utils.generatePrimeFactorsWithFrequency

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver5())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver5(): Long {
    val seq = mutableMapOf<Long, Int>()
    (2L..20L).forEach {
        (generatePrimeFactorsWithFrequency(it) { v ->
            v.forEach { t, u ->
                seq.computeIfPresent(t) { _, w -> if (u > w) u else w }
                seq.putIfAbsent(t, u)
            }
        })
    }
    var product = 1L
    seq.forEach { t, u -> product *= Math.pow(t.toDouble(), u.toDouble()).toLong() }
    return product
}