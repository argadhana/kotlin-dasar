infix fun String.to(type:String): String{
    if (type == "UP"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}

fun main() {
    val ress = "Argadhana"
    println(ress to "LO")
}