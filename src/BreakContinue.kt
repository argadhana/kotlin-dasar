fun main() {
    var i = 0

    while (true){
        println("Ga berenti")
        i++
        if (i == 100){
            break
        }
        println(i)
    }


   for (i in 1..1000){
       if(i%2==0){
           continue
       }
       println(i)
   }
}