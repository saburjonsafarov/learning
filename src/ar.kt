fun main() {
    var f = arrayOf(558,6,9,9,5,6,5)
    println(f.contentToString())
    f.reverse()
    println(f.contentToString())
    f = f.sortedArrayDescending()
    println(f.contentToString())

}