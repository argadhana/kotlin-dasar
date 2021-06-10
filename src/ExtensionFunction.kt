fun String.hello(): String = "Hello $this"

fun main() {
    val name = "Arga"
    println(name.hello())
}