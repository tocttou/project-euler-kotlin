package src

import src.utils.permutationsOf

fun main(args: Array<String>) {
    val permutations = permutationsOf(
        listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    ).map { it.joinToString("") }.sorted()
    println(permutations[1000000 - 1])
}
