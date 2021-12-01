package Assignments

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

  //def str2(str:String, n: Int = 0 ):String = {
    //if (str.length<1) str
   // else (str.charAt(str.length-n)
  // val newStr = str.charAt()



  //}





}
