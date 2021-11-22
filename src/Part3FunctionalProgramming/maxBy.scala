package Part3FunctionalProgramming

object maxBy extends App {

    case class Book(name: String, price: Int)

    val x = Book("A", 777)
    val y = Book("B", 666)
    val z = Book("C", 666)

    val BookList = List(x, y, z)
    val q = BookList.groupBy(x => x.price > 700)
    println(q)
    println("_____________________________________")

    println("Hello, world!")
    println("Scala language: " + util.Properties.versionString)

    def test(x:Int, y:Int) : Int =
      if (x == y ) (x + y)*3
      else (x+y)

    println("Result-1 := " + test(2 , 2 ))
    println("Result-1 := " + test(2 , 5 ))

    println("------------------------------------------------------------------")
    /*Write a Scala program to create a new string where 'if' is added to the front of a given string.
    If the string already begins with 'if', return the string unchanged
     */
    def ifTest(string: String): String = {
        if (string.startsWith("If")) string
        else "If" + string
    }

        println("Result:= " + ifTest(" I am a scala programmer"))
        println(("Result:= " + ifTest(( "If I were a Scala Programmer"))))

    /* Write a Scala program to remove the character in a given position of a given string.
    The given position will be in the range 0...string length -1 inclusive
     */
    def testlen (str: String, i: Int):String ={
        str.take(i) + str.drop(i+1)
    }
    println("Result := "+ testlen("Scala", 1 ))
    println("Result := "+ testlen("Scala", 0 ))
    println("Result := "+ testlen("Scala", 4 ))

    /*  Write a Scala program to exchange the first and last characters in a given string and return the new string

     */
    def exchange( str:String): String ={
        val len = str.length()
        if (len<1) str
        else str.charAt(len - 1 )+ str.substring(1, len-1) + str.charAt(0)

    }
        //println(len)
        println(exchange("Scala"))


    val s = "Practice"
    //val first = s.charAt(0)
    val Flen:Int = s.length
    println("String Length is :-" + Flen)
    println(s.charAt(0))
    println(s.charAt(5))
    println(s.charAt(Flen - 1 )+ s.substring(1, Flen-1) + s.charAt(0))

    /* Write a Scala program to create a new string which is 4 copies of the 2 front characters of a given string.
      If the given string length is less than 2 return the original string

     */

    def aString(str: String): String ={
        if (str.length < 2) str
        else str.substring(0,2) * 4   // why 4 * str.substring(0,2) throwing error
    }
    println(aString("Scala"))
    println(aString("S"))

    /* 11. Write a Scala program to check whether a given positive number is a multiple of 3 or a multiple of 7

     */

    def check (num:Int): Boolean = {
        ((num % 3 == 0) || (num % 7 == 0))

    }
    println(check(21))
    println(check(5))
    println(check(14))

    /* 12. Write a Scala program to create a new string taking the first 3 characters of a given string and
           return the string with the 3 characters added at both the front and back. If the given string length
           is less than 3, use whatever characters are there
     */

    def makestr( str: String): String = {
        if (str.length <3 ) (str.head + str.tail) * 3
        else str.substring(0,2 ) +  str  + str.substring(0,2 )


    }
        println(( makestr("ScalaRocks")))
        println(( makestr("Rocks")))
        println(( makestr("Sc")))

    //13. Write a Scala program to check whether a given string starts with 'Sc' or not

    def check1 (str:String): Boolean = {
        str.startsWith("Sc")
    }

    println("Result of String starting with Sc = " + check1 ("Rocky "))
    println("Result : = " + check1 ("Scala "))
    println("Result : = " + check1 ("RocktheJVM "))

    val list1 = ("People","should ")
    val list2 = ()





}
