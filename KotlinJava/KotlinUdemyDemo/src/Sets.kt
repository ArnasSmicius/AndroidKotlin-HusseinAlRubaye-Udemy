fun main(args: Array<String>) {

    var setelement = setOf(1, 2, 3, 11, 44, 55, 55)
    for (element in setelement) {
        println(element)
    }

    var setelementM = mutableSetOf(1, 2, 3, 11, 44, 55, 55)
    setelementM.add(77)
    for (element in setelementM) {
        println(element)
    }
}