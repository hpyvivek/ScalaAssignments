package oopsbasic

object OopsBase extends  App{
  val aaa = new Person("p4",23)
  val p1:Person = new Person("p1",23)
  val p2 :Person = new Person("p2",21)

  println("person p1 age is "+ p1.age)
}


class Person(name:String, val age:Int){

  val x = 2
  println(1+2)
}