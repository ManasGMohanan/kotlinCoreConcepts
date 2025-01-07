fun main() {
    println(Database.toString())
    println(Database.toString())
    println(Database.toString())
   
}

/*only the first time the initialization takes place and the init block works
and for the remaining time the already created instance is being used*/

object Database {
    init {
        println("Database created")
    }
}