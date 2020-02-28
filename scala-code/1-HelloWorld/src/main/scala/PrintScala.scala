// object vs class
// var vs val

object PrintScala {
  def main(args: Array[String]): Unit = {
    // print number
    var i = 0

    while(i <= 10 ) {
      println(i)
      i += 1
    }
    // print letter
    val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    for ( i <- 0 until(randLetters.length)) {
      println(randLetters(i))
    }

    // print list
    val aList = List(1, "a", 2, "b", 3, "c")
    for (i <- aList) {
      println("List items" + i)
    }
  }
}