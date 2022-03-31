fun main(args: Array<String>) {

    print("for (i in 1..5) print(i) = ")
    for (i in 1..5) print(i)

    println()

    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) print(i)             // prints nothing

    println()

    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)

    println()

    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) print(i)

    println()

    print("for (i in 5 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) print(i)

    var language = arrayOf("Ruby", "Kotlin", "Python" ,"Java")

    //for each untuk array language
    for (item in language)
        println(item)


    // for each menggunakan index(item)
    for (item in language.indices) {

        // printing array elements having even index only
        if (item%2 == 0)
            println(language[item])
    }

    //for each di string
    var text= "Kotlin"

    for (letter in text) {
        println(letter)
    }
    //for each string namun dengan index(item)

    for (item in text.indices) {
        println(text[item])
    }

    //break di kotlin
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println(i)
    }

    // break jika number sampai 0
    var sum = 0
    var number: Int

    while (true) {
        print("Enter a number: ")
        //readline.toString().toInt()
        number = readLine()!!.toInt()

        if (number == 0)
            break

        sum += number
    }
    print("sum = $sum")

    //identifier kotlin
    // digunakan untuk menghentikan loop tertentu(disini menghentikan loop first saja)
    first@ for (i in 1..4) {

        second@ for (j in 1..2) {
            println("i = $i; j = $j")

            if (i == 2)
                break@first
        }
    }

    //kotlin continue
    for (i in 1..5) {
        println("$i selalu tercetak.")
        if (i > 1 && i < 5) {
            // ketika kondisi nya memenuhi maka akan langsung break
            // dan memulai lagi loop nya
            //ketika kondisi tidak memenuhi maka loop akan mencetak semua statement
            // di dalam fungsi for seperti println("ayo")
            continue
        }
        println("$i kondisi memenuhi.")
        println("ayo")
    }

    //contoh program continue
    number = 0
    sum = 0

    // perulangan 6 kali dan menjumlahkan semua nilainya
    for (i in 1..6) {
        print("Enter an integer: ")
        number = readLine()!!.toInt()

        //namun ketika nilai yang dimasukkan negatif maka nilai tidak akan ditambahkan
        if (number <= 0)
            continue

        sum += number
    }
    println("sum = $sum")

    // identifier di dalam for loop continue

    here@ for (i in 1..5) {
        for (j in 1..4) {
            if (i == 3 || j == 2)
                continue@here
            println("i = $i; j = $j")
        }
    }
}