package lectures.part2oop

object string extends  App{

  class input{
    def check(str: String): String =
      if (str.length <=2 ) str
      else str * 4
  }
 val first = new input
 println(  first.check("bulbul\n") )

}
