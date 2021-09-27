fun main(){
    val totalSeconds = System.currentTimeMillis() / 1000
    val hh = totalSeconds / 3600
    val hhOst = totalSeconds % 3600
    val mm = hh / 60
    val ss = hhOst % 60
    print("$hh:$mm:$ss")
}