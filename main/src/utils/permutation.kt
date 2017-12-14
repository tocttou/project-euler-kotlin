package src.utils

fun <T> permutationsOf(
    list: List<T?>,
    window: Int = list.count()): List<List<T?>> {
    if (window > list.count()) throw IllegalArgumentException(
        "Window must be less than or equal to list.count()"
    )
    val acc = mutableSetOf<List<T?>>()
    val driver = PermutationWrapper<T?>(acc)
    for (i in combinationsOf(list, window)) {
        driver.withWindow(i, window)
    }
    return acc.toList()
}

class PermutationWrapper<T>(val acc: MutableSet<List<T?>>) {
    fun withWindow(
        list: List<T?>,
        window: Int,
        tempList: List<T?> = list,
        start: Int = 0) {

        if (start == tempList.count() - 1) {
            acc.add(tempList)
            return
        }

        for (i in start..(tempList.count() - 1)) {
            val t = tempList.toMutableList()
            val a = t[i]
            t[i] = t[start]
            t[start] = a

            withWindow(
                list,
                window,
                t,
                start + 1
            )
        }
    }
}
