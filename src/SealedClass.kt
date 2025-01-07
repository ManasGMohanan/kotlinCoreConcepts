fun main() {

    val success = Result.Success("Success")
    val error1 = Result.Error.RecoverableError(Exception("Null pointer exception"), "Error")
    val error2 = Result.Error.NonRecoverableError(Exception("Null pointer"), "Error")
    val progress = Result.Progress("Progress")

    getData(success)
    getData(error1)
    getData(error2)
    getData(progress)

}

fun getData(result: Result) {

    when (result) {
        is Result.Success -> result.showMessage()
        is Result.Progress -> result.showMessage()
        is Result.Error.NonRecoverableError -> result.showMessage()
        is Result.Error.RecoverableError -> result.showMessage()
    }
}

sealed class Result(val message: String) {

    open fun showMessage() {
        println("Result: $message")
    }

    class Success(message: String) : Result(message)
    sealed class Error(message: String) : Result(message) {
        class RecoverableError(val exception: Exception, message: String) : Error(message) {
            override fun showMessage() {
                println("Exception : $exception || result : $message")
                // super.showMessage()
            }
        }

        class NonRecoverableError(val exception: Exception, message: String) : Error(message) {
            override fun showMessage() {
                println("Exception : $exception || result : $message")
                // super.showMessage()
            }
        }
    }

    class Progress(message: String) : Result(message)
}