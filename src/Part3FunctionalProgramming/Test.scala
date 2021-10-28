package Part3FunctionalProgramming

object Test extends App{

  def increment(a:Int): Int = a+1

  println(increment(2))

  def dec(a:Int): Int = a-1

  println(dec(2))

  def smallcalc(a:Int, b :Int, f: (Int, Int ) => Int): Int ={
    f(a, b)
  }
  println(smallcalc(4, 6 , sum))

  def sum(a:Int, b:Int ):Int=  {
  a+b

  }

}
