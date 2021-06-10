fun sayHello(firstName: String, lastName: String?){
    if (lastName == null){
        println("HALLO $firstName")
    }else{
        println("Hallo $firstName $lastName")
    }
}
fun main() {
    sayHello("Arga", null)
    sayHello("Arga", "dhana")
}