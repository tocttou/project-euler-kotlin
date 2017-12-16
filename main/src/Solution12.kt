package src

import src.utils.generatePrimeFactorsWithFrequency

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver12())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver12(): Long {
    var numFactors: Int
    var counter = 2L
    while (true) {
        val triangleNumber = counter * (counter + 1) / 2
        val temp = generatePrimeFactorsWithFrequency(triangleNumber)?.values?.map { it + 1 }
        numFactors = temp!!.reduce { acc, i -> acc * i }
        if (numFactors > 500) break
        counter++
    }
    return (counter * (counter + 1) / 2)
}