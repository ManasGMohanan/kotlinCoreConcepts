fun main(){

    sum(1,5,8,4,90,56)

}

fun sum(vararg numbers: Int){
//    numbers.forEach { println(it) }
    for(i in numbers){
        println(i)
    }
}