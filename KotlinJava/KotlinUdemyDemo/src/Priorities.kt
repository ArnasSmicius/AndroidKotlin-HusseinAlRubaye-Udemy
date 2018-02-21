/*
1- ()
2- ++, -- (before Var)
3- ^
4- *, /
5- +, -
6- =
7- ++, -- (After Var)
 */

fun main(args: Array<String>) {
    val n1 = 10
    val n2 = 10
    val n3 = 5
    val sum:Int?
    sum = (n1 + n2) * n3 - 3
    print("sum: $sum")
}