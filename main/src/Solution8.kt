package src

import java.io.File
import java.io.InputStream

fun main(args: Array<String>) {
    val inputStream: InputStream = File("main/src/data/Problem8Data.txt").inputStream()
    val largeNumberString = inputStream
        .bufferedReader()
        .use { it.readText() }
        .replace("\n", "")
    inputStream.close()

    val windows = largeNumberString.windowed(13)
    val productOfWindows = mutableListOf<Long>()
    windows.map {
        productOfWindows.add(
            it.split("")
                .filter { it != "" }
                .map { it.toLong() }
                .reduce { acc, l -> acc * l }
        )
    }
    println(productOfWindows.max())
}
