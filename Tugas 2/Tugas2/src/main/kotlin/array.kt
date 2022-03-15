class array {
    fun array(){
        val buah = arrayOf("mangga", "jambu", "apel", "pisang")
        println(buah[2])
        buah[2] = "jeruk"
        println(buah[2])

        println(buah.size)

        if ("jeruk" in buah){
            println("jeruk nya ada")
        }
        for (i in buah){
            print(i+", ")
        }
        println()
    }
}