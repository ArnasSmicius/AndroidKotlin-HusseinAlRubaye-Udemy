import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {
    readFromFile()
    print("Write text to file: ")
    val str = readLine().toString()
    writeToFile(str)
}

fun writeToFile(str: String) {
    try {
        val fo = FileWriter("test.txt", true)
        fo.write(str + "\n")
        fo.close()
    } catch (e: Exception) {
        println(e.message)
    }
}

fun readFromFile() {
    try {
        val fin = FileReader("test.txt")
        fin.forEachLine { println(it) }
        fin.close()

    } catch (ex: Exception) {
        println(ex.message)
    }
}