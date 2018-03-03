abstract class CreditCard {
    fun creditId(): String { return "12345" }

    abstract fun newCredit()
}

class UserInfo : CreditCard() {
    fun getInfo(): String { return creditId() }

    override fun newCredit() {
        println("New credit created")
    }
}

fun main(args: Array<String>) {
     var credit = UserInfo()
    println(credit.creditId())
}