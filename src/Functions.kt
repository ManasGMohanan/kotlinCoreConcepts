fun main() {

    sayHello("Manas",25)

    val max = getMax(8,7)
    println("maximum no is $max")
}

fun sayHello(name: String, age: Int) {
    println("Hello, $name! your age is $age")
}

//fun getMax(num1 : Int, num2: Int) : Int {
//
////    val max = if (num1 > num2) num1 else num2
////    return max
//
//    return if (num1 > num2) num1 else num2
//}

//or

fun getMax(num1 : Int, num2: Int) = if (num1 > num2) num1 else num2