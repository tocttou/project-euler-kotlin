import utils.generatePrimeFactorsWithFrequency

fun main(args: Array<String>) {
    println(generatePrimeFactorsWithFrequency(600851475143L)?.keys?.max())
}

