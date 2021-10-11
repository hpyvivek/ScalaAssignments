package lectures.part2oop

import sun.font.TrueTypeFont

object practice1 extends App {

  println("Hello, world!")
  println("Scala language: " + util.Properties.versionString)

  //2.  Write a Scala program to compute the sum of the two given integer values.
  // If the two values are the same, then return triples their sum
  def test(x: Int, y: Int): Int = {
    if (x == y) (x + y) * 3
    else (x + y)

  }

  println("result :- " + test(1, 2))
  println("result:- " + test(2, 2))

  //3. Write a Scala program to get the absolute difference between n and 51.
  // If n is greater than 51 return triple the absolute difference
  def diff(a: Int, n: Int): Int = {

    if (n < a) (a - n)
    else ((n - a) * 3)
  }

  println(" Result(n<a): " + diff(51, 10))
  println("Result (n>a): " + diff(51, 71))

  //4.Write a Scala program to check two given integers, and return true if one of them is 30 or if their sum is 30.
  def check(a: Int, b: Int): Boolean = {
    a == 30 || b ==30 || a + b == 30
  }

    println("Result : " + check(0,30))
    println("Result : " + check(30,0))
    println("Result : " + check(25,5))
    println("Result : " + check(20,20))

  //5.Write a Scala program to check a given integer and return true if it is within 20 of 100 or 300
    println("-----------------------------------")
  def test2(n: Int) : Boolean ={

    Math.abs(100 - n )<= 20 || Math.abs(300 - n )<= 20
  }
  println(" Result := " + test2(10))
  println(" Result := " + test2(200))
  println(" Result := " + test2(115))

}