package tests

import Assignment.assignment06
import org.scalatest.funsuite.AnyFunSuite

class test06 extends AnyFunSuite{
  test("noInbeetween"){
    assert(assignment06.numRange(33,77)===false)
  }

}
