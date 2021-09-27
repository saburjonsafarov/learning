fun main() {
    val n = readLine().toString()
    val b = (n.length).toInt()
    print("$b repetitions of the word $n: ${n.repeat(b)}")
}