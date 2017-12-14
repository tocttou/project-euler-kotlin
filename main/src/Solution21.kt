package src

import src.utils.getAllFactors

fun main(args: Array<String>) {
    val set = mutableSetOf<Int>()
    for (i in 2..10000) {
        val sumOfFactors = getAllFactors(i)!!.reduce { acc, v -> acc + v }
        if (sumOfFactors != i) {
            val sumOfSumOfFactors = getAllFactors(sumOfFactors)!!.reduce { acc, v -> acc + v }
            if (sumOfSumOfFactors == i) set.add(i)
        }
    }
    println(set.reduce { acc, i -> acc + i })
}
