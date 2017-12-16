package src

import java.io.File

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver11())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver11(): Int? {
    val d = 20
    val inputStream = File("main/src/data/Problem11Data.txt").inputStream()
    val content = inputStream.bufferedReader().use { it.readText() }

    val horizontalSplit: List<List<Int>> = content.split("\n")
        .toMutableList()
        .map { it.split(" ") }
        .map { it.toMutableList().map { v -> v.toInt() } }
    val verticalSplit = mutableListOf<MutableList<Int>>()

    horizontalSplit.mapIndexed { _, list ->
        for (i in 0..(d - 1)) {
            verticalSplit.add(mutableListOf<Int>())
            verticalSplit[i].add(list[i])
        }
    }
    val rightDiagonalSplit = replaceIndexPairsWithValue(verticalSplit, generateIndexList(d))
    val leftDiagonalSplit = replaceIndexPairsWithValue(
        reversedGridByRow(horizontalSplit),
        generateIndexList(d)
    )
    val maxProductOfWindowLengthFour = mutableListOf<Int?>(
        maxOfWindowProducts(horizontalSplit, 4),
        maxOfWindowProducts(verticalSplit, 4),
        maxOfWindowProducts(leftDiagonalSplit, 4),
        maxOfWindowProducts(rightDiagonalSplit, 4)
    ).filterNotNull().max()
    return maxProductOfWindowLengthFour
}

private fun maxOfWindowProducts(splits: List<List<Int>>, windowLength: Int): Int? {
    return splits.toMutableList().map {
        it.windowed(windowLength).map { v ->
            v.reduce { acc, i -> acc * i }
        }
    }.flatten().max()
}

private fun reversedGridByRow(grid: List<List<Int>>): List<List<Int>> {
    val list = mutableListOf<List<Int>>()
    grid.map { list.add(it.reversed()) }
    return list.toList()
}

private fun replaceIndexPairsWithValue(
    grid: List<List<Int>>,
    indexList: List<MutableList<Pair<Int, Int>>>
): MutableList<MutableList<Int>> {
    val list = mutableListOf<MutableList<Int>>()
    indexList.map {
        val temp = mutableListOf<Int>()
        for (i in it) {
            temp.add(grid[i.first][i.second])
        }
        list.add(temp)
    }
    return list
}

private fun generateIndexList(size: Int): List<MutableList<Pair<Int, Int>>> {
    val lValue = (0..(size - 1)).map {
        generateListOfPairs(0, it)
    }.toMutableList()
    val rValue = (size..2 * (size - 1)).mapIndexed { index, i ->
        generateListOfPairs(index + 1, i, "right")
    }
    return lValue + rValue
}

private fun generateListOfPairs(_anchor: Int, _sum: Int, direction: String = "left")
    : MutableList<Pair<Int, Int>> {
    val list = mutableListOf<Pair<Int, Int>>()
    var anchor = _anchor
    var sum = _sum
    while (if (direction == "left") sum >= _anchor else _sum - anchor >= _anchor) {
        if (direction == "left") {
            list.add(Pair(anchor, sum))
        } else {
            list.add(Pair(anchor, _sum - anchor))
        }
        anchor++
        sum--
    }
    return list
}