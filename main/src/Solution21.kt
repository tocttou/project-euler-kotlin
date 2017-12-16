package src

import src.utils.getAllFactors

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver21())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver21(): Int {
    val set = mutableSetOf<Int>()
    for (i in 2..10000) {
        val sumOfFactors = getAllFactors(i)!!.reduce { acc, v -> acc + v }
        if (sumOfFactors != i) {
            val sumOfSumOfFactors = getAllFactors(sumOfFactors)!!.reduce { acc, v -> acc + v }
            if (sumOfSumOfFactors == i) set.add(i)
        }
    }
    return set.reduce { acc, i -> acc + i }
}
