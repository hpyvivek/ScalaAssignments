package Part3FunctionalProgramming

object HOFsCurries extends App{

  val superfunction: (Int, String, (Int => Boolean)) =>  (Int => Int ) = null
  // higher order function ( HOF)

  // eg. map flatMap , filter

  // 1) function that applies a function 'n' times over a value x
  // nTimes(f, n, x)
  // ntimes(f, 3, x) = f(f(f(x))) = ntimes(f, 2, f(x)) = f(f(f(x)))
  // nTimes(f, n, x) = f(f(.....f(x))) = nTimes(f, n-1, f(x))

  def nTimes (f: Int => Int, n: Int, x:Int) : Int =
    if (n<= 0 ) x
    else nTimes(f, n-1, f(x))

  val plusOne = (x: Int)=>  x +1
  println(nTimes(plusOne, 10, 1 ))

  //ntb ( f,n) = x=> f(f(f...(x)))
  // increment10 = ntb(plusOne, 10) = x => plusOne(plusOne...(x))
  // val y = increment10(1)
  def nTimesBetter(f: Int => Int, n: Int): (Int => Int) =
    if (n <= 0) (x: Int) => x
    else (x: Int) => nTimesBetter(f, n - 1)(f(x))     // vvi [f, n-1 APPLIED to f(x)]

    val plus10 = nTimesBetter(plusOne, 10)
    println(plus10(1))

  // Curried f(x)
  val superAdder : Int => (Int => Int) = (x: Int) => (y:Int) => x+y
  val add3 = superAdder(4) // y => 4 + y
  println(add3(10))
  println(superAdder(4)(10))

  // function with various parameter list
  def curriedFormater(c: String)(x: Double): String = c.format(x)

  val standardFormat: (Double=> String) = curriedFormater(("%4.2f"))
  val preciseFormat: (Double=> String) = curriedFormater(("%10.8f"))

  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))
  }

