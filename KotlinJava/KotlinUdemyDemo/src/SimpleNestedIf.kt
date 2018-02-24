fun main(args: Array<String>) {
    print("Enter your grade: ")
    var grade = readLine()!!.toDouble()

    if (grade >= 90) {

        if (grade < 93) {
            println("You are in A- level")
        } else {
            println("You are in A+ level")
        }
    }


    println("You entered grade $grade")
}