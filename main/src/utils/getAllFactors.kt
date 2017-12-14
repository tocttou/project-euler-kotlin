package src.utils

fun getAllFactors(number: Int): List<Int>? {
    if (number < 1) return null
    val mutableList = mutableListOf<Int>(1)
    var i = 2
    while (i <= Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            mutableList.add(i)
            if (i != number / i) mutableList.add(number / i)
        }
        i++
    }
    return mutableList.toList()
}