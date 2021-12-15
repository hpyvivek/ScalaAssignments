package Assignment02

object Q07 extends App{
  def maxDiff(arr:Array[Int]):Int = {
    var maxDiff = 0
    val len = arr.length
    for(i <- 0 to len-1){
      for(j <- i+1 to len-1){
        if(arr(i)<arr(j) && (arr(i)-arr(j)).abs>maxDiff) maxDiff = (arr(i)-arr(j)).abs
      }
    }
    maxDiff
  }
  println ( " max difference is := ")

  println(maxDiff(Array(5,-4,6,7,11,-3)))

}
