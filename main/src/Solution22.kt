package src

import java.io.File

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver22())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver22(): Int {
    val inputStream = File("main/src/data/Problem22Data.txt").inputStream()
    val names = inputStream.bufferedReader().use { it.readText() }.split(",")
    val scores = names.sorted().mapIndexed { index, s ->
        (index + 1) * s.toCharArray().filter { it != '"' }
            .map { it.toInt() - 64 }.reduce { acc, i -> acc + i }
    }
    return scores.reduce { acc, i -> acc + i }
}

