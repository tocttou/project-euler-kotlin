package src.utils

fun generatePrimeFactorsWithFrequency(
        _n: Long,
        action: (FrequencyMap<Long, Int>) -> Unit = {}
): FrequencyMap<Long, Int>? {
    var n = _n
    if (n < 2L) return null
    val primeFactors = frequencyMapOf<Long, Int>()
    while (n % 2L == 0L) {
        primeFactors.add(2L, 1)
        n /= 2L
    }

    for (i in 3L..Math.sqrt(n.toDouble()).toLong()) {
        while (n % i == 0L) {
            primeFactors.add(i, 1)
            n /= i
        }
    }

    if (n > 2L) primeFactors.add(n, 1)
    action(primeFactors)
    return primeFactors
}
