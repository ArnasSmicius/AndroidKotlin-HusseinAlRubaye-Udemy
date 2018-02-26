fun main(args: Array<String>) {

    var map = HashMap<Int, String>()
    map.put(1, "Hussein")
    map.put(2, "Jena")
    map.put(3, "Laya")
    println(map[3])

    map.put(3, "Laya Ahmed")
    for (k in map.keys) {
        println(map[k])
    }
}