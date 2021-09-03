package cl.poc.kotlin.inline

class Inline

fun List<Int>.sumup(num: Int): List<Int> {
    return this.map { s -> s.plus(num) }
}

fun main() {
    val init = System.currentTimeMillis()
    for (n in 1..100_000) {

        println("Number ${printNumber(n) { a, b -> a + b }}")

    }
    val end = System.currentTimeMillis()
    println("Time ${end - init}")
}

inline fun printNumber(n: Int, function: (Int, Int) -> Int): Int {
    return function(n, 5)
}
