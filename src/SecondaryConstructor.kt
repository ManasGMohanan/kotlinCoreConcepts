fun main() {

    val user = User("Manas")
    val friend = User("Sreyas", "Mohanan")

    println("Name:${user.name}")
    println("last Name:${user.lastName}")
    println("age:${user.age}")

    println("\n")

    println("Name:${friend.name}")
    println("last Name:${friend.lastName}")
    println("age:${friend.age}")


}

class User(var name: String, var lastName: String, var age: Int) {

    constructor(name: String) : this(name, "Last name", 0)

    constructor(name: String, lastName: String) : this(name, lastName, 0)

}
