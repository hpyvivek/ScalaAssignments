package Part3FunctionalProgramming

import Part3FunctionalProgramming.MapFlatMapFilterFor.charA

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

  val numbers = List("1","2","3","4")
  val charA  =  List('a', 'b', 'c', 'd')
  val color = List("Red", "Black","White ")

  val combinations = numbers.flatMap(x => charA.map(y => x + y ) )
  val temp = "X"
  val comb1 = charA.map( t => t + temp)
  val combFinal = charA.flatMap(t => numbers.flatMap(p=> color.map(o => o + p + t  ) ))

  println(combFinal)


  //val combinations1 = numbers.map(x => charA.map(y => x + y ) )
  // List (1a , 2a )
  //println(combinations)
 // println(combinations1)

  // val combinations = numbers.flatMap(n => char.flatMap(c => color.map( color => "" + n + c + color )))
   // println((combinations))


  // foreach- It receives a f(x) returning units

  color.foreach(println)

  // for- comprehensions

  val forCombinations = for{
    p<- numbers // if p % 2 == 0
    t<- charA
    o<- color
  } yield t + p  + "-" + o
  println(forCombinations)

  for {
    p <- numbers
  } println(p)
  // syntax overload

  list.map { x =>
    x*2
  }

}
