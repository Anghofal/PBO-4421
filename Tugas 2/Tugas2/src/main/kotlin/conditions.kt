class conditions {
    fun conditions(){
        var nama = "jono"
        var nama2 = "jakaa"

        if (nama == "jono"&&nama2=="jaka"){
            println("ini jono dan jaka")
        }else if (nama == "jono"&&nama2!="jaka"){
            println("ini jono dan bukan jaka")
        }else if (nama != "jono"&&nama2=="jaka"){
            println("ini jaka dan bukan jono")
        }else{
            println("ini bukan jono ataupun jaka")
        }

        // when(switch case)
        val hasil = when (nama){
            "jono" ->"ini jono"
            "jaka" ->"ini jaka"
            else -> "ini bukan jono ataupun jaka"
        }
    }
}