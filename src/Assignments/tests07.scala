package tests

import org.scalatest.funsuite.AnyFunSuite
import Assignment.assignment07
class tests07 extends AnyFunSuite{
  test("happyChar"){
    assert(assignment07.checkChar("happy",'h')===false)
    assert(assignment07.checkChar("happy",'p')===true)

  }

}
