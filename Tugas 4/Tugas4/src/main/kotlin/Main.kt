class Car {
    var brand = ""
    var model = ""
    var year = 0
}
class Mobil(var brand: String, var model: String, var year: Int){
    fun drive() {
        println("Wrooom!")
    }
    fun speed(maxSpeed: Int) {
        println("Max speed is: " + maxSpeed)
    }
}
// Superclass
open class MyParentClass {
    val x = 5
}

// Subclass
class MyChildClass: MyParentClass() {
    fun myFunction() {
        println(x) // x is now inherited from the superclass
    }
}


fun main(args: Array<String>) {
    // Create a c1 object of the Car class
    val c1 = Car()

    // Access the properties and add some values to it
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    val c2 = Car()
    c2.brand = "BMW"
    c2.model = "X5"
    c2.year = 1999

    println(c1.brand)
    println(c2.brand)
    val c3 = Mobil("Tesla", "Model S", 2020)
    println(c3.brand)
    c3.drive()
    c3.speed(999)
    val myObj = MyChildClass()
    myObj.myFunction()
}