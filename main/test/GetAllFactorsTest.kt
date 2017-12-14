package test

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import src.utils.getAllFactors
import kotlin.test.assertEquals

object GetAllFactorsTest : Spek({
    given("an integer") {
        val n = 220
        on("running generating all its proper divisors") {
            val factors = getAllFactors(n)
            it("should be equal to the test value") {
                val testValue = listOf<Int>(
                    1, 2, 110, 4, 55, 5, 44, 10, 22, 11, 20
                )
                assertEquals(factors, testValue)
            }
        }
    }
})