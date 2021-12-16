package Assignment03

object Q02 extends App {
  val firstNo = util.Random.nextInt
  val secondNo = util.Random.nextInt

  def maximum(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }

  def minimum(x: Int, y: Int): Int = {
    if (x > y) y
    else x
  }

    def nextValue(x: Int, y: Int)= y

    println(maximum(firstNo, secondNo))
    println(minimum(firstNo, secondNo))
    println(nextValue(firstNo, secondNo))



}

