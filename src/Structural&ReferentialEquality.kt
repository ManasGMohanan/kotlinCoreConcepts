fun main() {
    val obj1 = "Hello" // String literal, stored in the string pool
    val obj2 = "Hello" // Another string literal with the same content, points to the same object in the pool
    val obj3 = obj1 // obj3 is assigned the reference of obj1, so both point to the same object
    val obj4 = String("Hello".toCharArray()) // Creates a new String object explicitly, bypassing the string pool

    println("Referential Equality:")
    println("obj1 === obj2: ${obj1 === obj2}")
    /*
    true, because string literals with the same content are interned by the compiler to save memory.
    This means that obj1 and obj2 both point to the same memory reference because they have the same value "Hello".
    */

    println("obj1 === obj3: ${obj1 === obj3}") // true, same instance
    println("obj1 === obj4: ${obj1 === obj4}") // false (different instances)


    println("\nStructural Equality:")
    println("obj1 == obj2: ${obj1 == obj2}") // true, same content
    println("obj1 == obj3: ${obj1 == obj3}") // true, because obj1 and obj3 have the same content ("Hello")
    println("obj1 == obj4: ${obj1 == obj4}") // true, because obj1 and obj4 have the same content ("Hello")

}

/*
NB:
The behavior you are observing is due to Kotlin's string interning.
In Kotlin (and Java), string literals with the same content are interned by the compiler to save memory.
This means that obj1 and obj2 both point to the same memory reference because they have the same value "Hello".
 */