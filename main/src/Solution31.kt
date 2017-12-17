package src

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver31())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver31(): Int {
    val acc = mutableListOf<List<Int>>()
    getAllDenominationCombinations(
        listOf(1, 2, 5, 10, 20, 50, 100, 200),
        200
    ) {
        acc.add(it)
    }
    return acc.count()
}

private fun getAllDenominationCombinations(
    originalList: List<Int>,
    currentSum: Int,
    list: List<Int> = originalList,
    countList: List<Int> = listOf(),
    action: (List<Int>) -> Unit
) {
    if (countList.count() == originalList.count() - 1) {
        val tempCountList = countList.toMutableList()
        tempCountList.add(currentSum)
        action(tempCountList.reversed().toList())
    } else {
        for (i in 0..(currentSum / list.last())) {
            val tempCountList = countList.toMutableList()
            tempCountList.add(i)
            val tempList = list.toMutableList()
            val lastElem = tempList.removeAt(list.count() - 1)
            getAllDenominationCombinations(
                originalList,
                currentSum - i * lastElem,
                tempList.toList(),
                tempCountList.toList(),
                action
            )
        }
    }
}
