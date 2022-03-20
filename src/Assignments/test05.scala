package tests
import Assignment.assignment05
import org.scalatest.funsuite.AnyFunSuite

class test05 extends AnyFunSuite {
  test("noNearerTo100"){
    assert(assignment05.checkNum(110,130)=== 110)
    assert(assignment05.checkNum(11, 30)=== 30)

  }

}
