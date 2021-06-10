const val APP = "Belajar Kotlin Dasar"
const val VERSION = 1.1
fun main() {
    val firstName = "Arga"
    val age = 18

    println(firstName)
    println(age)

    var name: String? = null
    name = "Argadhana"
    println(name)
    println(name?.length)

    println(APP)
    println(VERSION)
}