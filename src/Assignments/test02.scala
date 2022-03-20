package tests
import Assignment.assignment02
import org.scalatest.funsuite.AnyFunSuite

class test02 extends AnyFunSuite {

  test("positionOFString") {
    assert(assignment02.str2("Scala",3)==="Scaa")
    assert(assignment02.str2("Scala",1)==="Sala")
    assert(assignment02.str2("Scala",0)==="cala")

  }

}
