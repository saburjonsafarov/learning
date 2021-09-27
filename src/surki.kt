fun main() {
    val inWorkdaysMin = 10
    val inWorkdaysMax = 20
    val inNoWorkdaysMin = 15
    val inNoWorkdaysMax = 25
    val vvod = readLine()!!.toInt()
    val vvod2 = readLine()!!.toBoolean()

    print((vvod >= inWorkdaysMin && vvod <= inWorkdaysMax && vvod2 == false) || (vvod >= inNoWorkdaysMin && vvod <= inNoWorkdaysMax && vvod2 == true))
}