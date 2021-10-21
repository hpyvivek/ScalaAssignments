package lectures.part2oop

object selfsolvedpractice extends App {
  println("Create a Scala List:")
  println("Lisp style:")
  val lisp_list = 100 :: 200 :: 300 :: Nil :: 400 :: Nil
  println(lisp_list)
  println("Java style:")
  val nums = List(1,2,3,4,5,6,7)
  println(nums)
  println("Mixed type values in a list:")
  val x = List[Number](100, 200, 110.20, 45d, 0x1)
  println(x)
  println("Range List:")
  val y = List.range(1, 20)
  println(y)
  val z = List.range(0, 30, 3)
  println(z)
  println("Uniform  List:")
  val s = List.fill(5)("Scala")
  println(s)
  val n = List.fill(3)(4)
  println(n)
  println("Tabulate List:")
  val t = List.tabulate(10)(n => n * n * n)
  println(t)
  val p = List.range(0,20)
  println(p)
  val o = List.fill(5)(" HEllo Scala")
  println(o)
   println("---------------------------------")
  import scala.collection.mutable.ListBuffer  //??
  var colors = new ListBuffer[String]()
  println("Add Single element in the said list:")
  colors += "Red"
  colors += "Green"
  colors += "Black"
  println(colors)
  println("Add multiple elements in the said list:")
  colors ++= List("Orange", "Pink", "Black")
  println(colors)
  println("Convert the ListBuffer to a List:")
  val colors_list = colors.toList
  println(colors_list)
  println("Remove one element:")
  colors -= "Red"
  val colors_Nlist = colors.toList
  println(colors_Nlist)


}
