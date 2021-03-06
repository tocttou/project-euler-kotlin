package test

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import src.utils.combinationsOf
import kotlin.test.assertEquals

object CombinationTest : Spek({
    given("an array of integers and a window") {
        val arr = listOf<Int>(1, 2, 3)
        val window = 2
        on("calling combinationsOf") {
            val acc = combinationsOf(arr, window)
            it("should be equal to test value") {
                val testValue = mutableListOf<List<Int?>>(
                    listOf(1, 2),
                    listOf(1, 3),
                    listOf(2, 3)
                )
                assertEquals(acc, testValue)
            }
        }
    }
})