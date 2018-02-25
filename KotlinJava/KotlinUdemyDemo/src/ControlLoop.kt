fun main(args: Array<String>) {
    loop@ for (count in 1..10) {
        if(count == 4) continue

        println("count = $count")

        for (count2 in 1..5) {
            println("count2 = $count2")
            if (count2 == 2) break@loop
        }
    }

    println("Loop done")
}