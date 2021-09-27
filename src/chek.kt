import kotlin.random.Random

fun main() {
    val firstnameInput = readLine()!!.toString()
    val lastnameInput = readLine()!!.toString()
    val ageInput = readLine()!!.toInt()
    val phoneNumInput = readLine()!!.toInt()
    val polInput = readLine()!!.toString()
    val r = List(100) { Random.nextInt(0, 100) }
    print(r)

    println(
        """
            --------------------------------------
            firstname ----------- $firstnameInput
            lastname  ----------- $lastnameInput
            age       ----------- $ageInput
            pol       ----------- $polInput
            phoneNumber --------- $phoneNumInput
            identification/id --- $r
            --------------------------------------
        
   """.trimIndent()
    )
}