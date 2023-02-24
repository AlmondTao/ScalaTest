package com.tqy.tuple

object TupleTest {

  def main(args: Array[String]): Unit = {
    val tuple:Tuple3[Int,String,Int] = (1, "张三", 30)
    val tuple2 = (1, "张三", 30)
    println(tuple)

    println(tuple._1)
    println(tuple._2)
    println(tuple._3)

    val iterator = tuple.productIterator
    iterator.foreach(println(_))

    println(tuple.productElement(1))

  }

}
