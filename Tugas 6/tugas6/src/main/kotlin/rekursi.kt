import java.math.BigInteger
fun main(args: Array<String>) {
    val number = 4
    val result: Long

    result = factorial(number)
    println("Factorial of $number = $result")
    val n = 100
    val first = BigInteger("0")
    val second = BigInteger("1")

    println(fibonacci(n, first, second))

    val number2 = 5
    println("Factorial of $number2 = ${factorial2(number2)}")
}

fun factorial(n: Int): Long {
    return if (n == 1) n.toLong() else n*factorial(n-1)
}

// rekursi ekor (tailrec)
tailrec fun fibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) a else fibonacci(n-1, b, a+b)
}

tailrec fun factorial2(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial2(n-1, run*n)
}
