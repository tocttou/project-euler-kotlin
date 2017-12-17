package src

import src.utils.permutationsOf
import src.utils.pow

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver32())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver32(): Int {
    val all = mutableSetOf<Int>()
    val allPerms = permutationsOf(List(9) { it + 1 })
    for (a in allPerms) {
        for (p in listOf(Pair(3, 2), Pair(4, 1))) {
            val n1 = a.subList(0, p.first).accumulateToInt()
            val n2 = a.subList(p.first, p.first + p.second).accumulateToInt()
            val n3 = a.subList(p.first + p.second, a.count()).accumulateToInt()
            if (n1 * n2 == n3) all.add(n3)
        }
    }
    return all.reduce { acc, i -> acc + i }
}

private fun List<Int?>.accumulateToInt(): Int {
    var n = 0
    for (i in this.count() - 1 downTo 0) {
        n += this[this.count() - 1 - i]!! * (pow(10, i) as Int)
    }
    return n
}

