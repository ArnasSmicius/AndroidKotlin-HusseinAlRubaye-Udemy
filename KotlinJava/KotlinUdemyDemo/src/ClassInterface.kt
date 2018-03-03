interface op {
    fun sum(n1: Int, n2: Int): Int { return n1 + n2 }
    fun div(n1: Int, n2: Int): Int
}

class UserOp: op {
    override fun sum(n1: Int, n2: Int): Int {
        return n1 + n2
    }

    override fun div(n1: Int, n2: Int): Int {
        return n1 / n2
    }
}

class AdminOp: op {
    override fun sum(n1: Int, n2: Int): Int {
        return n1 + n2 - 2
    }

    override fun div(n1: Int, n2: Int): Int {
        return n1 / n2 - 2
    }
}