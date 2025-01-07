fun main() {

    for (directions in Directions.entries) {
        println(directions)
    }

    val direction = Directions.valueOf("east".uppercase())

    when (direction) {
        Directions.NORTH -> println("The direction is $direction")
        Directions.SOUTH -> println("The direction is $direction")
        Directions.EAST -> println("The direction is $direction")
        Directions.WEST -> println("The direction is $direction")
    }

    Directions.NORTH.printData()

}

enum class Directions(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 15),
    EAST("east", 25),
    WEST("west", 40);

    fun printData(){
        println("The direction is $direction and distance is $distance")
    }
}