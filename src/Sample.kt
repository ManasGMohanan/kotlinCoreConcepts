fun myFun(company: String,product: String, fn: (String,String) -> String): Unit {
    val result = fn(company,product)
    println(result)
}

fun main(){
    val fn:(String,String)->String={org,portal->"$org develops $portal"}
    myFun("JetBrains","Kotlin",fn)
}