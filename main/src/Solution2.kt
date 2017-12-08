package src

fun main(args: Array<String>) {
    var sum = 0
    fibonacciUntil { if (it % 2 == 0) sum += it }
    println(sum)
}

fun fibonacciUntil(prev: Int = 1, current: Int = 2, action: (Int) -> Unit): Int {
    action(prev)
    if (current > 4000000) return prev
    return fibonacciUntil(current, prev + current, action)
}