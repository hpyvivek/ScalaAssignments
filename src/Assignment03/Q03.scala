package Assignment03

object Q03 extends App{
  def product ( x: Int ): Int = {
    x*3
  }
  def func( x:Int , func2 : (Int => Int )): Int  = {
    func2(x)
  }
    println(func(9, product))


}
