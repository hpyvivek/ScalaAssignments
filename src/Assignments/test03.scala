package tests
import Assignment.assignment03
import org.scalatest.funsuite.AnyFunSuite

class test03 extends AnyFunSuite{
  test("charAdded"){
    assert(assignment03.str3("scala")==="ascalaa")
    assert(assignment03.str3("hello")==="ohelloo")
  }

}
