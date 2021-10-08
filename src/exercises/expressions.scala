package exercises

object expressions extends App {
  val x: Int = 1 + 2 //expressions
  println(x)

  println(2 +3 * 4)
  //+-*/ | ^ << >> >>> (right shift with zero extension)

  println (1 == x)
  // ++ != > >=

  println(!(1 == x))
  // ! && ||

  var aVariable = 3
  aVariable += 3
  println(aVariable)

  // if exp
  val aCondition = false
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  print(if(aCondition) 5 else 3)

}
