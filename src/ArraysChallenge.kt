fun main() {

//    println(findMax(arrayOf(3, 8, 90, 78)))
//
//    println(findMin(arrayOf(1, 98, 76, 54)))

    val max = findMinAndMax(arrayOf(19, 78, 8, 80), true)
    println("Maximum in array: $max")

    val min = findMinAndMax(arrayOf(9, 5, 98, 789), false)
    println("Minimun in array: $min")

} 

//fun findMax(numbers: Array<Int>) : Int {
//    var max = numbers[0]
//
//    for(number in numbers){
//        if (number > max){
//            max = number
//        }
//    }
//    return  max
//}
//
//fun findMin(numbers: Array<Int>) : Int {
//    var min = numbers[0]
//
//    for(number in numbers){
//        if (number < min){
//            min = number
//        }
//    }
//    return  min
//}

fun findMinAndMax(numbers: Array<Int>, isRequireMax: Boolean): Int {
    var max = numbers[0]
    var min = max

    if (isRequireMax) {
        for (number in numbers) {
            if (number > max) {
                max = number
            }
        }
        return max
    } else {
        for (number in numbers) {
            if (number < min) {
                min = number
            }
        }
        return min
    }
}
