fun main(){

    //joinToString
    val numberString = listOf("one","two","three","four")
    println(numberString)
    println(numberString.joinToString())

    //joinTo
    val listString = StringBuffer("The list of numbers: ")
    println(numberString.joinTo(listString))

    //joinToString with arguments
    println(numberString.joinToString(separator = " | ", prefix = "start: ", postfix = " :end"))

    //joinToString for a range of values with limit and truncate
    val numbers = (1..100).toList()
    println(numbers.joinToString(limit = 10, truncated = "..."))

    //joinToString with transform
    println(numberString.joinToString { "element: ${it.uppercase()}" })
}