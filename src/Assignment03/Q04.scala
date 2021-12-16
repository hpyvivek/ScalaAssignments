package Assignment03

object Q04 extends App{
  //def fzero[A] (x: A) (f: A => Unit): A = {f(x); x}

  def fzero( x: Int, f:Int=> Unit): Int = {
    f(x) ;x
  }
  fzero(2, i => println(i*10))


}

