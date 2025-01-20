fun main() {

    println("Enter a number")
    val input = readlnOrNull()?.toInt()
    if (input != null) {
        if (input.isPrime()) {
            println("$input is prime number")

        } else {
            println("$input is not prime number")
        }
    }

}

fun Int.isPrime(): Boolean {

    for (i in 2..<this - 1) {
        if (this % i == 0) {
            return false
        }
    }
    return true

}