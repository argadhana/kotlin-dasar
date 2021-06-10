fun main() {
    var firstName: String = "Arga"
    var lastName: String = "Dhana"

    var address: String = """
        |Jalan mana aja sih
        |asal sama kamu
        |mestinya
    """.trimMargin()
    println(firstName)
    println(lastName)
    println(address)

    var fullName: String = "$firstName $lastName"
    println(fullName)

    var desc: String = "$fullName panjang = ${fullName.length}"
    println(desc)
}