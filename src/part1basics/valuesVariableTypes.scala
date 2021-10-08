package part1basics

object valuesVariableTypes  {
  println("aaaa")
  def main(args: Array[String]): Unit = {
    val x :Int = 79
    println(x)
    // VALS are immutable
    val aString: String = "Hello ";
    val anotherstring :String = " Goodbye"
    println(aString )
  }


}
object CBNvsCBV extends App{
  def cbv(x:Long): Unit= {
    println("byValue: " + x)
    println("byValue: " + x)
  }
  def cbn (x: => Long): Unit = {
    println("byname: " + x)
    println("byname: " + x)
  }
  cbv(System.nanoTime)
  cbn(System.nanoTime)

}