package src

import src.utils.primesLessThanNumber

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver7())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver7(): Int {
    val n = 10001
    // https://en.wikipedia.org/wiki/Prime_number_theorem#Approximations_for_the_nth_prime_number
    val estimatedUpperBound = (
        n * Math.log(n.toDouble())
            + n * Math.log(Math.log(n.toDouble()))
        ).toInt()
    val primesLessThanUpperBound = primesLessThanNumber(estimatedUpperBound)
    return primesLessThanUpperBound[n - 1]
}

