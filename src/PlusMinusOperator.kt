fun main() {

    val list = mutableListOf("one", "two", "three", "four")
    val plusList = list + "five"
    val minusList = list - "three"

    val addList = list + mutableListOf("eight", "nine")
    val subtractList = addList - mutableListOf("one", "eight")

    println(plusList)
    println(minusList)

    println(addList)
    println(subtractList)
}