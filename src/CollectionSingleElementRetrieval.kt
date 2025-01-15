fun main() {
    val numberList = listOf("one", "two", "three", "four", "five", "six")
    println(numberList.elementAt(4))
    println(numberList.first())
    println(numberList.last())

    println("\n")
    
    println(numberList.first { it.startsWith("t") })
    println(numberList.last { it.length == 4 })
    println(numberList.random())
    println(numberList.isEmpty())
}