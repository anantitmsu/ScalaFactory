import scala.io.Source

object FileReader {

  def main(args: Array[String]): Unit = {

    val filePath = "C:/Users/Anant Goswami/workspace=scala/ScalaLearning/src/FileReader.scala";
      
    
    val lines = Source.fromFile(filePath).getLines().toList;
    
    lines.foreach(print);
    
    for (line <- Source.fromFile(filePath).getLines()) {
    //  println(line);
    }

  }

}