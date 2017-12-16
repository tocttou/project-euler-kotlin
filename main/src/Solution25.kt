package src

import src.utils.numDigits
import java.math.BigInteger

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver25())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver25(): Int? {
    val fiboSeq = generateSequence(Pair(BigInteger("0"), BigInteger("1"))) {
        Pair(it.second, it.first + it.second)
    }
    for ((index, s) in fiboSeq.withIndex()) {
        if (numDigits(s.second) == 1000) {
            return index + 1
        }
    }
    return null
}
