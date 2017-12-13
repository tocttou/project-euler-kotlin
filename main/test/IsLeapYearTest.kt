package test

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import src.utils.isLeapYear
import kotlin.test.assertEquals

object IsLeapYearTest : Spek({
    given("a list of integer years") {
        val years = listOf(1900, 2000, 2004, 2005, 2100, -1)
        on("checking running them through Int.isLeapYear") {
            val areLeapYears = years.map { it.isLeapYear() }
            it("should be equal to the test value") {
                val testVal = listOf(false, true, true, false, false, false)
                assertEquals(areLeapYears, testVal)
            }
        }
    }
})