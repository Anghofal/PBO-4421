fun main(args: Array<String>) {
    jam()
    simetris()
}

fun jam(){
    val number = readln().toInt()
    val hour = number/3600
    val minute = number%3600/60
    val sec = number%60

    println("$hour:$minute:$sec")
}

fun simetris(){
    val palindrom = readln()
    if (palindrom.length%2 == 1){
        println("false")
    }
    else{
    var i = 0
    var j = palindrom.length - 1

    while (i < j) {
        if (palindrom[i] != palindrom[j]) {
            println("false")
            break
        }
        if (i == j - 1) println("true")
        i++
        j--
        }
    }
}