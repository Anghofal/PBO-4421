fun main(args: Array<String>) {
    val a = true
    val b = false
    var result: Boolean

    // false and true
    result = b or a // a.or(b)
    println("result = $result")
    // true and false
    result = a and b // a.and(b)
    println("result = $result")

    val p = Structure()
    p.createPyramid(4)
}
//
class Structure() {

    infix fun createPyramid(rows: Int) {
        var k = 0
        for (i in 1..rows) {
            k = 0
            for (space in 1..rows-i) {
                print("  ")
            }
            while (k != 2*i-1) {
                print("* ")
                ++k
            }
            println()
        }
    }
}