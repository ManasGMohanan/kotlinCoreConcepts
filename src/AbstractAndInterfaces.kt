fun main() {
    val circle = Circle(5.0)
    val rectangle = Rectangle(4.0, 6.0)

    circle.displayInfo() // This is a Circle.
    println("Area: ${circle.calculateArea()}") // Area: 78.53981633974483

    rectangle.displayInfo() // This is a Rectangle.
    println("Area: ${rectangle.calculateArea()}") // Area: 24.0

    val dog = Dog("Buddy")
    val cat = Cat("Whiskers")

    dog.makeSound() // Buddy says: Woof, Woof!
    dog.eat()       // Buddy is eating.



    cat.makeSound() // Whiskers says: Meow!
    cat.eat()       // Whiskers is eating.
}

//Abstract class

abstract class Shape(val name: String) {

    val area: Int = 0
    abstract fun calculateArea(): Double // Abstract method

    fun displayInfo() { // Non-abstract method
        println("This is a $name.")
    }
}

class Circle(val radius: Double) : Shape("Circle") {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

class Rectangle(val length: Double, val width: Double) : Shape("Rectangle") {
    override fun calculateArea(): Double {
        return length * width
    }
}

//--------------------------------------------------------------------------------------------

//Interfaces

interface Animal {
    val name: String // Abstract property

    fun makeSound() // Abstract method

    fun eat() { // Method with a default implementation
        println("$name is eating.")
    }
}

class Dog(override val name: String) : Animal {
    override fun makeSound() {
        println("$name says: Woof Woof!")
    }
}

class Cat(override val name: String) : Animal {
    override fun makeSound() {
        println("$name says: Meow!")
    }
}

//-----------------------------------------------------------------------------------------------------

