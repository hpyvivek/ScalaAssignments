package lectures.part2oop

object MethodNotations extends App{

  class Person(val name: String, val favMovie: String,val age :Int =0) {
    def likes(movie:String): Boolean = movie == favMovie
    def hangOutWith(person:Person): String = s"${person.name} ia hanging out with ${person.name}"
    def +(person:Person): String = s" ${person.name} like watching ${this.favMovie}"
    def +(nickname:String): Person = new Person(s"$name ($nickname)",favMovie)
    def apply(): String = s" Hi, my name is $name & I like $favMovie"
    def apply(n:Int): String = s"$name watched $favMovie $n times"
    def unary_! : String =  s"$name , What the heck !"
    def unary_+ : Person = new Person(name,favMovie,age+1)
    def learns(thing:String) = s"$name is learning $thing"
    def learnsScala = this.learns("Scala")
  }


  val mary = new Person("A","inception")
  println(mary.likes("fury"))
  println(mary likes "inception")

  //"OPERATORS in SCALA
  val tom = new Person("B","Fury")
  println(tom.hangOutWith (mary))
  println(mary likes "inception")
  println(mary hangOutWith mary)
  println(mary.hangOutWith (tom))
  println( mary + tom)
  println("EOL")
  println(mary())
  println(tom.apply())
  println((mary + "The Rockstar")())
  println(mary.+ ("the Rockstar")())
  println((+mary).age)

  println(mary learnsScala)
  println(mary.apply(10))

}
