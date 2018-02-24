fun main(args: Array<String>) {

    val x = 10

    when (x) {
        1 -> println("Value is 1")
        2, 3 -> println("Value is 2 or 3")
        in 4..10 -> println("Value is more than 3, but less than 11")
        else -> {
            println("Value is more then 10, or less then 1")
        }
    }
}