package exercises

abstract class MyList {

  /*
  method head = first element of list
  tail = remainder of the list
  isEmpty = is this list empty
  add(int) = new list with this element added
  override toString = a string representation of the list

   */

  def head : Int
  def tail : MyList
  def isEmpty : Boolean
  def add(element: Int): MyList

}
