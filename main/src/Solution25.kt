package src

import src.utils.numDigits
import java.math.BigInteger

fun main(args: Array<String>) {
    val fiboSeq = generateSequence(Pair(BigInteger("0"), BigInteger("1"))) {
        Pair(it.second, it.first + it.second)
    }
    for ((index, s) in fiboSeq.withIndex()) {
        if (numDigits(s.second) == 1000) {
            println(index + 1)
            break
        }
    }
}
