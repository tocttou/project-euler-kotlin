package src

import java.io.File

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver13())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver13(): String {
    val inputStream = File("main/src/data/Problem13Data.txt").inputStream()
    val contents = inputStream.bufferedReader().use { it.readText() }
    val allNumbersSplit = contents
        .split("\n")
        .filter { it != "" }
        .map { it.split("").filter { it != "" }.map { it.toInt() } }
    val lengthOfNumbers = allNumbersSplit[0].count()
    val placeWiseSumOfAllDigits = MutableList(lengthOfNumbers) { 0 }
    allNumbersSplit.map {
        for (i in 0..(lengthOfNumbers - 1)) {
            placeWiseSumOfAllDigits[i] += it[i]
        }
    }
    val placeWiseSumWithCarry = mutableListOf<Int>()
    var carry = 0
    for (i in (lengthOfNumbers - 1) downTo 0) {
        val value = placeWiseSumOfAllDigits[i] + carry
        placeWiseSumWithCarry.add(value % 10)
        carry = value / 10
    }
    while (carry > 0) {
        placeWiseSumWithCarry.add(carry % 10)
        carry /= 10
    }
    return placeWiseSumWithCarry
        .reversed()
        .subList(0, 10)
        .joinToString("")
}