class UserAdmin<T> (credit:T) {
    init {
        println(credit)
    }
}

fun <T> display(process: T) {
    println(process)
}

fun main(args: Array<String>) {
    var userAdmin = UserAdmin("Hussein")
    var userAdmin2 = UserAdmin(123)

    display<Int>(22)
    display("Process user")

}