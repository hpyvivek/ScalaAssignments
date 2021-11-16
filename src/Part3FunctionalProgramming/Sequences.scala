package Part3FunctionalProgramming

import java.util
import scala.util.Random

object Sequences extends App{

  // Seq

  val aSequence = Seq(1,3,2,4)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(2))
  println(aSequence ++ Seq(7,5,6))
  println(aSequence.sorted)

  //Ranges
  val aRange: Seq[Int] = 1 to 10
  aRange.foreach(println)

  (1 to 10 ).foreach(x=> println("Hello Scala"))

  //Lists
  val aList = List(1,2,3)
  val prepended = 42 :: aList
  val prepended1 = 42 +: aList :+ 89
  println(prepended)
  println(prepended1)

  val apples5 = List.fill(5)("apple")
  println(apples5)
  println(apples5.mkString("{", " - ", "}") )

  //Arrays
  var sum = 0
  val numbers = Array(1,2,3,4)
  val threeElements = Array.ofDim[Int](2,2)
  threeElements(0)(0)=1
  threeElements(1)(1)=1
  threeElements(0)(1)=5
  threeElements(1)(0)=6
  threeElements.foreach(x=> {x.foreach(y => sum = sum + y)
  })
  println(sum)


  //mutation
  numbers(2) = 0  // special Syntax sugar for numbers.update(2,0)
  println((numbers.mkString(" ")))

  //Arrays and Seq
  val numbersSeq: Seq[Int] = numbers // implicit conversion ((VVI ADV. Topic))
  println(numbersSeq)

  //vectors
  val vector: Vector[Int] = Vector(1,2,3)
  println(vector)

  //vector vs list

  val maxRuns = 1000
  val maxCapacity = 1000000
  def getWriteTime(collection: Seq[Int]): Double = {
    val r = new Random
    val times = for {
      it <-1 to maxRuns
    } yield {
      val currentTime = System.nanoTime()
      collection.updated(r.nextInt(maxCapacity), r.nextInt() )
      System.nanoTime()- currentTime
    }

    times.sum * 1.0 / maxRuns
  }

  val numbersList = (1 to maxCapacity).toList
  val numbersVector = ( 1 to maxCapacity).toVector

  //keeps ref to tail <---- Advantage
  //updating an element in the middle takes long <--- DisAdv.
   println(getWriteTime((numbersList)))
  // depth of tree is small
  //needs to replace an entire 32-element chunk
  println(getWriteTime(numbersVector))



}
