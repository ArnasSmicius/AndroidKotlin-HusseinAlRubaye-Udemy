fun main(args: Array<String>) {

    var arrayList = ArrayList<String>();
    arrayList.add("Jena")
    arrayList.add("Laya")
    arrayList.add("Hussein")
    arrayList.add("Ahmed")

    println("First name = ${arrayList.get(0)}")
    arrayList.set(0, "Laya Hussein")

    println("All elements")
    for (item in arrayList) {
        println(item)
    }

    println("all elements by index")
    for (index in 0..arrayList.size - 1) {
        println(arrayList[index])
    }

    // Search
    if(arrayList.contains("Hussein")) {
        println("name is found")
    } else {
        println("name is not found")
    }
}