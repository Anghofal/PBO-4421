fun main(args: Array<String>) {
    var number = 5.5
    /*print("Result = ${Math.sqrt(number)}")
    callMeee()*/
    val number1 = 12.2
    val number2 = 3.4
    val result: Int

    result = addNumbers(number1, number2)
    //println("result = $result")
    println(getName("coba","test"))
}
fun callMeee() {
    println("Printing from callMe() function.")
    println("This is cool (still printing from inside).")
}

//return type functions
fun addNumbers(n1: Double, n2: Double): Int {
    val sum = n1 + n2
    val sumInteger = sum.toInt()
    return sumInteger
}
//return type function with =
fun getName(firstName: String, lastName: String): String = "$firstName $lastName"