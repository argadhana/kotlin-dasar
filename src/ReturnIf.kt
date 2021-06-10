fun main(){
    fun sayHello(name: String = ""): String{
        return if (name == ""){
            "hello Bro"
        } else{
            "hello $name"
        }
    }
    println(sayHello())
    println(sayHello("Arga"))
}