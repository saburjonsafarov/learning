fun main() {
    val hh = readLine()!!.toInt()
    val mm = readLine()!!.toInt()
    val ss = readLine()!!.toInt()
    val hh1 = readLine()!!.toInt()
    val mm1 = readLine()!!.toInt()
    val ss1 = readLine()!!.toInt()

    print((hh1 * 3600 + mm1 * 60 + ss1) - (hh * 3600 + mm * 60 + ss))
}