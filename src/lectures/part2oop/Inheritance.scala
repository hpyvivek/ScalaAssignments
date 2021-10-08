package lectures.part2oop

object Inheritance extends App{

  class Animal {
    def eat = println("abc")

  }
  class Cat extends Animal

  val cat = new Cat
  cat.eat
}
