package tests

import Assignment.assignment04
import org.scalatest.funsuite.AnyFunSuite

class test04 extends AnyFunSuite{
  test("stringStartsWithIf"){
    assert(assignment04.str4("If I were PM")=== "If I were PM")
  }

}
