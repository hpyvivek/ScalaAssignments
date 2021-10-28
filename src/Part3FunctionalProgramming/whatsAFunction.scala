package Part3FunctionalProgramming

object whatsAFunction extends App {


  val doubler = new Myfunction[String, Int] {
    override def apply(element: String): String  = {
      element + "   Madan"

    }
  }
  println(doubler.apply( "Hello World"  ))
  println(doubler("hi " + "my name is "))
}
trait Myfunction[A, B] {
  def apply(element: A): A

}


  /*val adder: ((Int,Int) => Int) = new Function2[Int, Int, Int] {
    override def apply( a: Int , b: Int) : Int = a + b
  }

  def concatenator :( String, String) => String = new Function2[String, String, String] {
    override def apply(a: String, b: String): String = a + b
  }
  println(concatenator("Hello", " Scala"))

  val doubler2 = new childMyFunction
  println(doubler2("Scala Rocks"))

  val doubler3 = new childMyFunction2
  println(doubler3.apply(22))
  println(doubler3(66))

  val abc = new stringmultiplier
  println(abc(3))

  val abc2 = new Intmultiplier
  println(abc2(5))





}

   */

/*trait Mymultiply[B] {
  def apply(element: Int): B

}



 class stringmultiplier extends Mymultiply [ String]{
   override def apply( element: Int): String = {
     "Hello " * element
   }
 }
class Intmultiplier extends Mymultiply [Int]{
  override def apply( element: Int): Int = {
    66 * element
  }
}

  class childMyFunction extends Myfunction[String, String] {
    override def apply(element: String): String = {
      element.toUpperCase()
    }
  }
    class childMyFunction2 extends Myfunction[Int, String] {
      override def apply(element: Int): String = "Hello my age is " + element

    }

*/


