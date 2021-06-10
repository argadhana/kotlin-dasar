fun main() {
    val names = arrayOf("Arga", "Dhana", "Nugroho", "Siwi")

    for (name in names){
        println(name)
    }
    val lengthNames = names.size -1
    for (i in 0..lengthNames){
        println("Index ke $i adalah ${names.get(i)}")
    }
}