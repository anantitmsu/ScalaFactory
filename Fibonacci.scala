

object Fibonacci {

  def main(arg: Array[String]): Unit = {

    // 0,1,1,2,3,5  
    var a: Int = 0
    var b: Int = 1
    var s: Int = 0

    for (x <- 1 to 7) {
      s = a + b
      a = b
      b = s

      print(s + ",")
    }

  }

}