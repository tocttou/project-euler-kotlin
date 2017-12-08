package src

fun main(args: Array<String>) {
    val n = 1000
    var a = 0
    var b = 0
    var c = 0
    // linearized the problem with analytical method: ab = 5*10^5 - c
    for (i in 1..1000) {
        val p = n - i
        val q = 500000 - 1000 * i
        if ((p * p - 4 * q).isPerfectSquare()) {
            val D = Math.sqrt((p * p - 4 * q).toDouble()).toInt()
            if ((p + D) % 2 == 0) {
                a = (p + D) / 2
                b = (p - D) / 2
                c = i
                break
            }
        }
    }
    println(a * b * c)
}

fun Int.isPerfectSquare(): Boolean {
    val sqrt = Math.sqrt(this.toDouble()).toInt()
    return sqrt * sqrt == this
}