fun main() {

    val names = arrayOf("manas", "surya", "manu")

    val numbers = arrayOf("manas", 1, 3, 5, 'a')

    names[0] = "Sreyas"

    println("First element ${names[0]}")
    println("The size of the names array : ${names.size}")

//    for (name in names) {
//        println(name)
//    }

    for (i in numbers) {
        if (i is Int){
            println(i)
        }
    }
}