package src.utils

fun <T> combinationsOf(
    list: List<T?>,
    window: Int = list.count())
    : List<List<T?>> {
    if (window > list.count()) throw IllegalArgumentException(
        "Window must be less than or equal to list.count()"
    )
    val acc = mutableListOf<List<T?>>()
    val wrapper = CombinationWrapper(acc)
    wrapper.withWindow(list, window)
    return acc.toList()
}

class CombinationWrapper<T>(val collector: MutableList<List<T?>>) {
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
    }
}
