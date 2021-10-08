package part1basics

object DefaultArgs extends App {

  def trFacts(n: Int, acc: Int): Int = {
    if (n <= 1) acc
    else trFacts(n - 1, n * acc)
  }


}
