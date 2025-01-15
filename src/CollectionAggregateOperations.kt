fun main(){
    val numbers = listOf(6,87,10,14,5)
    println("The sum of numbers = ${numbers.sum()}")
    println("The count of numbers = ${numbers.count()}")
    println("The average of numbers = ${numbers.average()}")
    println("The max among numbers = ${numbers.maxOrNull()}")
    println("The min among numbers = ${numbers.minOrNull()}")
    println("The sum of numbers = ${numbers.sumOf { it + 200 }}")
}