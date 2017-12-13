package src.utils

fun Int.isLeapYear(): Boolean {
    if (this < 0) return false
    return if (this % 4 == 0) {
        if (this % 100 == 0) {
            if (this % 400 == 0) true else false
        } else true
    } else false
}