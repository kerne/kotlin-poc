package cl.poc.kotlin.interfaces

interface Named {
    val name: String
}

interface MyInterfaces : Named {

    val firstName: String
    val lastName: String

    override val name: String get() = "Yo Soy $firstName $lastName"
}

class MyImplementation(var person: Person) : MyInterfaces {

    override val firstName: String
        get() = person.firstName

    override val lastName: String
        get() = person.lastName

    fun method() {
        println(name)
    }
}

data class Person(
    override val firstName: String,
    override val lastName: String
) : MyInterfaces

class Main

fun main() {
    val myImplementation = MyImplementation(Person("Cesar", "Araya"))
    myImplementation.method()
}