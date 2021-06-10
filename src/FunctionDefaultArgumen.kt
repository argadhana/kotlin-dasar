fun Hello(firstName: String, lastName: String? = null){
    if (lastName == null){
        println("Hai $firstName")
    } else{
        println("Hai $firstName $lastName")
    }

}
fun main() {
    Hello("Arga", "Dhana")
    Hello("Arga")
}