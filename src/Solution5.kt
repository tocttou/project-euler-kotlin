import utils.generatePrimeFactorsWithFrequency

fun main(args: Array<String>) {
    val seq = mutableMapOf<Long, Int>()
    (2L..20L).forEach { (generatePrimeFactorsWithFrequency(it) { v ->
        v.forEach { t, u ->
            seq.computeIfPresent(t) { _, w -> if (u > w) u else w }
            seq.putIfAbsent(t, u)
        }
    })}
    var product = 1L
    seq.forEach { t, u -> product *= Math.pow(t.toDouble(), u.toDouble()).toLong() }
    println(product)
}