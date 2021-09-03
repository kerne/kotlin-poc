package cl.poc.kotlin.extension.scope

//function from another declaration
import cl.poc.kotlin.extension.functional.decode

class Scope

fun main() {
    "12312 123  123 123".decode().apply(::println)
}