package Assignment02

object Q06 extends App {
  def sortArray1(array: Array[Int]): Array[Int] = {
    array.sorted
  }

  val array1 = Array(-7,1,9,8,-2)
  val sortedArray1:Array[Int] = sortArray1(array1)
  sortedArray1.foreach(println)
  val sortedSize = sortedArray1.length
  var maxNo = sortedArray1(sortedSize-1)
  var secMaxNo = sortedArray1(sortedSize-2)
  val finalProduct = maxNo*secMaxNo
  println(s"Product of two higher values is : - $finalProduct ")

}
