//Transformation

fun main() {

    //Mapping
    val numbers = setOf(1, 2, 3, 4, 5)
    println(numbers.map { if (it == 3) it * 100 else it * 10 })
    println(numbers.mapIndexedNotNull { index, value -> if (index == 0) null else index * value })
    val numbersMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 4" to 4)
    println(numbersMap.mapKeys { it.key.uppercase() })
    println(numbersMap.mapValues { it.value + it.key.length })

    //Zipping
    val colors = listOf("red", "green", "blue", "orange")
    val animals = listOf("fox", "lion", "bear")
    println(colors zip animals)
    println(colors.zip(animals) { color, animal -> "The ${animal.replaceFirstChar { it.uppercase() }} is $color" })

    //Unzip
    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numberPairs)
    println(numberPairs.unzip())

    //Association
    val numbers2 = listOf("one", "two", "three", "four")
    println(numbers2.associateWith { it.length }) //keys from associated collection and values created from code inside the curly here
    println(numbers2.associateBy {
        it.first().uppercase()
    }) // keys are created based on the code inside the curly and values from the associated collection
    println(
        numbers2.associateBy(
            keySelector = { it.first().uppercase() },
            valueTransform = { it.length })
    )

    //Flatten
    val nestedList = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )
    println(nestedList.flatten()) // Combines all nested lists into a single list
}

