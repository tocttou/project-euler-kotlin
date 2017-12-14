package test

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import src.utils.numDigits
import java.math.BigInteger
import kotlin.test.assertEquals

object NumDigitsTest : Spek({
    given("an Int") {
        val n = 1234567890
        on("running it through numDigits") {
            val numDigits = numDigits(n)
            it("should be equal to the test value") {
                val testValue = 10
                assertEquals(numDigits, testValue)
            }
        }
    }
    given("a Long") {
        val n = 1234567890L
        on("running it through numDigits") {
            val numDigits = numDigits(n)
            it("should be equal to the test value") {
                val testValue = 10
                assertEquals(numDigits, testValue)
            }
        }
    }
    given("a BigInteger") {
        val n = BigInteger("1234567890")
        on("running it through numDigits") {
            val numDigits = numDigits(n)
            it("should be equal to the test value") {
                val testValue = 10
                assertEquals(numDigits, testValue)
            }
        }
    }
})