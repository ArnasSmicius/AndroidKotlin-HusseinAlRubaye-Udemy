import java.io.FileWriter

fun main(args: Array<String>) {
    print("Write text to file: ")
    var str = readLine().toString()
    writeToFile(str)
}

fun writeToFile(str: String) {
    try {
        var fo = FileWriter("test.txt", true)
        fo.write(str + "\n")
        fo.close()
    } catch (e: Exception) {
        println(e.message)
    }
}