package cl.poc.kotlin.classes

import cl.poc.kotlin.data.Animal

fun main() {

    var animal = AnimalTemplate(Canine())
    animal.me()

    println(Animal("Cat", 2, "feline"))


}

