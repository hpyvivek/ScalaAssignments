package part1basics

object recursion extends App {

  def factorial (n: Int): Int ={
    if (n<=1){
      val result =   1
      result
    }
    else {
      //    println("computing factorial of " + n + " - I first need factorial of" + (n-1))
      val prevResut = factorial(n-1)
      val result = n* prevResut
      //  println ("computing factorial of" + n )
      result
    }
  }
       println("starting fact count ")
      println(factorial(5))
     // println(factorial(5000))



}





