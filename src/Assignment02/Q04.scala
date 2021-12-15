package Assignment02

object Q04 extends App {
  def absoluteValue(list: List[Int]): List[Int] = {
    list.map(math.abs)

  }

  val value = absoluteValue(list = List(-6, 7, -2, 4, -1, -9))
  for (x <- value) {
    println(x)

  }
}

