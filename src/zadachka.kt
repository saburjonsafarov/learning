fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    print((a < b && a > c) || (a == b && a == c && c == b) || (a > b && a < c))
}