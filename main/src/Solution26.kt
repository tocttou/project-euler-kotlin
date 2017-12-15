package src

import src.utils.primesLessThanNumber
import java.math.BigInteger

fun main(args: Array<String>) {
    val powersOfTen = generateSequence(BigInteger.TEN) {
        it * BigInteger.TEN
    }
    val mutableList = mutableListOf<Pair<Int, Int>>()
    for (prime in primesLessThanNumber(1000)) {
        for ((index, s) in powersOfTen.withIndex()) {
            if (s % prime.toBigInteger() == BigInteger.ZERO) break
            if ((s - BigInteger.ONE) % prime.toBigInteger() == BigInteger.ZERO) {
                mutableList.add(Pair(prime, index + 1))
                break
            }
        }
    }
    mutableList.sortBy { it.second }
    println(mutableList.last().first)
}
