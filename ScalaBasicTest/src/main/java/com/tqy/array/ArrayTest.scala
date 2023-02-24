package com.tqy.array
import scala.collection.JavaConverters._
import scala.collection.mutable.ArrayBuffer
class ArrayTest {

}
object ArrayTest extends App {
  override def main(args: Array[String]): Unit ={
    val intArray: Array[Int] = Array(1, 2, 3, 4)
    List(1,2,3).asJava
//    intArray.foldRight()

    val arr1 = Array(1, 2, 3)
    val arr2 = Array(4, 5, 6)

    val arr3 = arr1 :+ 7

    println(arr3.mkString(","))

    println(arr1.mkString(","))

    val arr4 = arr1 ++: arr2

    println(arr4.mkString(","))

    val myMatrix = Array.ofDim[Int](3, 3)





    myMatrix.foreach(list => list.foreach(println(_)))

    val array = for {
      x <- Array.range(1, 4)
    } yield {for {
      y <- Array.range(4, 7)
    } yield  y}

    println(array.mkString(","))
    array.foreach(list => {
      println(list.mkString(","))

    })


    val arr5 = Array.concat(arr1, arr2)

    println(arr5.mkString(","))




  }

}
