package src

import src.utils.generatePrimeFactorsWithFrequency

fun main(args: Array<String>) {
    var numFactors: Int
    var counter = 2L
    while (true) {
        val triangleNumber = counter * (counter + 1) / 2
        val temp = generatePrimeFactorsWithFrequency(triangleNumber)?.values?.map { it + 1 }
        numFactors = temp!!.reduce { acc, i -> acc * i }
        if (numFactors > 500) break
        counter++
    }
    println(counter * (counter + 1) / 2)
}