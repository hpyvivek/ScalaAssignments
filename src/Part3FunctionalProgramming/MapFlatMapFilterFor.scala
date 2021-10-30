package Part3FunctionalProgramming

object MapFlatMapFilterFor extends App {

  val list = List(1,2,3)
  println (list.head)
  println(list.tail)

  // Map
  def multiply(a:Int): Int = ( a*2)

  val a1 = list.map(y => multiply(y))
  val b1 = list.map(multiply(_))
  val c1 = list.map(_*4)

  println(list.map(_ + 1))
  println(list.map(_ + " : is an integer "))
  println(a1)
  println(b1)
  println(c1)

  //Filter

  println((list.filter(_%2 == 0)))

  // flatmap

  val toPair = (x: Int) => List(x, x+1)
  println(list.flatMap(toPair))

  //exercise

  //1. print all combination between two list

  val numbers = List(1,2,3,4)
  val char = List('a', 'b', 'c', 'd')

   val combinations = numbers.flatMap(n => char.map(c=> "" + n + c ))
  println((combinations))







}
