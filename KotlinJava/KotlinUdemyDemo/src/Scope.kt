var fullName = "Arnas Smicius" // Global variable

fun display() {
    println("name: $fullName")
}

fun main(args: Array<String>) {
    var name = "Arnas" // Local variable

    println("name: $name")
    println("name: $fullName")
    display()
}