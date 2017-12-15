package src.utils

import java.math.BigInteger

fun pow(a: Number, b: Int): Number {
    if (b == 0) return 1
    if (b == 1) return a
    return when (a) {
        is Long -> {
            if (b % 2 == 0) pow(a * a, b / 2)
            else a * pow(a * a, b / 2) as Long
        }
        is Int -> {
            if (b % 2 == 0) pow(a * a, b / 2)
            else a * pow(a * a, b / 2) as Int
        }
        is BigInteger -> {
            if (b % 2 == 0) pow(a * a, b / 2)
            else a * pow(a * a, b / 2) as BigInteger
        }
        else -> throw IllegalArgumentException("only Long, Int, BigInteger are supported")
    }
}