package com.tqy.seq

import scala.collection.mutable.ListBuffer

object ListBufferTest {

  def main(args: Array[String]): Unit = {
    val list1 = ListBuffer(1,2,3,4,5,6)
    val list2 = list1 :+ 7

    println(list1)
    println(list2)

    println("****************")

    list1.append(7)
    println(list1)
  }
}
