package cl.poc.kotlin.classes

import cl.poc.kotlin.data.Animal

class Canine() : KindOfAnimal {

    override fun eat() {
        println("All")
    }

    override fun move() {
        println("4 Feet")
    }

    override fun sound() {
        println("Guau!!!")
    }



}