package test

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import src.utils.permutationsOf
import kotlin.test.assertEquals

object PermutationTest : Spek({
    given("an array of integers and a window") {
        val arr = listOf<Int>(1, 2, 3)
        val window = 2
        on("on calling permutationsOf") {
            val acc = permutationsOf(arr, window)
            it("should be equal to test value") {
                val testValue = mutableListOf<List<Int?>>(
                    listOf(1, 2),
                    listOf(2, 1),
                    listOf(1, 3),
                    listOf(3, 1),
                    listOf(2, 3),
                    listOf(3, 2)
                )
                assertEquals(acc, testValue)
            }
        }
    }
})