package src

import src.utils.permutationsOf

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver24())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver24(): String {
    val permutations = permutationsOf(
        listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    ).map { it.joinToString("") }.sorted()
    return permutations[1000000 - 1]
}
