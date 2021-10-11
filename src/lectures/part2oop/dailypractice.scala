package lectures.part2oop

object string extends  App{

  class input{
    def check(str: String): String =
      if (str.length <=2 ) str
      else str.substring(0,2) * 4
  }
 val first = new input
  println(first.check("India\n").split(" ").toList  )
  val newString : String = "Japan is the land of rising sun "
  println(newString.split(" ").toList)

  val anotherStr: String = "scala"
  println(anotherStr.substring(1,5))
  println(anotherStr.substring(2,5))
  println(anotherStr.substring(3,5))

   def third: Unit = {

     val newStr: String = "if I were PM"
     newStr.substring(0, 4)
  }
}
