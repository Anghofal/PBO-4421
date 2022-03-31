fun main(args: Array<String>) {
    val a = 12
    val b = 5

    // readline semacam input()
    println("Enter operator either +, -, * or /")
    val operator = readLine()
    //semacam switch case
    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator."
    }

    println("result = $result")

    //cara lain when
    println("Enter operator either +, -, * or /")
    val operator2 = readLine()

    //"{a + b}" merupakan penjumlahan dalam string
    when (operator2) {
        "+" -> println("$a + $b = ${a + b}")
        "-" -> println("$a - $b = ${a - b}")
        "*" -> println("$a * $b = ${a * b}")
        "/" -> println("$a / $b = ${a / b}")
        else -> println("$operator2 is invalid")
    }
    // seperti statements
    val n = 0

    when (n) {
        1, 2, 3 -> println("n is a positive integer less than 4.")
        0 -> println("n is zero")
        -1, -2 -> println("n is a negative integer greater than 3.")
    }

    // when dengan range

    val x = 100

    when (x) {
        in 1..10 -> println("A positive number less than 11.")
        in 10..100 -> println("A positive number between 10 and 100 (inclusive)")

    }

    //debugging tipe data menggunakan when

    when (x) {
        is Int -> print(x + 1)
        //is String -> print(x.length + 1)
        //is IntArray -> print(x.sum())
    }
    // contoh lain
    val t = 11
    val u = "11"

    when (u) {
        "cat" -> println("Cat? Really?")
        12.toString() -> println("Close but not close enough.")
        t.toString() -> println("Bingo! It's eleven.")
    }
}