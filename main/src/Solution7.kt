package src

import src.utils.primesLessThanNumber

fun main(args: Array<String>) {
    val n = 10001
    // https://en.wikipedia.org/wiki/Prime_number_theorem#Approximations_for_the_nth_prime_number
    val estimatedUpperBound = (
        n * Math.log(n.toDouble())
            + n * Math.log(Math.log(n.toDouble()))
        ).toInt()
    val primesLessThanUpperBound = primesLessThanNumber(estimatedUpperBound)
    println(primesLessThanUpperBound[n - 1])
}

