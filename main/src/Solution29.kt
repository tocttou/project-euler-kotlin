package src

import src.utils.generatePrimeFactorsWithFrequency

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver29())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver29(): Int {
    val mutableSet = mutableSetOf<Map<Long, Int>>()
    for (i in 2..100) {
        for (j in 2..100) {
            val freqMap = generatePrimeFactorsWithFrequency(i)!!
                .mapValues { e -> e.value * j }
            mutableSet.add(freqMap)
        }
    }
    return mutableSet.count()
}