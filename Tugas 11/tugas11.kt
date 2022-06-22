import land as land

fun main(){
    val cat = cat()
    cat.move()
    cat.talking()
    val dog = dog()
    dog.move()
    dog.talking()
}
interface animal{
    var size:String
    var foot:Int

    fun move(){
    }
}

open class aquatic:animal{
    override var size: String = "0.005 m - 200 m"
    override var foot: Int = 0
    var food = arrayOf("plankton","small fish","amoeba")
    var breath = arrayOf("gill","lung")

    override fun move() {
        super.move()
        println("im swimming")
    }
}

open class land:animal{
    override var foot: Int = 4
    override  var size:String = "0.1m - 30m"
    override fun move() {
        println("im running")
    }
    open fun talking(){
        println("how iam talk?")
    }
}

class cat:land(){
    override fun move() {
        println("how cat move?")
        super.move()
    }

    override fun talking() {
        super.talking()
        println("Meoww i have $foot foot and $size size")
    }

}

class dog:land(){
    override fun move() {
        println("how dog move?")
        super.move()
    }

    override fun talking() {
        super.talking()
        println("woof woof i have $foot foot and $size size")
    }

}
