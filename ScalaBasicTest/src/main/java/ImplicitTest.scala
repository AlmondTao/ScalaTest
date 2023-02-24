import java.util
import scala.collection.JavaConverters.asScalaBufferConverter

object ImplicitTest {
  type str = java.lang.String
  implicit def int2Str(i:Int) = i.toString
  implicit def ->[T <: Any] (l:java.util.List[T]) =l.asScala.toList
  //  implicit def -> (s:str) = s.
  implicit def -> (l:java.util.ArrayList[str]) =l.asScala.toList


  def main(args: Array[String]): Unit = {

    //    val l = List("1")
    //    test1(l)


    val l = new util.ArrayList[str]()
    l.add("1")
    test1(l)
    //    test2(1)

  }

  def test1(l:List[Any]): Unit ={
    println(l)
  }

  def test2(s:str): Unit ={
    println(s)
  }




}
