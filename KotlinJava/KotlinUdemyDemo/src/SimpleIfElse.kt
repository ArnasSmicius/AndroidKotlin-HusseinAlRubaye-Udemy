fun main(args: Array<String>) {
    print("Enter your grade: ")
    var grade = readLine()!!.toDouble()

    if (grade >= 90) {
        println("You are in A level")
    } else {
        grade = grade + 10
        println("You've got extra 10 points")
    }


    println("You entered grade $grade")
}