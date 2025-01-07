fun main() {

    val user = Users(name = "Manas")
    val friend = Users("Sreyas", "Mohanan", age = 98)

    println("Name:${user.name}")
    println("last Name:${user.lastName}")
    println("age:${user.age}")

    println("\n")

    println("Name:${friend.name}")
    println("last Name:${friend.lastName}")
    println("age:${friend.age}")


}

class Users(var name: String, var lastName: String = "Last name", var age: Int = 0) {


}
