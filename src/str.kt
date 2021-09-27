fun main(){
    val largeString = """
    This is the house that Jack built.
      
    This is the malt that lay in the house that Jack built.
       
    This is the rat that ate the malt
    That lay in the house that Jack built.
       
    This is the cat
    That killed the rat that ate the malt
    That lay in the house that Jack built.
""".trimIndent() // removes the first and the last lines and trim indents
    print(largeString)
}