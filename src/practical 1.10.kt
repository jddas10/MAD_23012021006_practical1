class Car(
    val type: String,
    val model: String,
    val originalprice: Double,
    val currentprice: Double,
    val owner: String,
    val milesdriven: Double
) {
    fun displaycarinfo() {
        println("-----------------")
        println("Car information : $type , $model")
        println("Car owner : $owner")
        println("Miles Drive : $milesdriven")
        println("Original Car price : $originalprice")
        println("Current price : $currentprice")
        println("-----------------")
    }
}

fun main() {
    val car1 = Car("BMW", "2018", 100000.0, 9999.0, "Bhavya", 105.0)
    car1.displaycarinfo()

    println("*************** Array list of Cars ****************")

    val carlist = arrayListOf(
        Car("BMW", "M5", 5000000.0, 40000000.0, "Jaydatt dave", 15000.0),
        Car("Mercides", "M5", 5000000.0, 40000000.0, "JDDAS", 15000.0)
    )

    carlist.forEach { it.displaycarinfo() }
}