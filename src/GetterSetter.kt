fun main() {

    val user = Man(name = "Manas")

    println(user.firstName) // usage of getter implicitly inside the call
    println("last Name:${user.lastName}")
    println("age:${user.age}")

    user.firstName = "Surya" // usage of setter implicitly inside the call


}

class Man(name: String, var lastName: String = "Last name", var age: Int = 0) {

    var firstName = name
        //we can override the implicit getter and setter
        // getter and setter overriding
        get() {
            return "firstName:$field"
        }
        set(value) {
            println("$value was assigned to name property")
            field = value
        }


}
