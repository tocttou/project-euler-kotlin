package src

import java.io.File
import kotlin.math.max

fun main(args: Array<String>) {
    val inputStream = File("main/src/data/Problem18Data.txt").inputStream()
    val contents = inputStream.bufferedReader().use { it.readText() }
        .split("\n")
        .filter { it != "" }
        .map {
            it.split(" ")
                .filter { it != "" && it != " " }
                .map { it.toInt() }
                .toMutableList()
        }
    for (i in (contents.count() - 2) downTo 0) {
        for (j in 0..(contents[i].count() - 1)) {
            contents[i][j] += max(contents[i + 1][j], contents[i + 1][j + 1])
        }
    }
    println(contents[0][0])
}