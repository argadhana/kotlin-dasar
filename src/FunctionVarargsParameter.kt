fun semua(vararg a:Int): Int{
    var total = 0

    for (value in a){
        total += value
    }

    return total
}
fun main() {
    println(semua(10,10,10,10,10,10,10,10))
}