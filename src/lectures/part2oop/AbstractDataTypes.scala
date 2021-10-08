package lectures.part2oop

object AbstractDataTypes extends App{

  abstract class Animal {
    val creatureType : String
    def eat : Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    def eat : Unit = println("crunch crunch")
  }

  trait Carnivore {
    def eat(animal : Animal): Unit
    println(s" I am  a croc and I like vvv")
  }
  trait ColdBlooded

  class Crocodile extends Animal with Carnivore {
    val creatureType: String = " croc"
    def eat: Unit = println("nomnomnom")
    def eat(animal: Animal): Unit = println(s" I am  a croc and I like ${animal.creatureType}" )

  }
  val dog = new Dog
  val croc = new Crocodile
  croc. eat(dog)


}
