fun main() {

// FOR LOOPS

//    //using range
//    for (i in 1..10){
//        println(i)
//    }
//
//    //using until
//    for(j in 1 until 10){
//        println(j)
//    }
//
//    // using downTo for downward counting
//    for (i in 10 downTo 1){
//        println(i)
//    }

//    //using arbitrary step for skipping alternative loops,can be used with range and until
//    for (i in 1..<10 step 2){
//        println(i)
//    }
    //------------------------------------------------------------------------------

    // WHILE LOOP

//    var number = 0

//    while (number < 10){
//        println(number)
//        number++
//    }

    //while there is only one statement
    //while (number < 10 ) println(++number)

    //DO WHILE LOOP
//
//    var no = 10
//
//    do {
//        println(no)
//    } while (no > 10)

    //CONTINUE AND BREAK

//    var number = 0
//
//    while (number < 10) {
//
//        number++
//
//        if (number in 7..9) {
//            continue
//        }
//        println(number)
//    }

//    var number = 0
//
//    while (number < 10) {
//
//        number++
//
//        if (number == 7) {
//            break
//        }
//        println(number)
//    }

    //Inner loops with Label

//    var number = 0
//
//    outer@ while ( number < 3){
//        number++
//        println(number)
//
//        var i = 0
//
//        while (i<5){
//            if(i==0){
//                continue@outer
//                i++
//                println("***$i")
//            }
//        }
//
//    }

//    val numbers = 1..10
//    var count = 0
//
//    for (i in numbers) {
//        if (i % 2 == 0) {
//            println(i)
//            count ++
//        }
//    }
//
//    println("total even numbers in range = $count")

    //or

    var number = 0
    val lastNumber = 20
    var evenNumberCount = 0

    while (number <= lastNumber){
        number++

        if (isEvenNumber(number)){
            println(number)
            evenNumberCount ++
        }
    }
    println("total even numbers in range = $evenNumberCount")

}

fun isEvenNumber(number: Int): Boolean {
    if ((number % 2)==0){
        return true
    }else{
        return false
    }
}