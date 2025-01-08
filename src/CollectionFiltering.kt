fun main() {

    //Filtering a list
    val numbers = listOf("one", "two", "three", "four")
    val numbersLongerThan3 = numbers.filter { it.length > 3 }
    println(numbersLongerThan3)

    //Filtering a map using predicates
    val numbersMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 101" to 101)
    val filteredMap = numbersMap.filter { it.key.endsWith("1") && it.value > 100 }
    println(filteredMap)

    val filteredIndex = numbers.filterIndexed { index, value -> (index != 0) && (value.length < 5) }
    val filteredNot = numbers.filterNot { it.length <= 3 }
    println(filteredIndex)
    println(filteredNot)
}