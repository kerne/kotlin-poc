package cl.poc.kotlin.classes

class AnimalTemplate(kindOfAnimal: KindOfAnimal) {
    var kindOfAnimal = kindOfAnimal

    fun me() {
        kindOfAnimal.eat()
        kindOfAnimal.move()
        kindOfAnimal.sound()
    }

}