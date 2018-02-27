fun main(args: Array<String>) {

    var map = hashMapOf(1 to "hossein", 2 to "jena")
    map.put(3, "Laya")
    println(map.get(3))
    println(map[3])

    var array = arrayOf(1, 10, 22, 11)
    println(array[0])

    var list = mutableListOf(11, 22, 33, 22)
    list[0] = 22
    for (item in list) {
        println(item)
    }
}