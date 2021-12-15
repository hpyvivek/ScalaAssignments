package Assignment02

import scala.collection.mutable.ListBuffer

object Q02 extends App{
  val list = List(3, 5, 7, 2, 4, 7, 4, 5, 9, 11)

  val list3 = new ListBuffer[Int]


  for (x <- 1 to list.length) {
    if (x % 2 != 0) {
      list3 += list(x)
    }
    println(list3)

  }

}
