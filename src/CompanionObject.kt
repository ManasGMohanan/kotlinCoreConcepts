fun main(){

    val result = Calculator.sum(15,90)
    val max = Calculator.max

    println("Constant max = $max")
    println("Sum = $result")

    //companion object used in kotlin example
    val intMaximum = Int.MAX_VALUE //MAX_VALUE is a companion object of class Int

}

class Calculator(){

    companion object{

        val max = 98
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }

}