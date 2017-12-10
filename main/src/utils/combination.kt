package src.utils

fun <T> generateCombinations(list: List<T?>, window: Int): List<List<T?>> {
    val acc = mutableListOf<List<T?>>()
    val wrapper = WrapperClass(acc)
    wrapper.withWindow(list, window)
    return acc.toList()
}

class WrapperClass<T>(val collector: MutableList<List<T?>>) {
    fun withWindow(
        list: List<T?>,
        window: Int,
        tempList: MutableList<T?> = MutableList(window) { null },
        start: Int = 0,
        end: Int = list.count() - 1,
        index: Int = 0
    ) {
        if (index == window) {
            collector.add(tempList.toList())
            return
        }

        oldFor({ start }, { it <= end && end - it + 1 >= window - index }, { it + 1 }) {
            tempList[index] = list[it]
            withWindow(
                list,
                window,
                tempList,
                it + 1,
                end,
                index + 1
            )
        }
        return
    }
}
