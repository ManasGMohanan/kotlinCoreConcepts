fun main() {

    sendMessage(name = "Alexaa")

}

fun sendMessage(name: String = "User", message: String = sendText()) {
    println("name = $name and message = $message")
}

fun sendText() = "Message text"
