fun main() {
    val finalExam = "A"
    when(finalExam){
        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Good")
        }
        "C" -> {
            println("Not Bad")
        }
        else -> {
            println("Ngulang lagi nih")
        }
    }

    when(finalExam){
        "A", "B", "C" -> {
            println("Not Bad")
        }
        else ->{
            println("Hdehh")
        }
    }

    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")

    when(finalExam) {
        in nilaiLulus -> {
           println("LULUS")
        }
        !in nilaiLulus -> {
            println("Maaf ngulang lagi tahun depan")
        }
    }
}