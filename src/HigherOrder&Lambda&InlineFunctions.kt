// Lambda Function Example
// A lambda function is a concise way to write a function literal.
//It is essentially an anonymous function that can be passed as an argument, returned from another function, or assigned to a variable.
fun main() {
    // Lambda assigned to a variable
    val greet: (String) -> Unit = { name ->
        println("Hello, $name!")
    }

    // Call the lambda function
    greet("Manas") // Output: Hello, Manas!

    // Shorter version of a lambda (if there's only one parameter, it can be referred to as 'it')
    val square: (Int) -> Int = { it * it }

    println(square(5)) // Output: 25

    // Passing a lambda to a higher-order function
    calculate(4, 5) { a, b -> a + b } // Output: Sum: 9
    calculate(4, 5) { a, b -> a * b } // Output: Product: 20

    // Inline function example
    inlineFunctionExample {
        println("This lambda is inlined!")
    }

    // Using common higher-order functions from Kotlin's standard library
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    // Filter out even numbers using a lambda
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even numbers: $evenNumbers") // Output: Even numbers: [2, 4, 6]

    // Filter out numbers greater than 3
    val greaterThanThree = numbers.filter { it > 3 }
    println("Numbers greater than 3: $greaterThanThree") // Output: Numbers greater than 3: [4, 5, 6]

    // Map: Transform each element in the list
    val squares = numbers.map { it * it }
    println("Squares: $squares") // Output: Squares: [1, 4, 9, 16, 25, 36]

    // forEach: Perform an action for each element
    numbers.forEach { println("Number: $it") }

    // Reduce: Combine all elements into a single value
    val sum = numbers.reduce { acc, number -> acc + number }
    println("Sum of numbers: $sum") // Output: Sum of numbers: 21

    // Any: Check if any element matches a condition
    val hasEven = numbers.any { it % 2 == 0 }
    println("Has even numbers: $hasEven") // Output: Has even numbers: true

    // All: Check if all elements match a condition
    val allPositive = numbers.all { it > 0 }
    println("All positive: $allPositive") // Output: All positive: true

    // None: Check if no element matches a condition
    val noneNegative = numbers.none { it < 0 }
    println("No negative numbers: $noneNegative") // Output: No negative numbers: true
}

// Higher-Order Function Example
// A higher-order function takes another function as a parameter or returns a function.
fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int) {
    val result = operation(a, b)
    println("Result: $result")
}

// Inline Function Example
// An inline function inlines the body of the function at the call site, avoiding lambda overhead.
inline fun inlineFunctionExample(action: () -> Unit) {
    println("Before action")
    action() // This lambda will be inlined
    println("After action")
}
