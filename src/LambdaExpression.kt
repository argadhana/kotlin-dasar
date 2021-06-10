fun toUpper(value:String): String = value.toUpperCase()
fun main() {
    val lambdaSample: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result

    }
    val result = lambdaSample("Arga", "Dhana")
    println(result)

    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("argadhana"))

    val toUppercase : (String) -> String = ::toUpper
    println(toUppercase("Argadhana"))
}