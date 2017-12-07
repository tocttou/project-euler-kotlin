fun main(args: Array<String>) {
    val palindromeSeq = generateSeq().filter { it.toString().isPalindrome() }
    println(palindromeSeq.max())
}

fun String.isPalindrome(): Boolean {
    return this.compareTo(this.reversed()) == 0
}

fun generateSeq(): MutableSet<Int> {
    val seq = mutableSetOf<Int>()
    (100..999).forEach { seq.addAll(100*it..999*it step it) }
    return seq
}