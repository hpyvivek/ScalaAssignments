package Part3FunctionalProgramming

object TuplesAndMaps extends App{
    // tuples = finite ordered "lists"

  val aTuple = (2, "hello , Scala") // Tuple2 [Int, String] = (Int , String )

  println(aTuple._1) // o/p = 2
  println(aTuple.copy(_2 = "goodbye Java"))
  println(aTuple.swap) // (" hello , Scala " , 2

  // Maps - Keys --. values
  val aMap : Map[ String, Int ] = Map()

  val phonebook = Map(("Jim ", 555), "Danial" -> 575).withDefaultValue(-1)
  println(phonebook)

  // map ops
  println((phonebook.contains("Jim ")))
  println(phonebook("Marry"))

  // add a pairing
  val newPairing = "MArry" -> 8438
  val newPhonebook = phonebook + newPairing
  println(newPhonebook)

  // f(x) on Maps
  //map, flatMap, filter

  println((phonebook.map(pair => pair._1.toLowerCase -> pair._2)))

  //filterKeys

  println(phonebook.filterKeys(x=> x.startsWith("J")))

  //mapValues

  println(phonebook.mapValues(number => "0455" + number))

  //conversion to other colections
  println((phonebook.toList))
  println(List(("Danial",575)).toMap)
  val names = List ("bob", "James", "angela", "happy")
  println(names.groupBy(names => names.charAt(0)))







}




