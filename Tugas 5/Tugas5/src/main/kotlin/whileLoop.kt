
fun main(args: Array<String>) {

    var i = 1

    while (i <= 5) {
        println("Line $i")
        ++i
    }

    var sum = 0
    i = 100

    while (i != 0) {
        sum += i     // sum = sum + i;
        --i
    }
    println("sum = $sum")

    sum = 0
    var input: String

    do {
        print("Enter an integer: ")
        input = readLine().toString()
        sum += input.toInt()

    } while (input != "0")

    println("sum = $sum")

}