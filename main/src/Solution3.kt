package src

import src.utils.generatePrimeFactorsWithFrequency

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver3())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver3(): Long? {
    return generatePrimeFactorsWithFrequency(600851475143L)?.keys?.max()
}

