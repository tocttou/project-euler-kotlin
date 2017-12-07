fun main(args: Array<String>) {
    val sum = (1..999)
            .filter { it % 3 == 0 || it % 5 == 0 }
            .reduce { sum, element -> sum + element }
    println(sum)
}