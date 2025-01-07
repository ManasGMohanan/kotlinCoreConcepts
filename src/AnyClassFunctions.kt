fun main() {

    val emp1 = Employee("Manas", "Mohanan", 25)
    val emp2 = Employee("Manas", "Mohanan", 25)

    println(emp1.equals(emp2))

    println(emp1)
    println(emp2)

}

class Employee(var firstName: String, var lastName: String, var age: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other is Employee) {
            return this.firstName == other.firstName
                    && this.lastName == other.lastName
                    && this.age == other.age
        }
        return false
    }

    override fun hashCode(): Int {
        return 0
    }

    override fun toString(): String {
        return "Employee=(firstName : $firstName, lastName: $lastName, age :$age)"
    }

}