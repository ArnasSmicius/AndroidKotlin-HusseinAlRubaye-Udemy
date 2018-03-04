class Outer {
    val name: String? = null

    class Nested {
        fun show() {
            println("Nested")
        }
    }
}

fun main(args: Array<String>) {
    var outer = Outer()
    var nested = Outer.Nested()
    nested.show()
}