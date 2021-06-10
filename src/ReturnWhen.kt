fun main(){
    fun sayHai(name:String = ""):String{
        return when(name){
            "" -> {
                "Hai bro!"
            }
            else -> {
                "Hello $name"
            }
        }
    }

    println(sayHai())
    println(sayHai("Arga"))

}