fun main() {

    val user1 = man("Alex", "Dob", 23)

    val use2 by lazy {
        man("Manas", "Mohanan", 26)
    }

    println(use2.name)

}

class man(var name: String, var lastName: String, var age: Int) {

    init {
        println("User: $name was created")
    }

}