package src

import src.utils.primesLessThanNumber

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver10())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver10(): Long {
    val primes = primesLessThanNumber(2000000)
    var sum = 0L
    primes.map { sum += it }
    return sum
}