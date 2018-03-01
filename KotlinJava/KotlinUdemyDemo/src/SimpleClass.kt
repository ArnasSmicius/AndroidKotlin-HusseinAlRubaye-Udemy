class Car(var type: String, var model: Int, var price: Double, var milesDrive: Int, var owner: String) {
//    init {
//        println("type: $type")
//        println("model: $model")
//        println("price: $price")
//        println("milesDrive: $milesDrive")
//        println("owner: $owner")
//    }

    fun getCarPrice():Double {
        return this.price - ( this.milesDrive.toDouble() * 10)
    }
}

fun main(args: Array<String>) {
    val huCar = Car("BMW", 2015, 100000.0, 105, "Hussein")
    println("huCar: " + huCar.getCarPrice())
    var jeCar = Car("KA", 2017, 2000.0, 1, "Jena")
    println("jeCar: " + jeCar.getCarPrice())
}