import scala.io.Source

object NestedFunction extends App {

  def processFile(filename: String, width: Int) {

    val source = Source.fromFile(filename);

    source.getLines().foreach(line => {

      if (line.length() > width) {
        println(line)
      }

    })

  }

  processFile("C:/Users/Anant Goswami/Desktop/test.txt", 5);

}