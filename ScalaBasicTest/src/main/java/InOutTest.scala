import java.io.{File, PrintWriter}

object InOutTest {

  def input : String = {
    println("请输入想要输入文件的文字")
    val str1 = scala.io.StdIn.readLine()
    println(s"文字：${str1}")
    return str1
  }

  def getStrFromFile(filePath:String): String = {
    var source = scala.io.Source.fromFile(filePath);
    val textStr = new StringBuilder
    val lines = source.getLines()
    source.foreach(line =>{
//      println(line)
      textStr.+(line)
    })




    println(s"文件里的内容：${textStr}")
//    lines.foreach(str =>{
//      println(s"文件里的内容：${str}")
//    })

    textStr.toString

  }

  def putStrToFile(filePath:String,inputStr:String):Unit = {
    val writer = new PrintWriter(new File(filePath));

    writer.write(inputStr)
    writer.close()
    println("输入完成")

  }

  def main(args: Array[String]): Unit = {
    val inputStr = input
//    val textStr = getStrFromFile("testFile/input.txt")
    putStrToFile("testFile/input2.txt",inputStr)
  }
}
