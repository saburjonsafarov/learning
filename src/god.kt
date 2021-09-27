fun main() {
    val inp = readLine()!!.toInt()
    if (inp >= 1900 && inp <= 3000) {
        if (inp % 4 == 0 && inp % 100 != 0 || inp % 400 == 0) {
            print("Leap")
        } else print("Regular")
    }
}