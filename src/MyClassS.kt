import java.text.SimpleDateFormat
import java.util.*

open class MyClassS {

    fun ageOfBirth() {
        println("input your age")
        var age = readLine()?.toInt()
        if (age == null){
            age = 1
        }

        val a = SimpleDateFormat("yyy")
        val ear = a.format(Date()).toInt()
        println("your year of birth - ${ear - age.toInt()}")
        return
    }
}