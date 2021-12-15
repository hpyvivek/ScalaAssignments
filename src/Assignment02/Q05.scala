package Assignment02

object Q05 extends App {
  def replace ( array: Array [Int]) : Array[Int] = {
    val len = array.length
    var max = 0
    for (i <- (len - 1) to 0 by -1 ) {
      if (max < array(i)) {
        max = array(i)
        array(i) = -1
      }
      else {
        array(i) = max
      }
    }
    array
  }

  println(replace(Array(9, 5, 8, 4, -10, 21, 6, 17, 11)).mkString((",") ))
  println(replace(Array(4, 88, -3, 4, -7, 33, 7, 17, 11)).mkString((",") ))
  println(replace(Array(11,2, 8, 3, -8, -7, 8, 17, 11)).mkString((",") ))

}
