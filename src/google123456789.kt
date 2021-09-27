fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    if (a > b && a > c) {
        println(a)
    } else if (b > a && b > c) {
        println(b)
    } else if (c > a && c > b) {
        println(c)
    }


}