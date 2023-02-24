package com.tqy.seq

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object ListTest {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4, 5)
    println(list1)

    val list2 = list1 :+ 6

    println(list1)
    println(list2)

    println("*************")

    val list3 = 8 +: list1

    println(list3)

    val nList = List()

    val nil = Nil

    println(nil == nList)

    val list4:List[Int] = 1 :: 2 :: 3 :: Nil

    println(list4)
    println(list4.indexOf(2))
    println("*************")
    val listBuffer = ListBuffer("1", "2", "3")
    val list = List("4", "5", "6")

    val bufferToList = listBuffer.toList
    val listToBuffer = list.toBuffer
    println(bufferToList)
    println(listToBuffer)

    //集合头
//    println("head: "+list1.head)


  }

}
