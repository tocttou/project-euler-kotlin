package src

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver2())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver2(): Int {
    var sum = 0
    fibonacciUntil { if (it % 2 == 0) sum += it }
    return sum
}

private fun fibonacciUntil(prev: Int = 1, current: Int = 2, action: (Int) -> Unit): Int {
    action(prev)
    if (current > 4000000) return prev
    return fibonacciUntil(current, prev + current, action)
}