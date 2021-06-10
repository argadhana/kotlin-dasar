fun main() {
    fun hello(name:String, transformer: (String)->String):String{
        val nameTransformer = transformer(name)
        return "Hello $nameTransformer"

    }

    val upper = fun(value:String):String{
        if (value == ""){
            return "UPS"
        } else{
            return value.toUpperCase()
        }
    }
    println(hello("Arga", upper))
    println(hello("arga", fun(value:String):String{
        if (value == ""){
            return "UPS"
        } else{
            return value.toUpperCase()
        }
    }))
}