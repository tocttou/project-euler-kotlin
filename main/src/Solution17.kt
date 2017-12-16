package src

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver17())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver17(): Int {
    var letterSum = 0
    for (i in 1..1000) {
        letterSum += getWordForNumber(i)!!.length
    }
    return letterSum
}

private val wordMapOne = mapOf<Int, String>(
    Pair(1, "One"),
    Pair(2, "Two"),
    Pair(3, "Three"),
    Pair(4, "Four"),
    Pair(5, "Five"),
    Pair(6, "Six"),
    Pair(7, "Seven"),
    Pair(8, "Eight"),
    Pair(9, "Nine")
)

private val wordMapTwo = mapOf<Int, String>(
    Pair(10, "Ten"),
    Pair(11, "Eleven"),
    Pair(12, "Twelve"),
    Pair(13, "Thirteen"),
    Pair(14, "Fourteen"),
    Pair(15, "Fifteen"),
    Pair(16, "Sixteen"),
    Pair(17, "Seventeen"),
    Pair(18, "Eighteen"),
    Pair(19, "Nineteen")
)

private val wordMapThree = mapOf<Int, String>(
    Pair(20, "Twenty"),
    Pair(30, "Thirty"),
    Pair(40, "Forty"),
    Pair(50, "Fifty"),
    Pair(60, "Sixty"),
    Pair(70, "Seventy"),
    Pair(80, "Eighty"),
    Pair(90, "Ninety")
)

private val wordMapFour = mapOf<Int, String>(
    Pair(100, "Hundred"),
    Pair(1000, "Thousand")
)

private fun getWordForNumber(number: Int): String? {
    val numDigits = number.toString().length
    if (number == 1000) return "One${wordMapFour.get(1000)!!}"
    if (numDigits == 1) return wordMapOne.get(number)!!
    if (numDigits == 2) return getTwoDigitRepr(number)
    if (numDigits == 3) return getThreeDigitRepr(number)
    return null
}

private fun getThreeDigitRepr(number: Int): String {
    val lValue = "${wordMapOne.get(number / 100)}Hundred"
    val rValue = if (number % 100 == 0) {
        ""
    } else if ((number % 100).toString().length == 2) {
        "And${getTwoDigitRepr(number % 100)}"
    } else {
        "And${wordMapOne.get(number % 100)}"
    }
    return lValue + rValue
}

private fun getTwoDigitRepr(number: Int): String {
    if (number >= 10 && number <= 19) return wordMapTwo.get(number)!!
    val lValue = wordMapThree.get(number - (number % 10))
    val rValue = if (number % 10 == 0) "" else wordMapOne.get(number % 10)
    return lValue + rValue
}