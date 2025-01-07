fun main(){

    val jeep = Jeep("Wrangler","Red",1,4)
    jeep.move()
    jeep.stop()

}

open class Vehicle(var name: String, var color: String){
   open fun move(){
        println("$name is moving")
    }

    fun stop(){
        println("$name has stopped")
    }
}

class Jeep(name: String, color:String, var engines: Int, var doors: Int): Vehicle(name,color){

    override fun move() {
        drive()
        super.move()
    }

    private fun drive(){
        println("The jeep is driving")
    }

}