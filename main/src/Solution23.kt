package src

import src.utils.getAllFactors

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver23())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver23(): Int {
    val abundantNumbers = abundantNumbersUntil(28123)
    val allValues = MutableList(28123) { false }
    for (i in abundantNumbers) {
        for (j in abundantNumbers) {
            if (i + j <= 28123) allValues[i + j - 1] = true
        }
    }
    var sum = 0
    allValues.toList()
        .mapIndexed { index, b -> if (!b) sum += index + 1 }
    return sum
}

private fun abundantNumbersUntil(number: Int): List<Int> {
    val mutableList = mutableListOf<Int>()
    for (i in 2..number) {
        if (getAllFactors(i)!!.reduce { acc, v -> acc + v } > i) {
            mutableList.add(i)
        }
    }
    return mutableList.toList()
}