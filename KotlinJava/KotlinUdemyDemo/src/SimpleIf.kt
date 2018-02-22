fun main(args: Array<String>) {
    print("Enter your grade: ")
    var grade = readLine()!!.toDouble()

    if (grade >= 90) {
        println("You are in A level")
    }

    if (grade in 50..70) {
        grade = grade + 10
        println("You've got extra 10 points")
    }


    println("You entered grade $grade")
}