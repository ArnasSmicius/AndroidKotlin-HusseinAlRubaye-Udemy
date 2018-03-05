fun main(args: Array<String>) {
    print("Please enter N2: ")
    var n2: Int = readLine()!!.toInt()
    var div = 0
    try {
        div = 100 / n2
    } catch (e: ArithmeticException) {
        println("Can't divide by zero")
    }
    println("DIV: $div")
    println("App is done")
}