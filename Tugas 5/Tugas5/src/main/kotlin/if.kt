fun main2(args: Array<String>) {
    val number = -10
    // traditional expression
    if (number > 0) {
        print("Positive number")
    } else {
        print("Negative number")
    }

    // kotlin expression
    val numberpostiv = 10

    val result = if (numberpostiv > 0) {
        "Positive number"
    } else {
        "Negative number"
    }
    println(result)

    // sama aja tapi lebih singkat
    val singkat = if (number > 0) "Positive number" else "Negative number"
    println(singkat)

    //
    val a = -9
    val b = -11

    // akan memanggil expression dahulu lalu memanggil max = (value yang di masukkan di akhir)
    val max = if (a > b) {
        println("$a is larger than $b.")
        println("max variable holds value of a.")
        a
    } else {
        println("$b is larger than $a.")
        println("max variable holds value of b.")
        b
    }
    println("max = $max")

    //else if kotlin
    val number1 = 0

    val result1 = if (number1 > 0)
        "positive number"
    else if (number1 < 0)
        "negative number"
    else
        "zero"

    println("number is $result1")

    //nested if
    val n1 = 3
    val n2 = 5
    val n3 = -2

    val max2= if (n1 > n2) {
        if (n1 > n3)
            n1
        else
            n3
    } else {
        if (n2 > n3)
            n2
        else
            n3
    }

    println("max = $max2")
}