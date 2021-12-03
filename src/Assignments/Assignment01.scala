package Assignments

import sun.font.TrueTypeFont

object Assignment01 extends App{

  //Question - 1
  /* Create a new string which is 4 copies of the 2 front characters of a given string.
     If the given string length is less than 2 return the original string

   */
  def aString (str: String):String = {

    if (str.length <=2 ) str
    else (str.substring(0,2))*4

  }
  println("Result:- " + aString("Scala"))
  println("Result:- " + aString("Hello"))
  println("Result:- " + aString("World"))
  println("Result:- " + aString("us"))


  /* Remove the character in a given position of a given string.
  The given position will be in the range 0...string length -1 inclusive.
   */

  def str2 (str: String, i: Int):String ={
    str.take(i) + str.drop(i+1)
  }
  println("Result := "+ str2("Scala", 0 ))
  println("Result := "+ str2("Scala", 1 ))
  println("Result := "+ str2("Scala", 2 ))
  println("Result := "+ str2("Scala", 3 ))
  println("Result := "+ str2("Scala", 4 ))

  /* Question - 3
   Create a new string with the last char added at the front and back of a given string of length 1 or more.
   */

  def str3 (str: String) :String = {
    if ((str.length) <= 1) str
    else (str.charAt((str.length) - 1) + str + str.charAt((str.length) - 1))
  }
  println(str3("Scala"))
  println(str3("Sc"))
  println(str3("S"))

  /* Question - 4: Create a new string where 'if' is added to the front of a given string.
  If the string already begins with 'if', return the string unchanged.
   */

  def str4(str: String):String = {
    if ( str.startsWith("If")) str
    else ( "If" + str)
  }
  println(str4(" I were PM "))
  println(str4("If I were PM "))

  /* Question - 5:
     Check which number is nearest to the value 100 among two given integers.
     Return 0 if the two numbers are equal.
   */

  def checkNum(num1 :Int , num2 : Int) : Int = {
    val absNum1 = Math.abs(num1 - 100)
    val absNum2 = Math.abs(num2 - 100)
    if (absNum1 == absNum2) 0
    else if (absNum1 < absNum2) num1
    else num2
  }
  println(" the no. closer to 100 is :- " + checkNum(110,120))
  println(" the no. closer to 100 is :- " + checkNum( 40, 30 ))
  println(" the no. closer to 100 is :- " + checkNum(66, 66))

  /* Question - 6:
     Check whether two given integers are in the range x <= 20 to y >= 50 or y <= 20 to x >= 50,
     return true if the given numbers are within the range, or if the numbers are out of range return false
   */

  def numRange( x: Int, y: Int): Boolean ={
    if (( x<=20 & y >= 50 ) || ( y <= 20 & x >= 50)) true
    else false
  }
  println(numRange(19,51))
  println(numRange(51,19))
  println(numRange(21,51))
  println(numRange(88,6))

  /* Question - 7:
   Write a Scala program to check whether a specified character is happy or not.
   A character is happy when the same character appears to its left or right in a string.
   */

















}
