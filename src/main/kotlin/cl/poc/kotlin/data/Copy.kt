package cl.poc.kotlin.data

data class Copy(val name: String, val age: Int)

fun main() {
    val copy = Copy("cesar", 33)
    val olderCopy = copy.copy(age = 34)

    println(copy)
    println(olderCopy)
}