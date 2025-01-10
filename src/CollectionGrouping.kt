fun main() {
    val numbers = listOf("one", "two", "three", "four")

    //with single lambda function (key selector)
    println(numbers.groupBy { it.length })
    println(numbers.groupBy { it.first().uppercase() })

    println("\n")

    //with second lambda argument(key selector and value transform)
    println(numbers.groupBy(keySelector = {it.first()}, valueTransform = {it.uppercase()}))
    println(numbers.groupBy(keySelector = {it.length}, valueTransform = {it.uppercase()}))
    println(numbers.groupBy(keySelector = {it.first()}, valueTransform = {it.length}))
}