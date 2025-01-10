fun main() {

    //Filtering a list
    val numbers = listOf("one", "two", "three", "four")
    val numbersLongerThan3 = numbers.filter { it.length > 3 }
    println(numbersLongerThan3)

    //Filtering a map using predicates
    val numbersMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 101" to 101)
    val filteredMap = numbersMap.filter { it.key.endsWith("1") && it.value > 100 }
    println(filteredMap)

    //To use element position in filter
    val filteredIndex = numbers.filterIndexed { index, value -> (index != 0) && (value.length < 5) }
    println(filteredIndex)

    //To filter collection by negative condition
    val filteredNot = numbers.filterNot { it.length <= 3 }
    println(filteredNot)

    //To filter elements of a given type
    val mixedList = listOf(1, 2, 3, 'a', 'b', 'c', "hello", "world", false)
    mixedList.filterIsInstance<String>().forEach {
        println(it)
    }

    println("\n")
    //Partition

    val (match, rest) = numbers.partition { it.length > 3 }
    println("match items : $match")
    println("unmatched items : $rest")

    //testing predicates
    println(numbers.any { it.endsWith("e") })
    println(numbers.none { it.endsWith("o") })
    println(numbers.all { it.length > 2 })
}