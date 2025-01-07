fun main() {

    val alarm = 8

    val text = when (alarm) {
        12, 7, 14 -> {
            "The time is $alarm"
        }

        in 1..10 -> {
            "The time is range 1 to 10"
        }

        else -> {
            println("The time is $alarm")
        }
    }

    println(text)

    when {
        alarm == 8 || alarm == 7 -> println("alarm is 7 or 8")
        alarm <= 7 -> println("alarm less than 7")
    }


}