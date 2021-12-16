package Assignment03

object Q01 extends App {
  def maxNo(a:Int, b: Int ): Int = {
    if(a > b) a
    else b
  }
  def maxInTuple(t : ( Int, Int, Int ), func: (Int, Int)=> Int) : Int  = {
    func(t._1, func(t._2, t._3))
  }
  println(maxInTuple((33,2,66), maxNo))
  }



