package cl.poc.kotlin.extension.functional

import java.util.function.IntPredicate


fun main() {
    val isEven = IntPredicate { it % 2 == 0 }
    println("Number is Even? ${isEven.test(4)}")

    val another = AnotherFunctional{ it.uppercase()}
    println(another.print("hola"))

}


fun interface AnotherFunctional {
    fun print(param : String): String
}