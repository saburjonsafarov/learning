fun main() {
    var a = 0
    while (true) {
        a = a + 1
        println("input your number please try #" + a)
        val userInput = readLine()!!.toInt()
        if (userInput % 2 != 0) println("adad toq ast! \n")
        else println("adad juft ast! \n")
    }
}