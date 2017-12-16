package src

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    println(driver4())
    val end = System.currentTimeMillis()
    println("Finished in: ${end - start} ms")
}

fun driver4(): Int? {
    val palindromeSeq = generateSeq().filter { it.toString().isPalindrome() }
    return palindromeSeq.max()
}

private fun String.isPalindrome(): Boolean {
    return this.compareTo(this.reversed()) == 0
}

private fun generateSeq(): MutableSet<Int> {
    val seq = mutableSetOf<Int>()
    (100..999).forEach { seq.addAll(100*it..999*it step it) }
    return seq
}