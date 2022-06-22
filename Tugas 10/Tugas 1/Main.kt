fun main(args: Array<String>) {
    val a = intArrayOf(2, 26, 38, 7)
    var b = balik(a)
    var c = arrGenap(b)
    for (i in c){
        println(i)
    }

}

fun balik(intArray: IntArray):IntArray{
    val b = IntArray(intArray.size)

    for (i in intArray.indices){
        b[i] = intArray[intArray.size-1-i]
    }
    return b
}

fun arrGenap(intArray: IntArray): ArrayList<Int> {
    val c = ArrayList<Int>()
    var i = 0
    while (i<intArray.size){
        if (intArray[i]%2==0){
            c.add(intArray[i])
        }
        i++
    }
    return c
}