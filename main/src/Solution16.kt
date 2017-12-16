package src

import java.math.BigInteger

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver16())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver16(): BigInteger {
    var product = BigInteger("1")
    for (i in 1..1000) {
        product *= BigInteger("2")
    }
    var sum = BigInteger("0")
    while (product > BigInteger("0")) {
        sum += product % BigInteger("10")
        product /= BigInteger("10")
    }
    return sum
}