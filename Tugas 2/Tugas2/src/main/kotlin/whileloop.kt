class whileloop {
    fun loop(){
        var i = 0

        while (i<=5){
            print(i)

            if(i==3){
                break
            }
            i++
        }
        println()
        i = 1
        do {
            print(i)
            i++
            if(i==5){
                continue

            }
        }while (i<5)
        println()
    }
}