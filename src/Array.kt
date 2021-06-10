fun main() {

    val names: Array<String> = arrayOf("Arga", "Dhana", "Nugroho")
    println(names.get(0))
    println(names[1])

    names.set(0, "Siwi")
    names.set(1, "Ontaa")

    println(names.get(0))
    println(names[1])

    //Null Array
    val age: Array<Int?> = arrayOfNulls(5)
    age[0] = 15
    age[1] = null
    age[2] = null
    age[3] = 42
    age[4] = 12

    println(age[1])
}