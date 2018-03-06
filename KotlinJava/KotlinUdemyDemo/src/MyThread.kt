import java.lang.Thread

fun main(args: Array<String>) {

    var t1 = thread()
    t1.name = "Thread 1"
    t1.start()

    var t2 = thread()
    t2.name = "Thread 2"
    t2.start()

    println("UI Thread")

}

class thread: Thread() {

    override fun run() {
        var count = 0
        while (count < 10) {
            println("${this.name} counter = $count")
            count++

            try {
                Thread.sleep(1000)
            } catch (ex: Exception) {
                println(ex.message)
            }
        }
    }

}