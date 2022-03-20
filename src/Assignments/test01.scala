package tests
import Assignment.assignment01
import org.scalatest.funsuite.AnyFunSuite

//object scala_test_check

class test01 extends AnyFunSuite {


  test("assignment01") {
    assert(assignment01.aString("helloScala") === "hehehehe")
    assert(assignment01.aString("scalaRocks") == "scscscsc")
    assert(assignment01.aString("ab") == "ab")

  }

  /* object assignment01 extends App {
    //Question - 1
    /* Create a new string which is 4 copies of the 2 front characters of a given string.
       If the given string length is less than 2 return the original string
     */
    def aString(str: String): String = {

      if (str.length <= 2) str
      else (str.substring(0, 2)) * 4

    }

    println("Result:- " + aString("Scala"))
    println("Result:- " + aString("Hello"))
    println("Result:- " + aString("World"))
    println("Result:- " + aString("us"))
  }

   */
}



