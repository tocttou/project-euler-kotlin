package test

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import src.utils.primesLessThanNumber
import kotlin.test.assertEquals

object PrimesLessThanNumberTest : Spek({
    given("a number") {
        val n = 18
        on("generate primeNumbersLessThanNumber") {
            val primes = primesLessThanNumber(n)
            it("should be equal to the test value") {
                val testValue = listOf<Int>(2, 3, 5, 7, 11, 13, 17)
                assertEquals(primes, testValue)
            }
        }
    }
})