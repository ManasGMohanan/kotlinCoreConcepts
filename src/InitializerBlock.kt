fun main(){
    val user = Stud("anas","mohanan",26)
    println("Name :${user.name}")
}

class Stud(name : String, var lastName : String, val age: Int){

     var name: String

    init {
        if (name.lowercase().startsWith("a")){
            this.name = name
        }
        else{
        this.name = "User"
        println("Name doesn't start with letter 'a' or 'A'")
        }
    }

}