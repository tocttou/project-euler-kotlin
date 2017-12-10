package test

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import src.utils.oldFor
import kotlin.test.assertEquals

object OldForTest : Spek({
    given("a range 0..6") {
        on("looping through it via oldFor until index 3 and adding 'it' to list") {
            val list = mutableListOf<Int>()
            oldFor({ 0 }, { it <= 3 }, { it + 1 }) {
                list.add(it)
            }
            it("list should be equal to the test value") {
                val testValue = mutableListOf<Int>(0, 1, 2, 3)
                assertEquals(list, testValue)
            }
        }
    }
})