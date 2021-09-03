package cl.poc.kotlin.extension.functional

class Example {
    fun printEmpty(): Example {
        println("print empyt")
        return this
    }
}

fun main() {
    Example().printEmpty().printSomething("HELLO!!!")

}

fun Example.printSomething(i: Any) {
    println("printing something $i")
}

