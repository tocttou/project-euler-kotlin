package src.utils

fun oldFor(
    initialSetter: () -> Int,
    limitingCondition: (Int) -> Boolean,
    updater: (Int) -> Int,
    codeBlock: (Int) -> Unit) {
    var i = initialSetter()
    while (limitingCondition(i)) {
        codeBlock(i)
        i = updater(i)
    }
}