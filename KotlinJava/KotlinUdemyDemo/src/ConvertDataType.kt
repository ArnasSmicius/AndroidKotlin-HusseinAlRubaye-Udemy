

fun main(args:Array<String>) {

    var n1:Int=10
    var n2:Int?
    n2 = "Arnas".toIntOrNull()
    var n2Float:Float?
    n2Float = "12".toFloat()


    println("n1 = " + n1)
    println("n2 = " + n2)
    println("n2Float = " + n2Float)

    var xpi:Double = 3.14
    println("xpi = " + xpi)
    var intPi:Int=xpi.toInt()
    println("intPi = " + intPi.toString())
}