package src

import src.utils.isLeapYear

private val monthNumDays = listOf<Int>(
    31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
)

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver19())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver19(): Int {
    val seq = generateSequence(Triple(1, 1901, 31)) {
        val nextMonth = (it.first % 12) + 1
        val nextYear = if (nextMonth == 1) it.second + 1 else it.second
        val numDaysInNextMonth = if (nextMonth == 2 && nextYear.isLeapYear()) {
            29
        } else monthNumDays[nextMonth - 1]
        Triple(nextMonth, nextYear, numDaysInNextMonth).takeIf { nextYear != 2001 }
    }

    var result = 0
    var dayOfCurrentSunday = 6
    for (s in seq) {
        if (dayOfCurrentSunday == 1) result++
        dayOfCurrentSunday = if (dayOfCurrentSunday < s.third - 28) {
            (dayOfCurrentSunday + 35) % s.third
        } else (dayOfCurrentSunday + 28) % s.third
    }
    return result
}
