package Assignment02

object Q01 extends App {
  def newList(times: Int, list: List[Int]): List[Int] =
    list.flatMap(List.fill(times)(_))


  val result = newList(3, List(1, 2, 3, 4))
  for (x <- result)
    println(x)


}
