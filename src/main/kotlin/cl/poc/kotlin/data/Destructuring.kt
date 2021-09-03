package cl.poc.kotlin.data

data class User(val name: String, val age: Int)

class Destructuring

fun main() {
    val cesar = User("cesar", 33)
    val (name, age) = cesar
    println("$name $age years of age")
}