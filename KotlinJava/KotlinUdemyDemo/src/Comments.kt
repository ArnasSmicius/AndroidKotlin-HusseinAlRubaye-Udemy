
// This is main function
fun main(args:Array<String>) {

    // Enter user name
    print("Enter name: ")
    val name= readLine()
    print("Enter age: ")
    var age:Int= readLine()!!.toInt()
    print("Enter department: ")
    var dep:String?
    dep= readLine()

    /* print output
     to allow users to see the variable values
    */
    println("**** output ****")
    println("name: " + name)
    println("age: " + age)
    println("department: " + dep)
}