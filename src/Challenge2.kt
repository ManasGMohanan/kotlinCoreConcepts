fun main() {

    val mansAccount = Bank("Manas")
    mansAccount.deposit(1000)
    mansAccount.withdraw(450)
    mansAccount.deposit(-60)
    mansAccount.withdraw(-90)
    mansAccount.withdraw(1000)

    println("Balance amount is ${mansAccount.calculateBalance()}")

}

class Bank(val accountName: String) {

    private var balance: Int = 0
    private var transactions = mutableListOf<Int>()

    fun deposit(amount: Int) {
        if (amount > 0) {
            balance += amount
            transactions.add(amount)
            println("$amount deposited. Current balance is $balance")
        } else {
            println("Cannot deposit amount lesser than zero")
        }
    }

    fun withdraw(withdraw: Int) {
        if (withdraw > 0) {
            if (withdraw <= balance){
                balance -= withdraw
                transactions.add(-withdraw)
                println("$withdraw withdrawn. Current balance is $balance")
            }else{
                println("Insufficient balance,$balance")
            }
        } else {
            println("Cannot withdrawn negative amounts")
        }
    }

    fun calculateBalance(): Int{
        balance = 0
        for (transactions in transactions){
            balance += transactions
        }
        return balance
    }

}