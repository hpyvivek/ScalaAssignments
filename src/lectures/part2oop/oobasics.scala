package lectures.part2oop

object oobasics extends App {


  class Writer(firstName: String, surname: String, val year: Int) {
    def fullName: String = firstName + " " + surname
  }
  class Novel(Name: String, yearOfRelease: Int, author: Writer){
    def authorAge = yearOfRelease - author.year
    def isWrittenBy(author:Writer) = author == this.author
    def copy(newyearOfRelease: Int):Novel = new Novel( Name,  yearOfRelease,author)
  }

  val author = new Writer("happy", "page", 1987)
  val Novel = new Novel("My Story", 2021, author)

  println(Novel.authorAge)
  println(Novel.isWrittenBy(author))

  val person = new Person("happy", 32)
  println(person.x)
  person.greet("ram")


}

class Person(name: String, age: Int) {

  val x = 2

  println(1 + 3)
  println(s"$name says : hi its $name nd my age is $age")

// methods
  def greet(name:String): Unit = println(s"${this.name} says : hi $name")
  def greet(): Unit = println(s"hi this is $name ")

  // multiple constructor


}