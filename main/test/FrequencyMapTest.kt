package test

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import src.utils.frequencyMapOf
import kotlin.test.assertEquals

object FrequencyMapTest : Spek({
    given("a frequency map object") {
        val freqMap = frequencyMapOf<Int, Int>()
        on("generateMutableMapFromFrequencyMap") {
            val mMap = freqMap
                .generateMutableMapFromFrequencyMap(frequencyMapOf<Int, Int>(Pair(1, 2)))
            it("should be equal to test value") {
                val testMMap = mutableMapOf<Any?, Any?>(Pair(1, 2))
                assertEquals<MutableMap<Any?, Any?>>(mMap, testMMap)
            }
        }
        on("adding element by key, value") {
            freqMap.add(1, 2)
            it("should be equal to test value") {
                val testValue1 = frequencyMapOf<Int, Int>(Pair(1, 2))
                assertEquals(freqMap, testValue1)
            }
        }
        on("adding element by pair") {
            freqMap.add(Pair(3, 4))
            it("should be equal to the test value") {
                val testValue = frequencyMapOf<Int, Int>(Pair(1, 2), Pair(3, 4))
                assertEquals(freqMap, testValue)
            }
        }
        on("reducing an element's frequency by an amount") {
            freqMap.removeFreq(3, 2)
            it("should be equal to the test value") {
                val testValue = frequencyMapOf<Int, Int>(Pair(1, 2), Pair(3, 2))
                assertEquals(freqMap, testValue)
            }
        }
        on("reducing an element's frequency down to less than 1") {
            freqMap.removeFreq(3, 2)
            it("should be equal to the test value") {
                val testValue = frequencyMapOf<Int, Int>(Pair(1, 2))
                assertEquals(freqMap, testValue)
            }
        }
    }
})