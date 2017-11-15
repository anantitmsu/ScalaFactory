

object Iterators {

  def main(args: Array[String]): Unit = {

    val fileList = new java.io.File("C:\\Users\\Anant Goswami\\workspace=scala\\ScalaLearning\\src").listFiles();

    /*
    fileList.foreach(println);
    println("--------------------");
    for (file <- fileList) {
      println(file);
    }
    
    println("----------------FILTER-------------")
    val l = fileList.filter(f => f.getName.endsWith("FileReader.scala"))
    
    l.foreach(println);*/

    for (f <- fileList if (f.isHidden() || f.isFile())) {
      println(f)
    }

  }

}