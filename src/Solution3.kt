fun main(args: Array<String>) {
    println(generatePrimeFactors(600851475143L)?.max())
}

fun generatePrimeFactors(_n: Long): MutableSet<Long>? {
    var n = _n
    if (n < 2L) return null
    val primeFactors = mutableSetOf<Long>()
    while (n % 2L == 0L) {
        primeFactors.add(2L)
        n /= 2L
    }

    for (i in 3L..Math.sqrt(n.toDouble()).toLong()) {
        while (n % i == 0L) {
            primeFactors.add(i)
            n /= i
        }
    }

    if (n > 2L) primeFactors.add(n)
    return primeFactors
}