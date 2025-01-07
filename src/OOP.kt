fun main() {

    val car1 = Car("swift", "vxi","red",4)

    println("Name = ${car1.name}")
    println("Model = ${car1.model}")
    println("color = ${car1.color}")
    println("doors = ${car1.doors}")

    car1.move()
    car1.stop()

    val car2 = Car("Toyota","innova","blue",5)

    println("\n")

    println("Name = ${car2.name}")
    println("Model = ${car2.model}")
    println("color = ${car2.color}")
    println("doors = ${car2.doors}")

    car2.move()
    car2.stop()

}

class Car(val name: String, var model: String, var color: String, var doors: Int) {

    fun move() {
        println("The car $name is moving")
    }

    fun stop() {
        println("The car $name is stopped")
    }
}