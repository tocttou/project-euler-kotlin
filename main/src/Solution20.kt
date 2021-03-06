package src

import java.math.BigInteger

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver20())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver20(): BigInteger {
    var i = BigInteger("100")
    var factorial = BigInteger("1")
    var sumOfDigits = BigInteger("0")
    while (i > BigInteger("0")) {
        factorial *= i
        i--
    }
    while (factorial > BigInteger("0")) {
        sumOfDigits += factorial % BigInteger("10")
        factorial /= BigInteger("10")
    }

    return sumOfDigits
}