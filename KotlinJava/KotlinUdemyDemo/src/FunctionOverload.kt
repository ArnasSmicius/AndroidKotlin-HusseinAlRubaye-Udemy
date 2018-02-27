fun main(args: Array<String>) {
    var sumNumber = sum(10, 11)
    display(sumNumber)

    sumNumber = sum(10, 11, 15)
    display(sumNumber, "sum")

    sumNumber = sum(10)
    display(sumNumber, "sum")
}

fun sum(n1: Int, n2: Int): Int {
    return n1+n2
}

fun sum(vararg numbers: Int): Int {
    var sum: Int = 0
    numbers.forEach { sum += it }
    return sum
}

fun display(number: Int, name: String = "Number") {
    println("$name = $number")
}