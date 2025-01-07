fun main() {
    val loginButton = Button("1256", "login button", object : OnClickListener {
        override fun onClick() {
            //Login the user
        }
    })
    val registerButton = Button("1257", "register button", object : OnClickListener {
        override fun onClick() {
            //Register the user
        }
    })
}

class Button(val id: String, val text: String, onClickListener: OnClickListener)

interface OnClickListener {
    fun onClick()
}