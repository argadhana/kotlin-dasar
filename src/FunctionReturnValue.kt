fun kali(a:Int, b:Int): Int{
    val total = a * b
    return total
}

fun bagi(a:Int, b:Int):Int{
    if (b == 0){
        return 0
    } else{
        val total = a / b
        return total
    }
}

fun main() {
    val hasil = kali(19,10)
    println(hasil)

    val enol = bagi(10, 0 )
    println(enol)
}