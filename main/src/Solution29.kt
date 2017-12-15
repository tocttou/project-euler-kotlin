package src

import src.utils.generatePrimeFactorsWithFrequency

fun main(args: Array<String>) {
    val mutableSet = mutableSetOf<Map<Long, Int>>()
    for (i in 2..100) {
        for (j in 2..100) {
            val freqMap = generatePrimeFactorsWithFrequency(i)!!
                .mapValues { e -> e.value * j }
            mutableSet.add(freqMap)
        }
    }
    println(mutableSet.count())
}