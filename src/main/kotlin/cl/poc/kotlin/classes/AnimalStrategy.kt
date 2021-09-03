package cl.poc.kotlin.classes

class AnimalStrategy {
    fun kindOf(animal: KindOfAnimal) {
        animal.move()
        animal.sound()
        animal.eat()
    }
}