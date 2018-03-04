fun ArrayList<String>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

fun main(args: Array<String>) {
    var arrayList = ArrayList<String>()
    arrayList.add("Hossein")
    arrayList.add("Jena")
    arrayList.add("Laya")
    println(arrayList)
    arrayList.swap(0, 1)
    println(arrayList)
}