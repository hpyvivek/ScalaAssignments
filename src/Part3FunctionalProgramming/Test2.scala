package Part3FunctionalProgramming

object Test2 extends App {
  val concatenator: ((String, String) => String) = new Function2[String, String, String] {
    override def apply(a: String, b: String): String = a + b
  }
  println(concatenator("Hello ", " Scala "))

  println("---------------------------------------------------------")

  val SuperAdder: Function1[Int, Function1[Int, Int]] = new Function1[Int, Function1[Int, Int]] {
    override def apply(x: Int): Function1[Int, Int] = new Function1[Int, Int] {
      override def apply(y: Int): Int = x + y
    }
  }
  val adder3 = SuperAdder(3)
  println(adder3(4))
  println(SuperAdder(3)(4))

  val test : Function2[ Int, Int, Int] = new Function2[ Int, Int, Int ] {
    override def apply(x: Int, y: Int): Int = x + y
  }
  println ( test (2,3 ))

  
    /*curried function ( curried function has the prop that
                             they can be called with multiple parameter list ||
                             It recieves some  kind of parameter and returns another parameter as F(x)
                             which receives parameters */
//}
//trait Myfunc[A, B]{
  //def apply(element: A): A = ???
}