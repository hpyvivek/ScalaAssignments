package Assignment02

//import Assignment02.Q03.list

object Q03 extends App {
  def count(list: List[Int]): Int = {
    list.indexOf(list.last) + 1

  }
  println(count(List(5, 3, 6, 9, 2, 5, 0, 1)))
  println(count(List(6, 9, 2, 66)))


}
