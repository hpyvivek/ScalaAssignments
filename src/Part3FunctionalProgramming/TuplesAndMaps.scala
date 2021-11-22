package Part3FunctionalProgramming

object TuplesAndMaps extends App{
    // tuples = finite ordered "lists"

  val aTuple = (2, "hello , Scala") // Tuple2 [Int, String] = (Int , String )

  println(aTuple._1) // o/p = 2
  println(aTuple.copy(_2 = "goodbye Java"))
  println(aTuple.swap) // (" hello , Scala " , 2

  // Maps - Keys --. values
  val aMap : Map[ String, Int ] = Map()

  val phonebook = Map(("Jim ", 555), "Danial" -> 575,("JIM", 9000)).withDefaultValue(-1)
  // a-> b is sugar for (a,b)
  println(phonebook)

  // map ops
  println((phonebook.contains("Jim")))
  println(phonebook("Marry"))

  // add a pairing
  val newPairing = "Marry" -> 8438
  val newPhonebook = phonebook + newPairing
  println("New Phonebook := " + newPhonebook)

  // f(x) on Maps
  //map, flatMap, filter
  val phonebook2 = phonebook.map(x => x._1.toLowerCase -> (x._2 + 2))
  println((phonebook2))

  //filterKeys

  println(phonebook.filter(x=> x._1.startsWith("j") || x._2 >= 557))


  //mapValues

  println(phonebook.mapValues(number => "0455" + number))

  //conversion to other colections
  println((phonebook.toList))
  println(List(("Danial",575)).toMap)
  val names = List ("bob", "Jim" , "James", "angela", "happy")
  println(names.groupBy(names => names.charAt(0)))
  val mapOfNames = names.groupBy(names => names.charAt(0))
  println(mapOfNames.filterKeys(x=> x=='J'))

  /*
  1. what would happen if i had two original entries "Jim" -> 555 & "JIM" -> 555
  2. Overly simplified social network based on maps
     Person = String
     - add a person to the network
     - remove a person
     - friend (mutual)
     - unfriend (mutual )

     - number of friends of a person
     - person with most friends
     - how many person with NO friends
     - if there is a social connection between two people (direct or not)

   */

  def add (network: Map[String, Set[String]], person:String): Map[String, Set[String]]=
    network + (person -> Set())
  def friend(network: Map[String, Set[String]], a:String, b:String ): Map[String, Set[String]]= {
    val friendsA = network(a)
    val friendsB = network(b)

    network + ( a-> (friendsA + b)) + (b-> (friendsB + a))
  }

  def unfriend (network : Map[String, Set[String]], a: String, b: String) : Map[String, Set[String]] ={
    val friendsA = network(a)
    val friendsB = network(b)
     network + ( a -> (friendsA - b)) + (b-> (friendsB - a))
  }

  def remove ( network : Map[String, Set[String]], person: String): Map[String, Set[String]]= {
    def removeAux(friends: Set[String], networkAcc: Map[String, Set[String]]): Map[String, Set[String]] =
      if (friends.isEmpty) networkAcc
      else removeAux(friends.tail, unfriend(networkAcc, person, friends.head))

    val unfriended = removeAux(network(person), network )
    unfriended - person
  }
  val empty: Map[String, Set[String]]= Map()
  val network = add(add(empty, "Bob"),"Mary")
  println(network)
  println((friend(network, "Bob", "Mary")))
  println(unfriend(friend(network, "Bob", "Mary"),"Bob","Mary"))
  println(remove(friend(network, "Bob", "Mary"),"Bob"))

  // Jim , Bob, Mary

  val people = add(add(add(empty, "Bob"), "Mary"), "Jim")
  val jimBob = friend (people ,"Bob", "Jim")
  val testNet = friend (jimBob, "Bob", "Mary")

  println(testNet)

  def nFriends (network:Map[String, Set[String]], person: String): Int =
    if(!network.contains(person)) 0
    else network (person).size

  println(nFriends(testNet,"Bob"))
  println(nFriends(testNet,"Mary"))

  def mostFriends(network: Map[String, Set[String]]): String =
    network.maxBy(pair => pair._2.size)._1

  println((mostFriends(testNet)))

  def nPeopleWithNoFriends(network: Map[String, Set[String]]): Int= {
    //network.filterKeys(k => network(k).isEmpty ).size
    //network.filter(pair =>pair._2.isEmpty).size
    network.count(pair=> pair._2.isEmpty)
    //network.count(_._2.isEmpty)
  }

  println(nPeopleWithNoFriends(testNet))


  def socialConnection(network: Map[String, Set[String]], a: String, b:String) : Boolean = {
    def bfs (target:String, considerPeople: Set[String], discoveredPeople:Set[String]): Boolean = {
      if (discoveredPeople.isEmpty) false
      else {
        val person = discoveredPeople.head
        if (person == target) true
        else if (considerPeople.contains(person)) bfs(target, considerPeople, discoveredPeople.tail)
        else bfs(target, considerPeople + person, discoveredPeople.tail ++ network(person))
      }
    }
    bfs(b, Set(), network(a)+ a)

    }
  println(socialConnection((testNet),"Mary", "Bob"))
  println(socialConnection((testNet),"Jim", "Bob"))



}




