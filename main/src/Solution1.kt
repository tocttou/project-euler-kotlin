package src

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver1())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver1(): Int {
    val sum = (1..999)
        .filter { it % 3 == 0 || it % 5 == 0 }
        .reduce { sum, element -> sum + element }
    return sum
}