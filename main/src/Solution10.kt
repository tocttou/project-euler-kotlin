package src

import src.utils.primesLessThanNumber

fun main(args: Array<String>) {
    val primes = primesLessThanNumber(2000000)
    var sum = 0L
    primes.map { sum += it }
    println(sum)
}