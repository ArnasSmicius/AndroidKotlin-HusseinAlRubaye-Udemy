fun main(args: Array<String>) {

    var r = sum(10.toDouble(), 12.toDouble())
    display(r)

    r = sum(10.0, 12.0)
    display(r)

    r = sum(10.0, 12.0)
    display(r)

}

fun sum(n1: Double, n2: Double): Double {
    return n1 + n2
}

fun display(number: Double) {
    println("Number = $number")
}