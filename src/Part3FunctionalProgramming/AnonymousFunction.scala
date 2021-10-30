package Part3FunctionalProgramming

object AnonymousFunction extends App {
  /*val doubler1 = new Function[Int, Int] {
    override def apply(x: Int): Int = x * 2
  }
  println(doubler1(4))
  println(" hi ") */
  //Anonymous Function = LAMBDA
  val doubler1: Int => Int = (x: Int) => x * 2 // JUST WOW !!
  // It Instantiate a new Function with the override def apply
  // which takes an x which is an int and return an X * 2 .... This is Syntactic Sugar for the things above

  println(doubler1(2))
  val adder: String => String = a => a + "HI"
  println(adder(" Hello "))

  val JustDoSomething: () => Int = () => 4

  println(JustDoSomething)
  println(JustDoSomething())

  val StringToint = { (str: String) =>
    str.toInt
  }
  //MORE Syntactic sugar

  val niceIncremental: Int => Int = (x: Int) => x + 1
  val niceincremental1: Int => Int = _ + 1

  val niceAdder: (Int, Int) => Int = (a, b) => a + b
  val niceAdder2 : (Int, Int) => Int = _ + _

  println((niceIncremental(22)))
  println((niceincremental1(33)))

  println(niceAdder(20,9))
  print((niceAdder2(55,66)))

  println("\n")

  val superAdd = (x:Int) => (y:Int) => x + y
  println(superAdd(3)(4))













}