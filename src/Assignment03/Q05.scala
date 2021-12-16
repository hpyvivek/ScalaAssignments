package Assignment03

object Q05 extends App{
  def conditional[A]( x: A, p : A => Boolean , f: A => A ): A = {
    if (p(x))f(x)
    else x
  }
  val a = conditional[String]( "Hello Scala", _.size<4,_.reverse)
  println(a)

}
