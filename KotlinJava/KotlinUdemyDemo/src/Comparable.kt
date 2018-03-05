import java.util.*

class Person(var name: String, var age: Int): Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return this.age - other.age
    }
}

fun main(args: Array<String>) {
    var listOfNames = ArrayList<Person>()
    listOfNames.add(Person("Jena", 3))
    listOfNames.add(Person("Laya", 1))
    listOfNames.add(Person("Hussein", 28))

    println("Before sort")
    for (person in listOfNames) {
        println("${person.name} is ${person.age} years old")
    }

    println("After sort")
    listOfNames.sort()
    listOfNames.forEach { println("${it.name} is ${it.age} years old") }
}