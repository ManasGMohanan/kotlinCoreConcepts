fun main() {

    val maximum = getMaxi(4,8,90)
    println("maximum is $maximum")

}

fun getMaxi(a: Int, b: Int) = if (a > b) a else b

fun getMaxi(a: Double, b: Double) = if (a > b) a else b

fun getMaxi(a: Int, b: Int, c: Int): Int {
    return if (a >= b && a >= c) {
        a
    } else if (b >= a && b >= c) {
        b
    }else{
        c
    }
}