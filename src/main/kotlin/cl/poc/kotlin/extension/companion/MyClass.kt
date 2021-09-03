package cl.poc.kotlin.extension.companion

class MyClass {

    companion object {
        fun print() {
            println("Companion")
        }
    }


}

fun main() {
    MyClass.Companion.print()
}