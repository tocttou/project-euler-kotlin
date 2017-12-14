package src.utils

fun <T> generateCombinations(list: List<T?>, window: Int, withRepetition: Boolean = false)
    : List<List<T?>> {
    val acc = mutableListOf<List<T?>>()
    val wrapper = WrapperClass(acc)
    wrapper.withWindow(list, window, withRepetition)
    return acc.toList()
}

class WrapperClass<T>(val collector: MutableList<List<T?>>) {
    fun withWindow(
        list: List<T?>,
        window: Int,
        withRepetition: Boolean,
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
                withRepetition,
                tempList,
                if (withRepetition) it else it + 1,
                end,
                index + 1
            )
        }
        return
    }
}
