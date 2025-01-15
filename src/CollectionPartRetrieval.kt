fun main() {
    //Retrieving collection parts

    //slice
    //function extracts elements based on specific indices:
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.slice(1..3))
    println(numbers.slice(0..4 step 2))
    println(numbers.slice(setOf(3, 4, 0)))

    println("\n")

    //take and takeLast
    //The take function extracts the first N elements of the list, while takeLast extracts the last N elements.
    println(numbers.take(3))
    println(numbers.takeLast(2))

    //drop and dropLast
    //The drop function skips the first N elements and returns the rest, while dropLast skips the last N elements.
    println(numbers.drop(2))
    println(numbers.dropLast(4))

    println("\n")

    //using predicates
    //takeWhile and takeLastWhile
    //These extract elements as long as the condition is true.
    println(numbers.takeWhile { !it.startsWith("f") })
    println(numbers.takeLastWhile { it != "three" })

    //dropWhile and dropLastWhile
    //These skip elements as long as the condition is true.
    println(numbers.dropWhile { it.length == 3 })
    println(numbers.dropLastWhile { it.contains("i") })

    println("\n")

    //Chunked
    //The chunked function in Kotlin is used to split a collection (or sequence) into smaller chunks of a specified size.
    val numberList = (0..13).toList()
    println(numberList.chunked(4))
    println(numberList.chunked(4) { it.sum() })

    println(numbers.chunked(3))

    println("\n")

    //Windowed
    // It creates a sliding window over the collection, providing overlapping or non-overlapping sublists of a specified size.
    println(numberList.windowed(3, step = 1))

    /*
    Explanation of above:
    First window starts at index 0: [1, 2, 3].
    Step is 1, so the next window starts at index 1: [2, 3, 4].
    Next window starts at index 2: [3, 4, 5].
    And so on
    */

    println(numberList.windowed(5, partialWindows = true, step = 5) { it.sum() })

    //partialWindows: Determines whether incomplete windows (fewer elements than the specified size) at the end should be included. Default is false.
}