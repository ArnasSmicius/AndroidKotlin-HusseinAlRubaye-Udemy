open class Operations {
    protected var processName: String? = null

    fun sum(n1: Int, n2: Int): Int = n1 + n2

    fun division(n1: Int, n2: Int): Int = n1 / n2
}

class MultiOperation: Operations() {
    fun sub(n1: Int, n2: Int): Int = n1 - n2

    fun mult(n1: Int, n2: Int): Int = n1 * n2

    fun getName(): String? {
        return processName
    }
}

fun main(args: Array<String>) {
    var op = Operations()
    var sum = op.sum(10, 15)
    println("Sum = $sum")
    var div = op.division(12, 11)
    println("Div = $div")

    var op2 = MultiOperation()
    sum = op2.sum(10, 15)
    println("Sum = $sum")
    div = op2.division(12, 11)
    println("Div = $div")
}