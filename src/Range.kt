fun main() {
//    val range = 1..1000

    val range = 1000 downTo 1 step 2
    println(range.count())
    println(range.contains(50))
    println(range.contains(5000))
    println(range.last)
    println(range.step)



}