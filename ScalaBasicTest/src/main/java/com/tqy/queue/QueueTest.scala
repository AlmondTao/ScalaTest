package com.tqy.queue

import scala.collection.mutable

object QueueTest {

  def main(args: Array[String]): Unit = {
    val que = new mutable.Queue[String]()

    //添加元素
    que.enqueue("1","2","3")

    println(que)

    que += "4"

    println(que)
    println("*************")
    val que2 = que :+ "5"
    println(que)
    println(que2)
    println("*************")

    println(que.dequeue())
    println(que.dequeue())
    println(que.dequeue())


  }


}
