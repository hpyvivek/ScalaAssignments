package lectures.part2oop

object string extends  App {

  class input {
    def check(str: String): String =
      if (str.length <= 2) str
      else str.substring(0, 2) * 4
  }

  val first = new input
  println(first.check("India\n").split(" ").toList)
  val newString: String = "Japan is the land of rising sun "
  println(newString.split(" ").toList)

  val anotherStr: String = "scala"
  println(anotherStr.substring(1, 5))
  println(anotherStr.substring(2, 5))
  println(anotherStr.substring(3, 5))

  def third: Unit = {

    val newStr: String = "if I were PM"
    newStr.substring(0, 4)
  }

  def test3(str: String, n: Int): String = {
    str.take(n) + str.drop(n + 1)

  }

  println("Result: " + test3("Scala", 1))
  println("Result: " + test3("Scala", 4))
  println("Result: " + test3("Scala", 0))
  println("Result: " + test3("Scala", 3))
  println("------------------------------------------------------------------")
}
object strings {
    def main(args:Array[String]): Unit= {
      val str = ("Rock the JVM")
      println("Orignal String str:- " + str +  " yoo ")
    }
    println("----------------------------------------------------------------------")
    println(" Understanding the way main f(x) is written  ")

  }




