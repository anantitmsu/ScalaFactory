

object Chap1 {
  def main(args: Array[String]) = {
    val map = Map("anant" -> "Goswami", "raj" -> "shah", "hasnen" -> "laxmidhar");

    for ((k, v) <- map) {
      println(k + " - " + v)
    }

    map.foreach(f => println(f._2))

    def factorial(n: BigInt): BigInt = {
      if (n == 0) 1 else n * factorial(n - 1)

    }

    println(factorial(30))

    println(1.+(2))

    val array = new Array[String](6);
    array(0) = "Zero";
    array(1) = "First"
    array(2) = "Second"
    array(3) = "Third"
    array(5) = "Fifth"

    println(array.apply(1))
    // array.foreach(println)
    println(donotreturn())
    println(doreturn())
    
  }

   def donotreturn() { "Nothing will be returned" }
   def doreturn() = { "Something will be returned" }

}