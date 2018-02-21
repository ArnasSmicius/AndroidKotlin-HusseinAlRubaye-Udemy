import java.time.LocalDateTime

fun main(args: Array<String>) {

    // input
    print("Enter your DOB: ")
    var dob:Int = readLine()!!.toInt()

    // process
    var age = LocalDateTime.now().year - dob

    // output
    println("Your age is $age years")

}