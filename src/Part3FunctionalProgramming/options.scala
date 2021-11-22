package Part3FunctionalProgramming

import java.util.Random

object options extends App{
  val myfirstOption : Option[Int] = Some(4)
  val noOption: Option[Int] = None
  println(myfirstOption)

  // work with unsafe APIs
  def unsafeMethod() : String= null
  //val result = Some(unsafeMethod()) //WRONG
  //sOME SHOULD HAVE ALWAYS A VALID VALUE INSIDE
  val result = Option(unsafeMethod())// Some or null
  println(result)
  //( We should never do Null-check ourself- OPTIONS will do that for us

  //chained Methods
  def backupMethod(): String = " A Valid result"
  val chainedResult = Option(unsafeMethod()).orElse(Option(backupMethod()))

  // DESIGN unSafe APIs

  def betterUnsafeMethod(): Option[String] = None
  def betterBackupMethod() : Option[String] = Some("A valid Result")

  val betterChainedResult = betterUnsafeMethod() orElse betterBackupMethod()


  //functions on option
  println(myfirstOption.isEmpty)
  println(myfirstOption.get) // UNSAFE- DO NOT USE IT

  //map, flatMap, filter
  println((myfirstOption.map(_*2 )))
  println(myfirstOption.filter(x => x > 10 ))
  println(myfirstOption.flatMap(x=> Option(x * 10 )))
  /*
  EXERCISES
   */
  val config: Map[String, String] = Map (
    // fetched from elsewhere
    "host" -> "176.45.36.1",
    "port" -> "60"
  )
  class Connection{
    def connect = "Connected" // connect to some server
  }
   object Connection {
     val random = new Random(System.nanoTime())

     def apply ( host: String, port :String) : Option[Connection] =
       if (random.nextBoolean()) Some (new Connection)
       else None

   }
  //try to establish a connection , if so print the


  val host = config.get("host")
  val port = config.get("port")
  /*
    if (h != null)
     if (p!= null)
      return connection.app;y(h,p)

    return null
   */
  val connection = host.flatMap(h => port.flatMap(p=> Connection.apply(h, p )))
  /*
  if (c!= null)
    return c.connect
   */
  val connectionStatus = connection.map(c => c.connect)
  /*if (connectionStatus == null) println(None)
        else print(Some(ConnectionStatus.get))

   */
  println(connectionStatus)
  /*
     if (status != null)
     println(status)
   */
  connectionStatus.foreach(println)

  // chain solution or calls
  config.get("host")
    .flatMap(host => config.get("port")
      .flatMap(port => Connection(host, port))
      .map(connection => connection.connect))
    .foreach(println)

  // for-comprehensions

  val forConnectionStatus = for {
    host <- config.get("host")
    port <- config.get("port")
    connection <- Connection(host, port)
  }
    yield connection.connect
  forConnectionStatus.foreach(println)

}

