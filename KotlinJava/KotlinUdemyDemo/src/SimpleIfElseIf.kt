fun main(args: Array<String>) {
    print("Enter your grade: ")
    var grade = readLine()!!.toDouble()

    if (grade >= 90) {
        println("You are in A level")
    } else if (grade in 80..89) {
        println("You are in B level")
    } else if (grade in 70..79) {
        grade += 10
        println("You've got extra 10 points")
    } else {
        println("You failed!!!")
    }


    println("You entered grade $grade")
}