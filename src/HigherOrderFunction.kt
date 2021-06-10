fun main() {
    fun hello(name:String, transformer: (String)->String):String{
        val nameTransformer = transformer(name)
        return "Hello $nameTransformer"

    }

    val lambdaUpper = {value: String -> value.toUpperCase()}
    println(hello("Arga", lambdaUpper))

    println(hello("Arga", {value:String -> value.toLowerCase()}))
    println(hello("arga"){value:String ->
        value.toUpperCase()
    })
}