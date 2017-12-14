package src.utils

import java.math.BigInteger

fun numDigits(_number: Number): Int {
    var number = _number
    return when (number) {
        is Int -> {
            var counter = 0
            while (number > 0) {
                counter++
                number /= 10
            }
            counter
        }
        is Long -> {
            var counter = 0
            while (number > 0L) {
                counter++
                number /= 10L
            }
            counter
        }
        is BigInteger -> {
            var counter = 0
            while (number > BigInteger("0")) {
                counter++
                number /= BigInteger("10")
            }
            counter
        }
        else -> throw IllegalArgumentException(
            "Only Int, Long, and BigInteger are supported."
        )
    }
}