package src.utils

fun main(args: Array<String>) {
    val gridSize = Pair(20, 20)
    val numeratorSize = gridSize.first + gridSize.second
    val denominatorSize = gridSize.first
    val freqMapNumerator = frequencyMapOf<Long, Int>()
    val freqMapDenominator = frequencyMapOf<Long, Int>()
    for (i in numeratorSize downTo 2) {
        val primes = generatePrimeFactorsWithFrequency(i)!!
        freqMapNumerator.addAll(listOf(primes))
        if (i <= denominatorSize) {
            freqMapDenominator.addAll(listOf(primes))
        }
    }
    repeat(2, {
        for (i in freqMapDenominator.keys) {
            freqMapNumerator.removeFreq(i, freqMapDenominator.get(i)!!)
        }
    })
    var product = 1L
    for (i in freqMapNumerator.keys) {
        product *= Math.pow(i.toDouble(), freqMapNumerator.get(i)!!.toDouble()).toLong()
    }
    println(product)
}