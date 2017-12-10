package test

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import src.utils.frequencyMapOf
import src.utils.generatePrimeFactorsWithFrequency
import kotlin.test.assertEquals

object GeneratePrimeFactorsWithFrequencyTest : Spek({
    given("a Long number") {
        val n = 39L
        on("generating prime factors with frequency") {
            val primeFactorsWithFreq = generatePrimeFactorsWithFrequency(n)
            it("should be equal to the test value") {
                val testValue = frequencyMapOf<Long, Int>(Pair(3L, 1), Pair(13L, 1))
                assertEquals(primeFactorsWithFreq, testValue)
            }
        }
    }
})