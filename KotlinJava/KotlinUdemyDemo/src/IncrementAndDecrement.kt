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

    var x = 10
    var y = 11
    var z = ++x + y

    println("z = $z")
    println("x = $x")

    var m = x++ + y
    println("m = $m")
    println("x = $x")
}