fun show(name: String) {
    println("name: $name")
}

fun show(number: Int) {
    println("number: $number")
}

fun show(numberD: Double) {
    println("numberD: $numberD")
}

fun main(args: Array<String>) {
    show("Arnas")
    show(23)
    show(2.2)
}